package chap01.quiz;

public class Q14 {
    static void triangleLB(int n) { // 왼쪽 아래가 직각인 이등변삼각형 출력
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }
    static void triangleLU(int n) { // 왼쪽 위가 직각인 이등변삼각형 출력
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }
    static void triangleRU(int n) { // 오른쪽 위가 직각인 이등변삼각형 출력
        int space = 0;
        for (int i = n; i >= 1 ; i--) {
            System.out.print(" ".repeat(space));
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            space++;
            System.out.println();
        }
    }
    static void triangleRB(int n) { // 오른쪽 아래가 직각인 이등변삼각형 출력
        int space = n - 1;
        for (int i = 1; i <= n ; i++) {
            System.out.print(" ".repeat(space));
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            space--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangleLB(5);
        System.out.println();
        triangleLU(5);
        System.out.println();
        triangleRB(5);
        System.out.println();
        triangleRU(5);

    }

}
