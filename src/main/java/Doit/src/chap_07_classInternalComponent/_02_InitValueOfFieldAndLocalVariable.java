package chap_07_classInternalComponent;

// 클래스 생성(정의)
class A2 {
    boolean m1;
    int m2;
    double m3;
    String m4;
    void printFieldValue() {
        System.out.println(m1); // false
        System.out.println(m2); // 0
        System.out.println(m3); // 0.0
        System.out.println(m4); // null
    }
    void printLocalVariable() {
        int k;
        // System.out.println(k); // 지역 변수를 초기화하지 않아 오류 발생
    }
}
public class _02_InitValueOfFieldAndLocalVariable {
    public static void main(String[] args) {
        // 클래스를 활용해 객체 생성
        A2 a = new A2();
        // 객체 활용
        a.printFieldValue();
    }
}
