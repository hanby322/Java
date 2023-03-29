package chap_04_selectControlStatement;

public class _Exercise_04 {
    public static void main(String[] args) {
        System.out.println(" ----- Q3 ----- "); // Q3
        for (int i = 0;  ; i++) {
            if(i % 2 != 0) {
                continue;
            }
            if(i > 10) {
                break;
            }
            System.out.println(i);
        }

        System.out.println(" ----- Q2 ----- "); // Q2
        int score = 72;
        switch(score/10) {
            case 10:
            case 9: System.out.println("A학점"); break;
            case 8: System.out.println("B학점"); break;
            case 7: System.out.println("C학점"); break;
            default: System.out.println("F학점");
        }

        System.out.println(" ----- Q4 ----- "); // Q4
        int i = 10;
        while(i > 0) {
            System.out.println(i);
            i -= 2;
        }

        System.out.println(" ----- Q7 ----- "); // Q7
        POS1:
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 5; k++) {
                if(i == 3 && j == 3) {
                    break POS1;
                }
            }
        }

    }
}
