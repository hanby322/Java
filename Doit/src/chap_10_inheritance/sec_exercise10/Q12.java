package chap_10_inheritance.sec_exercise10;

class A {
    int data;
    A(int data) {
        this.data = data;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof A) {
            return this.data == ((A)obj).data;
        } else {
            return false;
        }
    }

}
public class Q12 {
    public static void main(String[] args) {
        A a1 = new A(3);
        A a2 = new A(3);
        System.out.println(a1.equals(a2));
    }
}
