package BTVT1stack;


public class Main {

	public static void main(String[] args) {
//		SLL sll = new SLL(); // Tạo ra một danh sách rỗng
//		sll.printALL();
//		sll.insertAtFront(10);
//		sll.insertAtFront(5);
//		sll.insertAtRear(20);
//		sll.printALL();
//		int y = sll.deleteFromFront();
//		System.out.println("");
//		System.out.println("deleted element:" + y);
//		sll.printALL();
//		y = sll.deleteFromRear();
//		System.out.println("");
//		System.out.println("deleted element:" + y);
//		sll.printALL();
//		
		Stack stack = new Stack();
		stack.push(10);
		stack.push(101);
		stack.push(12);
		stack.push(103);
		stack.push(102);
		stack.push(101);
		stack.printAll();
		
		Queue queue = new Queue();
		queue.enQueue(10);
		queue.enQueue(101);
		queue.enQueue(12);
		queue.enQueue(103);
		queue.enQueue(102);
		queue.enQueue(101);
		
		System.out.println();
		queue.printAll();
		
		
		
	}
}