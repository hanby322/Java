package chap_12_abstractClassAndInterface.sec02.EX07;

interface A {
    default void abc() {
        System.out.println("A 인터페이스의 abc()");
    }
}
class B implements A {
    public void abc() {
        A.super.abc(); // 부모 인터페이스 A의 abc() 메서드 호출
        System.out.println("B 클래스의 abc()");
    }
}
public class DefaultMethod_2 {
    public static void main(String[] args) {
        //객체 생성
        B b = new B();

        // 메서드 호출
        b.abc();
    }
}
