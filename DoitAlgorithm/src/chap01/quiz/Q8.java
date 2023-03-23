package chap01.quiz;

import java.util.Scanner;

public class Q8 {
    static int intOf(int a, int b) {
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }

        int sum = 0; // 총합
        for (int i = a; i <= b; i++)
            sum += i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a, b;

        System.out.println("a부터 b까지의 합을 구합니다.");
        System.out.print("a의 값: "); a = stdIn.nextInt();
        System.out.print("b의 값: "); b = stdIn.nextInt();
        int sum = intOf(a, b);

        System.out.println(a + "부터 " + b + " 까지의 합은 " + sum + " 입니다.");
    }
}
