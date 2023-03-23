package chap_10_inheritance.sec06.EX02;

class A {
    String name;
    A(String name) {
        this.name = name; // 클래스 내의 name 필드 값을 지역변수 name 값으로 초기화
    }
}
class B {
    String name;
    B(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if(this.name == ((B)obj).name) {
            return true;
        } else {
            return false;
        }
    }
}
public class ObjectMethod_equals {
    public static void main(String[] args) {
        A a1 = new A("안녕");
        A a2 = new A("안녕");
        System.out.println(a1 == a2); // false
        System.out.println(a1.equals(a2)); // false 바로 위 코드와 완전 동일

        B b1 = new B("안녕");
        B b2 = new B("안녕");
        System.out.println(b1 == b2); // false
        System.out.println(b1.equals(b2)); // true // B 클래스에서 실제 내용을 비교하도록 오버라이드됐기 때문
    }
}
