package chap_08_classExternalComponent.sec02_externalclass.EX02_ExternalClass_2.pack2;

import chap_08_classExternalComponent.sec02_externalclass.EX02_ExternalClass_2.pack1.*;

// 외부 클래스를 별도의 파일로 분리
public class ExternalClass_2 {
    public static void main(String[] args) {
        A a = new A();
        a.print();
    }
}
