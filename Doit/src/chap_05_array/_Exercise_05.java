package chap_05_array;

public class _Exercise_05 {
    public static void main(String[] args) {

        System.out.println(" --- Q4 --- ");
        int array[]= new int[]{1, 2, 3, 4, 5};
        for(int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(" --- Q5, Q6 --- ");
        int[][] a = new int[2][];
        a[0] = new int[3];
        a[1] = new int[2];

        a[0][0] = 1;
        a[0][1] = 3;
        a[0][2] = 5;
        a[1][0] = 7;
        a[1][1] = 9;

        for (int i = 0; i <  a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" --- Q8 --- ");
        String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다";
        String name;
        int age;

        name = str.substring(str.indexOf("[") + 1, str.indexOf("[") + 4);
        age = Integer.parseInt(str.substring(str.lastIndexOf("[") + 1, str.lastIndexOf("[") + 3));

        System.out.println(name);
        System.out.println(age);
    }
}
