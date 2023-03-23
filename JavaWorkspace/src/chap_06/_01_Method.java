package chap_06;

public class _01_Method { // 메소드(method) : 파이썬의 함수(def)와 비슷한 기능
    // 메소드 정의
    public static void sayHello() {
        System.out.println("안녕하세요? 메소드입니다.");
    }

    public static void main(String[] args) {
        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");

    }
}
