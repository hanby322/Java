package chap_08_classExternalComponent.sec01_packageimport.EX01_PackageImport_1;

import chap_08_classExternalComponent.sec01_packageimport.common.A;

public class PackageImport_1 {
    public static void main(String[] args) {
        // 객체 생성
        // A a = new A(); // 오류
        A a = new A();

        // 멤버 활용
        System.out.println(a.m);
        System.out.println(a.n);
        a.print();
    }
}
