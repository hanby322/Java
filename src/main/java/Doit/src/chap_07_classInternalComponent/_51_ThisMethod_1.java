package chap_07_classInternalComponent;

// 클래스의 정의
class A51 {
    A51() {
        System.out.println("첫 번째 생성자");
    }
    A51(int a) {
        this();
        System.out.println("두 번째 생성자");
    }
    /* 메서드에서는 this() 메서드 사용 불가능
    void abc() {
        this();
    }
    */
}
public class _51_ThisMethod_1 {
    public static void main(String[] args) {
        // 객체 생성
        A51 a1 = new A51();
        System.out.println();
        A51 a2 = new A51(3);
    }
}
