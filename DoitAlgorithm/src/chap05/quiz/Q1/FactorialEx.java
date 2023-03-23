package chap05.quiz.Q1;

import java.util.Scanner;

public class FactorialEx {
    static int factorial(int a) {
        int fact = 1;
        for (int i = a; i > 1; i --) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int integer = stdIn.nextInt();

        System.out.println(integer + "의 팩토리얼 값은 " + factorial(integer) + "입니다.");
    }
}
