// 도수 정렬

package chap06.quiz.Q17;

import java.util.Scanner;

public class CountingSortX {
    // 도수 정렬(0 이상 max 이하의 값을 입력)
    static void countingSort(int[] a, int n, int max) {
        int[] f = new int[max + 1]; // 누적 도수
        int[] b = new int[n]; // 작업용 목표 배열

        System.out.println("1단계: ");
        for (int i = 0; i < n; i++){ // 1단계
            f[a[i]]++;
            System.out.print("f = {");
            for (int j = 0; j < max + 1; j++) {
                System.out.print(f[j] + " ");
            }
            System.out.print("}\n");
        }

        System.out.println();
        System.out.println("2단계: ");
        for (int i = 1; i <= max; i++) { // 2단계
            f[i] += f[i - 1];
            System.out.print("f = {");
            for (int j = 0; j < max + 1; j++) {
                System.out.print(f[j] + " ");
            }
            System.out.print("}\n");
        }

        System.out.println();
        System.out.println("3단계: ");
        for (int i = n - 1; i >= 0; i--) { // 3단계
            b[--f[a[i]]] = a[i];
            System.out.print("b = {");
            for (int j = 0; j < n; j++) {
                System.out.print(b[j] + " ");
            }
            System.out.print("}\n");
        }

        System.out.println();
        System.out.println("4단계: ");
        for (int i = 0; i < n; i++) { // 4단계
            a[i] = b[i];
            System.out.print("a = {");
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.print("}\n");
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("도수 정렬");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = stdIn.nextInt();
            } while (x[i] < 0);
        }

        int max = x[0]; // 배열 의 최댓값을 구하여 max에 대입합니다.
        for (int i = 1; i < nx; i++)
            if (x[i] > max) max = x[i];

        countingSort(x, nx, max); // 배열 x를 도수 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
