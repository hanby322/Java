package chap02.quiz;

import java.util.Scanner;
public class Q6 {
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while(!(x == 0));

        for (int i = 0; i < digits / 2; i++) {
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no; // 변환하는 정수
        int cd; // 기수
        int dno; // 변환 후의 자릿수
        char[] cno = new char[36];

        System.out.println("10진수를 기수 변환합니다.");
        do {
            System.out.print("변환하는 음이 아닌 정수: ");
            no = stdIn.nextInt();
        } while (!(no > 0));

        do {
            System.out.print("어떤 진수로 변환할까요? (2~36): ");
            cd = stdIn.nextInt();
        } while (!(2 <= cd & 36 >= cd));

        dno = cardConv(no, cd, cno);
        System.out.println();
        System.out.println(cd + "|      " + no);
        System.out.println("+ --------");
        for (int i = 0; i < dno - 1; i++) {
            System.out.println(cd + "|      " + (no / cd) + "..." + cno[dno - i - 1]);
            System.out.println("+ --------");
            no /= cd;
        }
        System.out.println("        " + (no / cd) + "..." + cno[0]);

        System.out.print(cd + "진수로 " );
        for (int i = 0; i < dno; i++) {
            System.out.print(cno[i]);
        }
        System.out.println("입니다.");
    }
}
