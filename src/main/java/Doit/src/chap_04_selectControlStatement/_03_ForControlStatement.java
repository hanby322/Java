package chap_04_selectControlStatement;

public class _03_ForControlStatement {
    public static void main(String[] args) {
        // for 문 기본 문법 구조
        int a; // for 문의 반복 획수를 지정하는 변수를 외부에서 선언
        for (a = 0; a < 3; a++) {
            System.out.print(a + " "); // 0 1 2
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(i + " "); // 0 1 2
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.print(i + " "); // 0 1 2 ... 99
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " "); // 10 9 8 ... 2 1
        }
        System.out.println();

        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + " "); // 0 2 4 6 8
        }
        System.out.println();

        for (int i = 0, j = 0; i < 10; i++, j++) {
            System.out.print(i + j + " "); //0 2 4 ... 18
        }
        System.out.println();

        // for 문의 특수한 형태(무한 루프)
        /*
        for (int i = 0; ; i++) {
            System.out.print(i + " ");
        }
        for(;;) {
            System.out.print("무한 루프");
        }
         */
        System.out.println();

        // 무한 루프 탈출
        for (int i = 0;  ; i++) {
            if(i > 10) {
                break;
            }
            System.out.print(i + " "); // 0 1 2 ... 9 10
        }
        System.out.println("무한 루프 탈출"); //무한 루프 탈출
    }
}
