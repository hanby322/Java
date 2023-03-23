// 체인법에 의한 해시의 사용 예

package chap10;

import chap09.BinTreeTester;

import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class ChainHashTester {
    static Scanner stdIn = new Scanner(System.in);

    // 데이터(회원번호 + 이름)
    static class Data {
        static final int NO = 1; // 번호 입력받기
        static final int NAME = 2; // 이름 입력받기

        private Integer no; // 회원번호(키값)
        private String name; // 이름

        // 키값
        Integer keyCode() {
            return no;
        }

        // 문자열 출력을 반환
        @Override
        public String toString() {
            return name;
        }

        // 데이터를 입력
        void scanData(String guide, int sw) {
            System.out.println(guide + "할 데이터를 입력하세요.");

            if ((sw & NO) == NO) {
                System.out.print("번호: ");
                no = stdIn.nextInt();
            }
            if ((sw & NAME) == NAME) {
                System.out.print("이름: ");
                name = stdIn.next();
            }
        }
    }

    // 메뉴 열거형
    enum Menu {
        ADD("추가"),
        REMOVE("삭제"),
        SEARCH("검색"),
        DUMP("출력"),
        TERMINATE("종료");

        private final String message; // 출력할 문자열

        static Menu MenuAt(int idx) { // 서수가 idx인 열거를 반환
            for (Menu m: Menu.values())
                if (m.ordinal() == idx)
                    return m;
            return null;
        }

        Menu(String string) { // 생성자
            message = string;
        }

        String getMessage() {
            return message;
        }
    }

    // 메뉴 선택
    static Menu SelectMenu() {
        int key;
        do {
            for (Menu m: Menu.values())
                System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
            System.out.print(" : ");
            key = stdIn.nextInt();
        } while(key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());

        return Menu.MenuAt(key);
    }

    public static void main(String[] args) {
        Menu menu; // 메뉴
        Data data; // 추가용 데이터 참조
        Data temp = new Data(); // 입력용 데이터

        ChainHash<Integer, Data> hash = new ChainHash<>(13);

        do {
            switch (menu = SelectMenu()) {
                case ADD: // 추가
                    data = new Data();
                    data.scanData("추가", Data.NO | Data.NAME);
                    hash.add(data.keyCode(), data);
                    break;

                case REMOVE: // 삭제
                    temp.scanData("삭제", Data.NO);
                    hash.remove(temp.keyCode());
                    break;

                case SEARCH: // 검색
                    temp.scanData("검색", Data.NO);
                    Data ptr = hash.search(temp.keyCode());
                    if (ptr != null)
                        System.out.println("그 키를 갖는 데이터는 " + ptr + "입니다.");
                    else
                        System.out.println("해당 데이터가 없습니다.");
                    break;

                case DUMP: // 출력
                    hash.dump();
                    break;
            }
        }while (menu != Menu.TERMINATE);
    }
}
