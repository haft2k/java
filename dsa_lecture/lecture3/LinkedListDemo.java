package lecture3;

public class LinkedListDemo {
    public static void main(String[] args) {
	LinkedList list = new LinkedList();

	list.insertAtHead(12);
	list.insertAtHead(1);
	list.insertAtHead(13);

	list.deleteFromHead();
	System.out.println(list);
	System.out.println("Length: " + list.length());

    }
}