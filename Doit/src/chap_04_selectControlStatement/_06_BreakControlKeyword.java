package chap_04_selectControlStatement;

public class _06_BreakControlKeyword {
    public static void main(String[] args) {
        // 단일 반복문 탈출
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            break;
        }

        for (int i = 0; i < 10; i++) {
            if(i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // 다중 반복문 탈출
        // @1개의 반복문만 탈출할 때
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j == 2) {
                    break;
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();

        // @break + Label 문(개발자 임의로 지정 가능)으로 다중 반복문 탈출
        POS1:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j == 2) {
                    break POS1;
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();

        // @변숫값을 조정해 다중 반복문 탈출
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j == 2) {
                    i = 100; //첫 번째 for 문을 탈출 하기 위해 변숫값을 크게 지정
                    break;
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();
    }
}
