package chap_06;

public class _05_Overloading {
    public static int getPower(int number) { // 매개변수(전달값, Parameter) : int 형
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber) { // 매개변수 : String 형
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메서드 오버라이딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 개수가 다르거나
        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27
    }
}
