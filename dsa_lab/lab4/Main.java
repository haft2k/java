package lab4;

public class Main {
    public static void main(String[] args) {
	FuncList list = new FuncList();
	String[] name = { "HOA", "HA", "LAN", "NOI", "MUA", "NAY" };
	int[] age = { 25, 17, 26, 19, 23, 21 };

	list.addMulti(name, age);
	list.traverse();

	list.sortByName();
	System.out.println();
	list.traverse();
    }


}
