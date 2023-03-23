package chap05.quiz.Q2;

import java.util.Scanner;

public class EuclidGCDEx {

    static int gcd(int x, int y) {
        int gcd = 1;
        for(int i = (x < y ? x : y); i > 1; i--) {
            if(x % i == 0 && y % i == 0) {
                x /= i;
                y /= i;
                gcd *= i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("최대공약수를 구할 정수 두 개 를 입력해주세요.");
        System.out.print("첫 번째 정수: ");
        int x = stdIn.nextInt();
        System.out.print("두 번째 정수: ");
        int y = stdIn.nextInt();

        int gcd = gcd(x, y);

        System.out.println("입력한 두 정수의 최대공약수는 " + gcd + "입니다.");
    }
}
