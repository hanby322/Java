package chap_09_modifier.sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import chap_09_modifier.sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;
public class D extends A { // D 클래스는 A 클래스의 자식 클래스
    public void print() {
        // 멤버 활용
        System.out.print(a + " ");
        System.out.print(b + " ");
        // System.out.print(c + " ");
        // System.out.print(d);
        System.out.println();
    }
}
