package chap01.quiz;

public class Q2 {
    static int min3(int a, int b, int c) {
        int min = 3;
        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    public static void main(String[] args) {
        System.out.println("min(8, 4, 1) = " + min3(8,4,1));
    }
}
