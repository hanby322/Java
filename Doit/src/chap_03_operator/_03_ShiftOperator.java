package chap_03_operator;

public class _03_ShiftOperator {
    public static void main(String[] args) {
        // 산술 시프트
        //@ <<
        System.out.println(3 << 1); // 6
        System.out.println(-3 << 1); //  -6
        System.out.println(3 << 2); // 12
        System.out.println(-3 << 2); // -12
        System.out.println();

        // @ >>
        System.out.println(5 >> 1); // 2
        System.out.println(-5 >> 1); // -3
        System.out.println(5 >> 2); // 1
        System.out.println(-5 >> 2); // -2
        System.out.println();

        // 논리 시프트(>>>)
        System.out.println(3 >>> 1); // 1
        System.out.println(-3 >>> 31); // 1
    }
}
