package chap_08_classExternalComponent.sec01_packageimport.EX02_PackageImport_2;

import chap_08_classExternalComponent.sec01_packageimport.common.A;

public class PackageImport_2 {
    public static void main(String[] args) {
        // 객체 생성
        A a = new A();

        // 멤버 활용
        System.out.println(a.m);
        System.out.println(a.n);
        a.print();
    }
}
