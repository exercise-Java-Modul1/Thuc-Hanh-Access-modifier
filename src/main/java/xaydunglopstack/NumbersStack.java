package xaydunglopstack;

public class NumbersStack {
    int count = 0;
    int top;
    int[] numbers = new int[20];

    public NumbersStack() {

    }

    public int getCount() {
        return 0;
    }

    public void push(int number) {
        numbers[count] = number;
        count++;
    }

    public int pop() {
        int top = numbers[count - 1];
        count--;
        return top;
    }
}
