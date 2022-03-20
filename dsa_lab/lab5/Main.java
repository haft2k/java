package lab5;

public class Main {
    public static void main(String[] args) {
	Stack tStack = new Stack();
	int a = 12;
	tStack.convertToBinary(a);
	System.out.println();
	// test function
	// converToBinary(int a)
	System.out.print(Integer.toBinaryString(a));
    }
}
