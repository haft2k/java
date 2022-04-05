package lecture3_linked_list;

 class DoublyEndedListDemo {
     static void main(String[] args) {
	DoublyEndedList dList = new DoublyEndedList();

	dList.insertAtTail(19);
	dList.insertAtTail(18);
	dList.insertAtTail(17);

	System.out.print(dList);
    }
}
