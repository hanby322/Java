// 8 퀸 문제 풀이

package chap05.quiz;

public class Q9 {
    static boolean[] flag_a = new boolean[8]; // 각 행에 퀸을 이미 배치했는지 체크
    static boolean[] flag_b = new boolean[15]; // / 대각선 방향으로 퀸을 배치했는지 체크
    static boolean[] flag_c = new boolean[15]; // \ 대각선 방향으로 퀸을 배치했는지 체크

    static boolean[][] flag_BlkBox = new boolean[8][8];
    static int[] pos = new int[8]; // 각 열에 있는 퀸의 위치
    static int count = 0;

    // 각 열에 있는 퀸의 위치를 출력
    static void print() {
        count++;
        for (int i = 0; i < 8; i++) {
            flag_BlkBox[i][pos[i]] = true;
            for (int j = 0; j < 8; j++) {
                System.out.print(flag_BlkBox[i][j] == true ? "■  " : "□  ");
            }
            flag_BlkBox[i][pos[i]] = false;
            System.out.println();
        }
        System.out.println("카운트: " + count);
        System.out.println();
    }

    static void set(int i) { // i 는 열
        for (int j = 0; j < 8; j++) {
            if (flag_a[j] == false && // 가로(j행)에 아직 배치하지 않음
                    flag_b[i + j] == false && // / 대각선에 아직 배치하지 않음
                    flag_c[i - j + 7] == false) { // \ 대각선에 아직 배치하지 않음
                pos[i] = j; // j 는 행
                if (i == 7) // 모든 열에 배치
                    print();
                else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                    set(i + 1); // 다음 열에 퀸을 배치
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0); // 0열에 퀸을 배치
    }
}