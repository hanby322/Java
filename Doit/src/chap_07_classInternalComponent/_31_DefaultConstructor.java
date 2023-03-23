package chap_07_classInternalComponent;

class A31 {
    int m;
    void work() {
        System.out.println(m);
    }
    /* 생성자를 포함하지 않으면 컴파일러가 기본 생성자를 자동으로 추가
    A(){

    }
     */
}
class B31 {
    int m;
    void work() {
        System.out.println(m);
    }
    B31() { // 기본 생성자를 직접 정의

    }
}
class C31 {
    int m;
    void work() {
        System.out.println(m); // 생성자로 넘어온 값
    }
    C31(int a) {
        m = a; //입력매개변ㄴ수로 절달된 값으로 필드 초기화
    }
}
public class _31_DefaultConstructor {
    public static void main(String[] args) {

        // 클래스의 객체 생성
        A31 a = new A31(); // 컴파일러가 자동으로 추가한 기본 생성자를 호출해 객체 생성
        B31 b = new B31(); // 직접 정의한 기본 생성자를 호출해 객체 생성
        // C31 c = new C31(); // 기본 생성자 호출 불가능
        C31 c = new C31(3); // 직접 정의한 생성자를 호출해 객체 생성

        // 메서드 호출
        a.work();
        b.work();
        c.work();
    }
}
