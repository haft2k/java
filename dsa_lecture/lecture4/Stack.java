package lecture4;

public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int max) {
	maxSize = max;
	stackArray = new char[maxSize];
	top = -1;
    }

    /*
     * i=1;
     * if (j = ++i; (i=2, j=1)) pre-increment
     *
     * if (j = i++; (i=2, j=2)) post-increment
     *
     */
    public void push(char j) {
	stackArray[++top] = j;
    }

    public char pop() {
	return stackArray[top--];
    }

    public char peek() {
	return stackArray[top];
    }

    public boolean isEmpty() {
	return (top == -1);
    }

    public static void main(String[] args) {
	Stack stack = new Stack(4);
	stack.push('a');
	System.out.println(stack.peek());
	stack.push('b');
	System.out.println(stack.peek());
    }

}


