package lab3;

public class Lab3 {

    public static void main(String[] args) {
	/* Call class */
	FuncList func = new FuncList();

	// set array int
	int[] arr = { 7, 2, 9, 8, 6, 3 };

	/* function list */
	func.insertMulti(arr); // { 7, 2, 9, 8, 6, 3 }
	func.insertAtHead(12); // { 12, 7, 2, 9, 8, 6, 3 }
	System.out.println(func.toString());

	func.search(3); // index 6

	// test method visit
	Node node = new Node(12);
	func.visit(node);

	func.traverse();

    }

}
