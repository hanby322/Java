package chap03.quiz;

import java.util.Scanner;

public class Q2 {
    static int SeqSearch(int[] a, int n, int ky) {

        System.out.print("   |");
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.print("---+" + "---".repeat(n) + '\n');

        // 검색 소스
        int i = 0;
        for (i = 0; i < n; i++) {
            System.out.printf("   |  "+ "   ".repeat(i) + "*" + '\n' + "%3d|", i);
            for (int j = 0; j < n; j++)
                System.out.printf("%3d", a[j]);

            if (a[i] == ky)
                return i;
            System.out.println();
            System.out.println("   |");
        }
        return -1;
        // 검색 소스
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x =  new int[num];

        int i = 0;
        do {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
            i++;
        } while(i != num);

        System.out.print("검색할 값: ");
        int ky = stdIn.nextInt();

        int idx = SeqSearch(x, num, ky);
        System.out.println();

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");

    }
}
