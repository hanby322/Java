package chap01.quiz;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner strIn = new Scanner(System.in);
        int a, b;
        System.out.print("a값: ");
        a = strIn.nextInt();
        do {
            System.out.print("b값: ");
            b = strIn.nextInt();
            if (b <= a)
                System.out.println("a보다 큰 값을 입력하세요!");
        } while (b <= a);

        System.out.println("b - a는 " + (b - a) + "입니다.");
    }
}
