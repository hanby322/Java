package chap_07_classInternalComponent;

class A_ex5 {
    double averageScore(int...values) {
        double sum = 0;
        for(int value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}
class A_ex8 {
    int a, b, c, d;
    A_ex8() {
        this(5);
    }
    A_ex8(int k) {
        a = k;
        b = k;
        c = k;
        d = k;
    }
}
public class _Exercise_07 {
    public static void main(String[] args) {
        System.out.println(" ---Q5--- ");
        A_ex5 a = new A_ex5();

        System.out.println(a.averageScore(1));
        System.out.println(a.averageScore(1, 2));
        System.out.println(a.averageScore(1, 2, 3));
        System.out.println(a.averageScore(1, 2, 3, 4));

        System.out.println();
        System.out.println(" ---Q8--- ");

        A_ex8 b = new A_ex8();
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.c);
        System.out.println(b.d);
    }
}
