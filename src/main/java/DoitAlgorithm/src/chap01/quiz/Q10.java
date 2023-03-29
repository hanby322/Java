package chap01.quiz;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a;

        do {
            System.out.println("양의 정수를 입력하세요.");
            a = stdIn.nextInt();
        } while (a <= 0 );

        String str_a = Integer.toString(a);
        System.out.println(str_a);

        System.out.println(a + "의 자릿수는 " + str_a.length() + "입니다.");
    }
}
