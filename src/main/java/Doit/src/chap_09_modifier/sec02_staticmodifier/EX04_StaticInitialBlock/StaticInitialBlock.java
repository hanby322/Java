package chap_09_modifier.sec02_staticmodifier.EX04_StaticInitialBlock;

class A {
    int a;
    static int b;
    static {
        b = 5; // 정적 필드의 초기화는 static {} 내에서 수행
        System.out.println("클래스 A가 로딩됐습니다!!");
    }
    A() {
        a = 3; // 인스턴스 필드 초기화는 일반적으로 생성자에서 수행
    }
}
public class StaticInitialBlock {
    public static void main(String[] args) {
        System.out.println(A.b);
    }
}
