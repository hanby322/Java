package chap06.myEx;

import java.util.Scanner;

public class HanSort {

    // a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static int shellSort(int[] a, int n) {
        int f = n / 2;
        int temp;
        int count = 0;

        // a 배열을 보다 간결하게 변경
        while(f > 1) {
            count++;
            for (int j = 0; j < f; j++) {
                if (a[j] > a[j + f])
                    swap(a, j, j + f);
            }
            f /= 2;
        }
        // 단순 삽입 정렬
        for (int i = 1; i < n; i++) {
            count++;
            int j;
            int tmp = a[i];
            for (j = i; j > 0 && a[j - 1] > tmp; j--) {
                count++;
                a[j] = a[j - 1];
            }
            a[j] = tmp;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        int count = shellSort(x, nx); // 배열 x를 단순 삽입 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "] = " + x[i]);

        System.out.println("총 실행 횟수: " + count);
    }
}
