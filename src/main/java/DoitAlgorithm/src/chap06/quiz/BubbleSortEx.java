// 버블 정렬(버전 1)

package chap06.quiz;

import java.util.Scanner;

public class BubbleSortEx {
    // a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 버블 정렬
    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++)
                if (a[j - 1] > a[j])
                    swap(a, j - 1 , j);
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
        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}