package chap01.quiz;

import java.util.Scanner;
public class Q4 {
    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a > c)
                return c;
            else
                return a;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a, b, c;

        System.out.println("세 정수의 중간값을 구합니다.");
        System.out.print("a의 값 : "); a = stdIn.nextInt();
        System.out.print("b의 값 : "); b = stdIn.nextInt();
        System.out.print("c의 값 : "); c = stdIn.nextInt();
        int med = med3(a, b, c);

        System.out.println("중간값은 " + med + "입니다.");
    }
}
