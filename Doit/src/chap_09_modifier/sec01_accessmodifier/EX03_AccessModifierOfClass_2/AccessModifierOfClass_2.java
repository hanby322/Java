package chap_09_modifier.sec01_accessmodifier.EX03_AccessModifierOfClass_2;

import chap_09_modifier.sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.AA;
// import chap_08_modifier.sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.BB; // 불가능

public class AccessModifierOfClass_2 {
    public static void main(String[] args) {
        // 객체 생성
        AA a = new AA();
        // BB b = new BB(); // BB 클래스는 import 불가능하므로 생성자도 생성 불가능
        // CC c = new CC(); // CC 클래스의 생성자가 default이므로 생성 불가
    }
}
