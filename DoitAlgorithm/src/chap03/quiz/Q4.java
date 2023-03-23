package chap03.quiz;

import java.util.Scanner;

public class Q4 {
    static int BinSearch(int[] a, int n, int key) {

        System.out.print("   |");
        for (int i = 0; i < n; i++)
            System.out.printf("%3d", i);

        System.out.println();
        System.out.print("---+" + "---".repeat(n) + '\n');

        int pl = 0;
        int pr = n - 1;
        int pc = (pl + pr) /2;
        int i = 0;

        /////////////////// 검색 소스 ///////////////////////
        for (i = 0; pl < pr; i++) {
            System.out.print("   | ");
            System.out.print("   ".repeat(pl) + "<-" + "   ".repeat(pc - pl) + " + " + "   ".repeat(pr - pc) + "->");
            System.out.printf('\n' + "%3d|", i);
            for (int j = 0; j < n; j++)
                System.out.printf("%3d", a[j]);

            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
                pc = (pl + pr) / 2;
            } else {
                pr = pc - 1;
                pc = (pl + pr) / 2;
            }
            System.out.println();
            System.out.println("   |");
        }
        /////////////////// 검색 소스 ///////////////////////
        return -1; // 찾고자 하는 값이 없을 때 -1 리턴
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

        int idx = BinSearch(x, num, ky);
        System.out.println();

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "는 x[" + idx + "]에 있습니다.");

    }
}
