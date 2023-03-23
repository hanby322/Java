package chap_04_selectControlStatement;

public class _02_SwitchControlStatement {
    public static void main(String[] args) {
        int a = 8;
        switch(a) {
            case 10:
            case 9:
            case 8:
            case 7:
                System.out.println("Pass"); //Pass
                break;
            default:
                System.out.println("Fail");
        }

        // break가 포함되지 않았을 때
        int value1 = 2;
        switch(value1) {
            case 1:
                System.out.println("A");
            case 2:
                System.out.println("B"); // B
            case 3:
                System.out.println("C"); // C
            default:
                System.out.println("D"); // D
        }
        System.out.println();

        // break가 포함돼 있을 때
        int value2 = 2;
        switch(value2) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B"); // B
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }
        System.out.println();

        // if - else if - else 구문으로 변환
        if(value1 == 1) {
            System.out.println("A");
        } else if(value1 == 2) {
            System.out.println("B"); // B
        } else if(value1 == 3) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
