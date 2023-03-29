// 재귀 함수 이해

package chap05;

import java.util.Scanner;

public class Recur {
    static int counter = 0;

    // 재귀 함수
    static void recur(int n) {
        counter++;
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int x = stdIn.nextInt();

        recur(x);
        System.out.println("총 실행 횟수: " + Recur.counter);
    }
}
