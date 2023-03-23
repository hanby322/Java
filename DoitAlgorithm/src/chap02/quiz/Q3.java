package chap02.quiz;

import java.util.Arrays;
public class Q3 {
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int sumOfArray = sumOf(array);
        System.out.println("배열의 합: " + sumOfArray);
    }
}
