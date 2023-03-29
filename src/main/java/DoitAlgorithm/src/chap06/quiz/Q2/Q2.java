// 버블 정렬(버전 1)

package chap06.quiz.Q2;

import java.util.Scanner;

public class Q2 {
    // a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 버블 정렬
    static void bubbleSort(int[] a, int n) {
        boolean flag;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("패스 " + (i + 1));
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    flag = true;
                } else
                    flag = false;
                for (int k = 0; k < n ; k++) {
                    if (k == j)
                        System.out.print(flag == true ? "+" : "-");
                    System.out.printf("%-2d", a[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블 정렬(버전 1)");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        bubbleSort(x, nx); // 배열 x를 버블 정렬

    }
}
