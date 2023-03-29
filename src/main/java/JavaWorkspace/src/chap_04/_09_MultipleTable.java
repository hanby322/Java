package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단
        for (int i = 2; i < 10; i++) {
            System.out.print(i + "단 : ");
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
