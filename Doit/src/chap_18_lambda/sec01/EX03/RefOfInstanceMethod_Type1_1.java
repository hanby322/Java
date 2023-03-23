package chap_18_lambda.sec01.EX03;

interface A {
    void abc();
}
class B {
    void bcd() {
        System.out.println("메서드");
    }
}

public class RefOfInstanceMethod_Type1_1 {
    public static void main(String[] args) {
        // 1. 익명 이너 클래스
        A a1 = new A() {
            @Override
            public void abc() {
                B b = new B();
                b.bcd();
            }
        };
        // 2. 람다식으로 표현
        A a2 = () -> {
            B b = new B();
            b.bcd();
        };
        // 3. 정의된 인스턴스 메서드 참조
        B b = new B();
        A a3 = b::bcd; // A 인터페이스의 abc() 메서드는 B 클래스의 bcd() 메서드와 같다는 의미
        a1.abc();
        a2.abc();
        a3.abc();
    }
}
