package chap_13_innerClassAndInnerInstance.sec04.EX02;

class A {
    C c = new C() {
        public void bcd() {
            System.out.println("익명 이너 클래스");
        }
    };
    void abc() {
        c.bcd();
    }
}
interface C {
    public abstract void bcd();
}
public class AnonymousClass_2 {
    public static void main(String[] args) {
        A a = new A();
        a.abc();
    }
}
