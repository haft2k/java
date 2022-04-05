package lecture4_stack_queue;

 class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

     Stack(int max) {
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
     void push(char j) {
	stackArray[++top] = j;
    }

     char pop() {
	return stackArray[top--];
    }

     char peek() {
	return stackArray[top];
    }

     boolean isEmpty() {
	return (top == -1);
    }

     static void main(String[] args) {
	Stack stack = new Stack(4);
	stack.push('a');
	System.out.println(stack.peek());
	stack.push('b');
	System.out.println(stack.peek());
    }

}


