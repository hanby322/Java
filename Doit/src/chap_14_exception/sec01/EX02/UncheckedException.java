package chap_14_exception.sec01.EX02;

class A {}
class B extends A {}
public class UncheckedException {
    public static void main(String[] args) {
        // UncheckedException = RuntimeException(실행 예외) -> 컴파일 할 수는 있지만 실행 시 바로 오류 출력

        // 1. ArithmeticException (산수 예외)
        System.out.println(3 / 0);

        // 2. ClassCastException (다운 캐스팅이 불가능 할 때)
        A a = new A();
        B b = (B)a;

        // 3. ArrayIndexOutOfBoundsException
        int[] array = {1, 2, 3};
        System.out.println(array[3]);

        // 4. NumberFormatException
        int num = Integer.parseInt("10!");

        // 5. NullPointerException
        String str = null;
        System.out.println(str.charAt(2));
    }
}
