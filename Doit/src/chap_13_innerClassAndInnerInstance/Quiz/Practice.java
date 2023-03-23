package chap_13_innerClassAndInnerInstance.Quiz;

class A {
    interface B {
        static void bcd() {
            System.out.println("이너 인터페이스 내 static 메서드");
        }
    }
    void abc() {
        System.out.println("A 클래스 내 static 메서드");
    }
}
public class Practice {
    public static void main(String[] args) {
        A a = new A();
//        A.B ab = new A.B();
//        ab.bcd();
        A.B.bcd();
        a.abc();
    }
}
