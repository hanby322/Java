package chap_06;

public class _02_Parameter {
    // 전달값이 있는 메소드
    public static void power(int number) { // Parameter, 매개변수
        int result = number * number; // 매개변수의 제곱 결과 저장
        System.out.println(number + " 의 제곱은 " + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의" + exponent + " 제곱은 " + result);
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        power(2); // 2 * 2 = 4
        power(3); // 3 * 3 = 9

        powerByExp(2, 3);
        powerByExp(3, 3);
        powerByExp(4, 5);
    }
}
