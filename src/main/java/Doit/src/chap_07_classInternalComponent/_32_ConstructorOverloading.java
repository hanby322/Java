package chap_07_classInternalComponent;

class A32 {
    A32() {
        System.out.println("첫 번째 생성자");
    }
    A32(int a) {
        System.out.println("두 번째 생성자");
    }
    A32(int a, int b) {
        System.out.println("세 번째 생성자");
    }
}
public class _32_ConstructorOverloading {
    public static void main(String[] args) {
        A32 a1 = new A32();
        A32 a2 = new A32(3);
        A32 a3 = new A32(3, 6);
    }
}
