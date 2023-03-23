package chap_18_lambda.sec01.EX08;

interface A {
    int[] abc(int len);
}
public class RefOfArrayConstructor {
    public static void main(String[] args) {
        // 1. 익명 이너 클래스
        A a1 = new A() {
            @Override
            public int[] abc(int len) {
                return new int[len];
            }
        };
        // 2. 람다식
        A a2 = (int len) -> new int[len];
        // 3. 배열의 생성자 참조
        A a3 = int[]::new;
        int[] array1 = a1.abc(3);
        System.out.println(array1.length);
        int[] array2 = a1.abc(3);
        System.out.println(array2.length);
        int[] array3 = a1.abc(3);
        System.out.println(array3.length);
    }
}
