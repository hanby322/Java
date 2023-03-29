package chap05.quiz.Q6;

import chap05.Recur;

import java.util.Scanner;


class TempStack {
    static int[] stkArray;
    static int idx = 0;

    public TempStack(int a) {
        this.stkArray = new int[a];
    }

    public static void push(int x) {
    stkArray[idx++] = x;
    }

    public static int pop() {
        return stkArray[--idx];
    }

    public static boolean isEmpty() {
        return idx <= 0 ? true : false;
    }
}


public class Recur3 {

    static void recur3(int n) {
        TempStack stack = new TempStack(n);

        while (true) {
            if (n > 0) {
                stack.push(n);
                n = n - 1;
                continue;
            }
            if (!TempStack.isEmpty()) {
                n = TempStack.pop();
                n = n - 2;

                continue;

            }
            System.out.println(n + 2);
            break;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int x = stdIn.nextInt();

        recur3(x);
    }
}
