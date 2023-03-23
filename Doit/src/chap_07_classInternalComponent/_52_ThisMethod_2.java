package chap_07_classInternalComponent;

class A52 {
    int m1, m2, m3, m4;
    A52() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    A52(int a) {
        m1 = a;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    A52(int a, int b) {
        m1 = a;
        m2 = b;
        m3 = 3;
        m4 = 4;
    }
    void print() {
        System.out.print(m1 + " ");
        System.out.print(m2 + " ");
        System.out.print(m3 + " ");
        System.out.print(m4);
        System.out.println();
    }
}
class B52 {
    int m1, m2, m3, m4;
    B52() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    B52(int a) {
        this();
        m1 = a;
    }
    B52(int a, int b) {
        this(a);
        m2 = b;
    }
    /*
    B52(int a, int b) {
        this();
        m1 = a;
        m2 = b;
    }
    */
    void print() {
        System.out.print(m1 + " ");
        System.out.print(m2 + " ");
        System.out.print(m3 + " ");
        System.out.print(m4);
        System.out.println();
    }
}
public class _52_ThisMethod_2 {
    public static void main(String[] args) {
        // 3가지 객체 생성(this() 미사용)
        A52 a1 = new A52();
        A52 a2 = new A52(10);
        A52 a3 = new A52(10, 20);
        a1.print();
        a2.print();
        a3.print();
        System.out.println();

        // 3가지 객체 생성(this() 사용)
        B52 b1 = new B52();
        B52 b2 = new B52(10);
        B52 b3 = new B52(10, 20);
        b1.print();
        b2.print();
        b3.print();
    }
}
