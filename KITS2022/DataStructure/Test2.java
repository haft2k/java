//
//package DataStructure;
//
//
//class Node {
//
//	int data; //
//	Node link;// tham chiếu đến phần tử tiếp theo
//
//	Node(int x) {
//		data = x;
//		link = null;
//	}
//
//	Node(int x, Node node) {
//		data = x;
//		link = node;
//	}
//}
//
//class SLL {
//
//	Node head;
//
//	SLL() {
//		head = null;
//	}
//
//
//	void insertAtFront(int x) {
//		if (isEmpty()) {
//			head = new Node(x);
//		} else {
//			head = new Node(x, head);
//		}
//
//	}
//
//	void insertAtRear(int x) {
//		if (isEmpty()) {
//			head = new Node(x);
//		} else {
//			Node el = head;
//			while (el.link != null)
//				el = el.link;
//			el.link = new Node(x);
//		}
//	}
//
//	void printALL() {
//		Node el = head;
//		if (el != null) {
//			System.out.print(el.data);
//			el = el.link;
//		}
//		while (el != null) {
//			System.out.print(", " + el.data);
//			el = el.link;
//		}
//	}
//
//	boolean Ktra() {
//		Node node = head;
//		boolean tangdan = true;
//
//		while (node.link != null) {
//			if (node.data <= node.link.data) {
//				tangdan = false;
//				break;
//			}
//			node = node.link;
//
//		}
//		return tangdan;
//	}
//
//	boolean isEmpty() {
//		return head == null;
//	}
//
//}
//
//public class Test2 {
//
//	public static void main(String[] args) {
//		SLL sll = new SLL(); // Tạo ra một danh sách rỗng
//
//
//		sll.insertAtFront(6);
//		sll.insertAtFront(7);
//		sll.insertAtFront(8);
//		sll.insertAtFront(9);
//		sll.insertAtFront(10);
//
//
//		// (1) Hoàn thành method kiểm tra: trả về true nếu SLL giảm dần, người lại thì
//		// trả về false
//		// (2) Nếu SLL giảm dần thì in danh sách ra màn hình
//		// ....
//
//		if (sll.Ktra()) {
//			System.out.println();
//			sll.printALL();
//		} else {
//			System.out.println();
//
//			System.out.println("Khong giam dan");
//		}
//	}
//}
//
