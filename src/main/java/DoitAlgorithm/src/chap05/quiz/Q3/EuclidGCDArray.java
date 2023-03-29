package chap05.quiz.Q3;

import java.util.Scanner;

public class EuclidGCDArray {
    static int gcd(int x, int y) {
        if (x == 0)
            return y;
        else
           return gcd(y%x, x);
    }

    static int gcdArray(int[] a , int start, int no) {
        if (no == 1)
            return a[start];
        else if (no == 2)
            return gcd(start, start + 1);
        else
            return gcd(a[start], gcdArray(a, start + 1, no - 1 ));
    }
}
