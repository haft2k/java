package assign2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

class OperationToProduct {
    // Create scanner input from keyboard
    Scanner scanner = new Scanner(System.in);

    /**
     *
     * Searching and returning the index of product p in the list. If not found
     *
     * return -1.
     *
     * @param p    Product for searching
     *
     * @param list The Linked List
     *
     * @return The index of product p in the list
     *
     */

    public int index(Product p, MyList<Product> list) {

    }

    /**
     *
     * Creating and returning a product with info input from keyboard.
     *
     * @return The product
     *
     */

    Product createProduct() {

    }

    /**
     *
     * Writing all products from the list to the file
     *
     * @param fileName Input file name
     *
     * @param list     Input Linked list
     *
     */

    void writeAllItemsToFile(String fileName, MyList<Product> list) {
	try {
	    FileWriter fileWrite = new FileWriter(fileName);
	    BufferedWriter buffer = new BufferedWriter(fileWrite);

	    Node<Product> temp = list.headNode;

	    String text = "";

	    while (temp != null) {
		text += temp.toString() + "\n";
		temp = temp.getNextNode();
	    }

	    // write Product to file data.txt
	    buffer.write(text);
	    // close write
	    buffer.close();

	} catch (Exception e) {
	    System.out.println("Can't write file");
	}

    }

    /**
     *
     * Reading all products from the file and insert them to the list at tail.
     *
     * @param fileName The file name of the file
     *
     * @param list     The Linked List contains all products that read from file
     *
     */

    void getAllItemsFromFile(String fileName, MyList<Product> list) {
	try {

	    InputStream inputStream = new FileInputStream(fileName);
	    InputStreamReader inputReader = new InputStreamReader(inputStream);
	    try (BufferedReader reader = new BufferedReader(inputReader)) {

		String[] arr = null;
		String line = reader.readLine();

		while (line != null) {

		    arr = line.split("  \\|  ");

		    line = reader.readLine();
		    // System.out.println(line);

		    // create variable compare Product with arr[0... len-1] add variable to Product
		    // and insert to list at tail

		    String bcode = arr[0];
		    String title = arr[1];
		    int quantity = Integer.parseInt(arr[2]);
		    double price = Double.parseDouble(arr[3]);

		    Product product = new Product(bcode, title, quantity, price);

		    list.insertToTail(product);

		}
	    }

	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

    /**
     *
     * Reading all products from the file and insert them to the stack.
     *
     * @param fileName The file name of the file
     *
     * @param stack    The Stack contains all products that read from file
     *
     */

    void getAllItemsFromFile(String fileName, Stack<Product> stack) {
	try {
	    InputStream inputStream = new FileInputStream(fileName);
	    InputStreamReader inputReader = new InputStreamReader(inputStream);
	    BufferedReader reader = new BufferedReader(inputReader);

	    // Use array save product
	    // push to stack with method pop()
	    String[] arr = null;
	    String line = reader.readLine();

	    while (line != null) {
		arr = line.split("  \\|  ");

		// Read by line
		line = reader.readLine();

		// create variable compare Product with arr[0... len-1]
		// add variable to Product
		// and insert to stack

		String bcode = arr[0];
		String title = arr[1];
		int quantity = Integer.parseInt(arr[2]);
		double price = Double.parseDouble(arr[3]);

		Product product = new Product(bcode, title, quantity, price);

		stack.push(product);
	    }

	} catch (Exception e) {
	    // TODO
	    e.printStackTrace();
	}
		    		
    }

    /**
     *
     * Reading all products from the file and insert them to the queue.
     *
     * @param fileName The file name of the file
     *
     * @param queue    The Queue contains all products that read from file
     *
     */

    void getAllItemsFromFile(String fileName, Queue<Product> queue) {
	try {
	    InputStream inputStream = new FileInputStream(fileName);
	    InputStreamReader inputReader = new InputStreamReader(inputStream);
	    BufferedReader reader = new BufferredReader(inputReader);

	    // User array save product
	    // pu
    }

    /**
     *
     * Adding a product to the list, info of the product input from keyboard.
     *
     * @param list The Linked list
     *
     */

    void addLast(MyList<Product> list) {
	String bcode, title;
	int quantity;
	double price;

	System.out.print("input id: ");
	bcode = scanner.nextLine();

	System.out.print("input tile: ");
	title = scanner.nextLine();

	System.out.print("input quantity: ");
	quantity = Integer.parseInt(scanner.nextLine());

	System.out.print("input price: ");
	price = Double.parseDouble(scanner.nextLine());

	Product temp = new Product(bcode, title, quantity, price);
	list.insertToTail(temp);

    }

    /**
     *
     * Adding new product to head of Linked List. The info input from keyboard.
     *
     * @param list The linked list
     *
     */

    void addFirst(MyList<Product> list) {
	String bcode, title;
	int quantity;
	double price;

	System.out.print("input id: ");
	bcode = scanner.nextLine();

	System.out.print("input tile: ");
	title = scanner.nextLine();

	System.out.print("input quantity: ");
	quantity = Integer.parseInt(scanner.nextLine());

	System.out.print("input price: ");
	price = Double.parseDouble(scanner.nextLine());

	Product temp = new Product(bcode, title, quantity, price);
	list.insertToHead(temp);
    }

    /**
     *
     * Searching product by ID input from keyboard.
     *
     * @param list
     *
     */

    void searchByCode(MyList<Product> list) {
	System.out.print("Search by ID: ");
	String idString = scanner.nextLine();

	Node<Product> temp = list.headNode;
	int count = 0;
	while (temp != null) {
	    if (idString.equalsIgnoreCase(temp.getInfo().bcode)) {
		System.out.println(temp.toString());
		count++;
	    }
	    temp = temp.getNextNode();
	}

	if (count == 0) {
	    System.out.println("-1");
	}

    }

    /**
     *
     * Deleting first product that has the ID input from keyboard from the list.
     *
     * @param list
     *
     */

    void deleteByCode(MyList<Product> list) {
	System.out.print("Delete by ID: ");
	String idString = scanner.nextLine();

	Node<Product> temp = list.headNode;

	while (temp != null) {
	    if (idString.equalsIgnoreCase(temp.getInfo().bcode)) {
		list.deleteElement(temp.getInfo());
	    }

	    temp = temp.getNextNode();
	}
    }

    /**
     *
     * Sorting products in linked list by ID
     *
     * @param list The Linked list
     *
     */

    void sortByCode(MyList<Product> list) {

	Node<Product> temp = list.headNode;
	if (list.isEmpty()) {
	    System.out.println("helo");
	} else {
	    System.out.println(temp.toString());
	}
    }

    /**
     *
     * Convert a decimal to of binary. Example: input i = 18
     * -> Output = 010001
     * Use recursion convert
     *
     * @param i Input decimal number
     *
     * @return binary numbers
     *
     */

    int convertToBinary(int i) {
	if (i == 0) {
	    return 0;
	}

	else {
	    return (i % 2 + 10 * convertToBinary(i / 2));
	}

    }

    /**
     *
     * Deleting the product at position
     *
     * @param list The Linked List
     *
     * @param pos  The position of product to be deleted
     *
     */

    void deleteAtPosition(MyList<Product> list, int pos) {
	int countPos = 0;


    }

    /**
     *
     * Printing all products of the list to console screen
     *
     * @param list
     *
     */

    void displayAll(MyList<Product> list) {
	list.traverse();
    }
}
