// 하노이의 탑

package chap05;

import java.util.Scanner;

public class Hanoi {
    // no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
    /*static void move(int no, int from, int to) {
        if (no > 1)
            move(no - 1, from, 6 - from - to);

        System.out.printf("원반[%d]을(를) %d번 기둥에서 %d번 기둥으로 옮김\n", no, from, to);

        if (no > 1)
            move(no - 1, 6 - from - to, to);
    }*/
    static void move(int n, int from, int to) {
        if (n > 0) {
            move(n - 1, from, 6 - from - to);
            System.out.println(n + "번째 블록을" + from + "에서" + to + "로 옮깁니다.");
            move(n - 1, 6 - from - to, to);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수: ");
        int n = stdIn.nextInt();

        move(n, 1, 3); // 1번 기둥에 쌓인 n개의 원반을 3번 기둥으로 옮김
    }
}
