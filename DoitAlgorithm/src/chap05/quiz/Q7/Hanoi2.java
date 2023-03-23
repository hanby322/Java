// 하노이의 탑

package chap05.quiz.Q7;

import java.util.Scanner;

public class Hanoi2 {
    // no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
    static String[] name = {"A 기둥", "B 기둥", "C 기둥"};

    //--- 원반을 x기둥에서 y기둥으로 이동 ---//
    static void move(int no, int x, int y) {
        if (no > 1)
            move(no - 1, x, 6 - x - y);

        System.out.println("원반[" + no + "]을 " + name[x - 1] + "에서 " + name[y - 1] + "으로 이동");

        if (no > 1)
            move(no - 1, 6 - x - y, y);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수: ");
        int n = stdIn.nextInt();

        move(n, 1, 3); // 1번 기둥에 쌓인 n개의 원반을 3번 기둥으로 옮김
    }
}

