package chap_18_lambda.sec01.EX10;

interface A {
    B abc(int k);
}
class B {
    B() {
        System.out.println("첫 번째 생성자");
    }
    B(int k) {
        System.out.println("두 번째 생성자");
    }
}
public class RefOfClassConstructor_2 {
    public static void main(String[] args) {
        // 1. 익명 이너 클래스
        A a1 = new A() {
            @Override
            public B abc(int k) {
                return new B(3);
            }
        };
        // 2. 람다식
        A a2 = (int k) -> new B(3);
        // 3. 클래스 생성자 참조
        A a3 = B::new;
        a1.abc(4);
        a2.abc(4);
        a3.abc(4);
    }
}
