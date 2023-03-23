package chap04.quiz.Q3;

public class IntBTStack {
    private int[] stk; // 스택용 배열
    private int capacity; // 스택 용량
    private int ptr; // 스택 포인터

    public class EmptyIntBTStackException extends RuntimeException {
        public EmptyIntBTStackException() {};
    }

    public class OverFlowIntBTStackException extends RuntimeException {
        public OverFlowIntBTStackException() {}
    }

    public IntBTStack(int maxLen) {
        ptr = 0;
        capacity = maxLen;
        stk = new int[capacity];
    }
    public int push(int x) { // 푸시
        if (ptr >= capacity) {
            throw new OverFlowIntBTStackException();
        }
        return stk[ptr++] = x;
    }

    public int pop() { // 팝
        if (ptr <= 0) {
            throw new EmptyIntBTStackException();
        }
        return stk[--ptr];
    }
}
