package chap03.quiz;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    static int searchIdx(int[] a, int n, int key, int[] idx) {

        int j = 0;
        for (int i = 0; i < n; i++) {

            if (a[i] == key) {
              idx[j] = i;
              j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();

        int[] x = new int[num];
        int[] idx = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값: ");
        int key = stdIn.nextInt();

        int idxCount = searchIdx(x, num, key, idx);

        if (idxCount == 0)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.print(key + "는 ");
        for (int i = 0; i < num; i++) {
            if (idx[i] == 0)
                break;
            else
                System.out.print("x[" + idx[i] + "], ");
        }
        System.out.println("에 있고 총 " + idxCount + "개 있습니다.");
    }
}
