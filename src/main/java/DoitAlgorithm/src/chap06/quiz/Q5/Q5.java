// 버블 정렬(버전 1)

package chap06.quiz.Q5;

import java.util.Scanner;

public class Q5 {
    // a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 양방향 버블 정렬(== 셰이커 정렬) (버전 3 개선)
    static void bubbleSort(int[] a, int n) {
        int k = 0; // a[k]보다 앞쪽은 정렬을 마친 상태
        int passCnt = 0;
        while(k < n - 1) {
            ++passCnt;
            int last = n - 1; // 마지막으로 요소를 교환한 위치
            // 홀수 패스는 가장 작은값 -> 맨 앞, 짝수 패스는 가장 큰 값 -> 맨 뒤
            if (passCnt % 2 != 0) {
                for (int j = n - 1; j > k; j--) {
                    if (a[j - 1] > a[j]) {
                        swap(a, j - 1, j);
                        last = j;
                    }
                }
            } else {
                for (int j = k + 1; j < n ; j++) {
                    if (a[j - 1] > a[j]) {
                        swap(a, j - 1, j);
                        last = j;
                    }
                }
            }
                k = last;
        }
        System.out.println(passCnt);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("양방향 버블 정렬");
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
