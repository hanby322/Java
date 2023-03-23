package chap02.quiz;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int VMAX = 21;
        int[] vdist = new int[VMAX];
        Scanner stdIn = new Scanner(System.in);
        double vision;

        do {
            System.out.print("시력을 입력해주세요(-1입력시 입력 종료): ");
            vision = stdIn.nextDouble();
            if (vision >= 0 && 2 >= vision)
                vdist[(int) (vision * 10)]++;
            else if (vision == -1) ;
            else
                System.out.println("0.0 ~ 2.0 값만 입력해주세요.");
        } while(!(vision == -1));

        System.out.println(" == 입력한 시력 분포 == ");
        for (int i = 0; i < vdist.length; i++) {
            System.out.printf("%2.1f~:", (i / 10.0)).printf("*".repeat(vdist[i]));
            System.out.println();
        }
    }
}
