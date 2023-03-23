package chap04.quiz;

import chap04.IntStack;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64); // 최대 64개를 푸시할 수 있는 스택

        while (true) {
            System.out.println(); // 메뉴 구분을 위한 빈 행 추가
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.println("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 인덱스 찾기");
            System.out.print("(6) 비움 확인 (7) 꽉참 확인 (8) 클리어 (0) 종료:");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1: // 푸시
                    System.out.print("데이터: ");
                    x = stdIn.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverFlowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2: // 팝
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3: // 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4: // 덤프
                    s.dump();
                    break;

                case 5: // 인덱스 찾기
                    System.out.print("찾을 값(인덱스 반환): ");
                    x = stdIn.nextInt();
                    int temp = s.indexOf(x);
                    try {
                        if (temp < 0)
                            System.out.println("해당 값을 찾을 수 없습니다.");
                        else
                            System.out.println(x + "는 s[" + temp + "]에 있습니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 6: // 비움 확인
                      if (s.isEmpty() == false)
                          System.out.println("스택이 비어있지 않습니다.");
                      else
                          System.out.println("스택이 비어있습니다.");
                      break;

                case 7: // 꽉참 확인
                    if (s.isFull() == false)
                        System.out.println("스택이 꽉 차있지 않습니다.");
                    else
                        System.out.println("스택이 꽉 차있습니다.");
                    break;

                case 8: // 클리어
                    s.clear();
                    System.out.println("스택이 초기화되었습니다.");
                    break;
            }
        }
    }
}
