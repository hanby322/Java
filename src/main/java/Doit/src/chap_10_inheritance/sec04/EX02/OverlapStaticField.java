package chap_10_inheritance.sec04.EX02;

class A {
    static int m = 3;
}
class B extends A {
    static int m = 4;
}
public class OverlapStaticField {
    public static void main(String[] args) {
        // 클래스명으로 바로 접근
        System.out.println(A.m);
        System.out.println(B.m);
        System.out.println();


        // 객체 생성
        A aa = new A();
        B bb = new B();
        A ab = new B();

        // 생성한 객체로 정적 필드 호출
        System.out.println(aa.m);
        System.out.println(bb.m);
        System.out.println(ab.m);
    }
}
