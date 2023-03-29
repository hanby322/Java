package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] sizeArray = new int[10]; // 신발 사이즈 총 10가지

        for (int i = 0; i < 10; i++) {
            sizeArray[i] = 250 + (i * 5); // 신발 사이즈 정렬에 값을 입력
            // # 1
            // System.out.println("사이즈 " + sizeArray[i] + " (재고 있음)"); // 신발 사이즈 값 출력
        }

        // # 2 for-each 를 사용
        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고 있음)");

        }
    }
}
