package chap02.quiz;

import java.util.Arrays;

public class Q4 {
    static void copy(int[] a, int[] b) { //배ㅕㅇㄹ b의 모든 요소를 배열 a에 복사하는 메서드
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[] {1, 2, 8, 4, 5};

        copy(a, b);

        System.out.println("배열 a: " + Arrays.toString(a)+ System.lineSeparator() + "배열 b: " + Arrays.toString(b));

    }
}
