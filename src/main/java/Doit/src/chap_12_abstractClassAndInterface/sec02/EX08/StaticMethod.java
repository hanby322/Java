package chap_12_abstractClassAndInterface.sec02.EX08;

interface A {
    static void abc() {
        System.out.println("A 인터페이스의 정적 메서드 abc()");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        // 정적 메서드 호출
        A.abc();
    }
}
