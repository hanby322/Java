package chap01.quiz;

import java.util.Scanner;

public class Q15 {
    static void spira(int n) {
        for (int i = 1; i <= n; i++) { // n단 피라미드 출력
            for (int j = 0; j < n - i; j++)  // '*' 앞의 공백 형성
                System.out.print(" ");
            for (int j = 0; j < (2 * i) - 1; j++)
                System.out.print('*');
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("피라미드를 출력합니다.");

        do {
            System.out.print("단수는  : ");
            n = stdIn.nextInt();
        } while (n <= 0);
        spira(n);
    }
}
