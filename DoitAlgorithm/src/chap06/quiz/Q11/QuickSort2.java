// 퀵 정렬

package chap06.quiz.Q11;

import chap04.IntStack;

import java.util.Scanner;

public class QuickSort2 {

    // 배열 요소 a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 퀵 정렬
    static void quickSort(int[] a, int left, int right) {
        // 스택의 생성
        IntStack lstack = new IntStack(right - left + 1);
        IntStack rstack = new IntStack(right - left + 1);

        lstack.push(left);
        System.out.println("lstack에 " + left + "을 푸시");
        rstack.push(right);
        System.out.println("rstack에 " + right + "을 푸시");

        while (lstack.isEmpty() != true) {
            int pl = left = lstack.pop(); // 왼쪽 커서
            System.out.println("pl에 lstack의 " + pl + "을 팝");
            int pr = right = rstack.pop(); // 왼쪽 커서
            System.out.println("pr에 rstack의 " + pr + "을 팝");
            int x = a[(left + right) / 2]; // 피벗(가운데 요소)

            do {
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr--;
                if (pl <= pr)
                    swap(a, pl++, pr--);
            } while(pl <= pr);

            if (left < pr) {
                lstack.push(left); // 왼쪽 그룹 범위의
                System.out.println("lstack에 " + left + "을 푸시");
                rstack.push(pr); // 인덱스를 푸시
                System.out.println("rstack에 " + pr + "을 푸시");
            }
            if (pl < right) {
                lstack.push(pl); // 오른쪽 그룹 범위의
                System.out.println("lstack에 " + pl + "을 푸시");
                rstack.push(right); // 인덱스를 푸시
                System.out.println("lstack에 " + right + "을 푸시");
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("배열을 나눕니다.");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        quickSort(x, 0, nx - 1); // 배열 x를 퀵 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
