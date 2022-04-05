package assignment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

class OperationToProduct {
    // Create scanner input from keyboard
    Scanner scanner = new Scanner(System.in);

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

	    Node<Product> currentNode = list.headNode;

	    String text = "";

	    while (currentNode != null) {
		text += currentNode.toString() + "\n";
		currentNode = currentNode.getNextNode();
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
	    BufferedReader reader = new BufferedReader(inputReader);

	    String[] arr = null;
	    String line = reader.readLine();

	    while (line != null) {

		arr = line.split("  \\|  ");

		line = reader.readLine();

		// create variable compare Product with arr[0... len-1]
		// add variable to Product
		// and insert to list at tail

		String bcode = arr[0];
		String title = arr[1];
		int quantity = Integer.parseInt(arr[2]);
		double price = Double.parseDouble(arr[3]);

		Product product = new Product(bcode, title, quantity, price);

		list.insertToTail(product);

	    }

	    reader.close();

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
     * @throws FileNotFoundException
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

		// compare Product with arr[0... length-1]
		// add variable to Product
		// and insert to stack

		String bcode = arr[0];
		String title = arr[1];
		int quantity = Integer.parseInt(arr[2]);
		double price = Double.parseDouble(arr[3]);

		Product product = new Product(bcode, title, quantity, price);

		stack.push(product);

	    }
	    reader.close();

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
	    BufferedReader reader = new BufferedReader(inputReader);

	    String[] arr = null;
	    String line = reader.readLine();

	    while (line != null) {
		arr = line.split("  \\|  ");
		line = reader.readLine();

		// Create variable compare Product with arr[0 .... len-1]
		// add variable to Product
		// and insert to list at tail

		String bcode = arr[0];
		String title = arr[1];
		int quantity = Integer.parseInt(arr[2]);
		double price = Double.parseDouble(arr[3]);

		Product product = new Product(bcode, title, quantity, price);

		queue.enQueue(product);

	    }
	} catch (Exception e) {

	}


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

	Product currentNode = new Product(bcode, title, quantity, price);
	list.insertToTail(currentNode);

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

	Product currentNode = new Product(bcode, title, quantity, price);
	list.insertToHead(currentNode);
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

	Node<Product> currentNode = list.headNode;
	int count = 0;
	while (currentNode != null) {
	    if (idString.equalsIgnoreCase(currentNode.getInfo().bcode)) {
		System.out.println(currentNode.toString());
		count++;
	    }
	    currentNode = currentNode.getNextNode();
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

	Node<Product> currentNode = list.headNode;

	while (currentNode != null) {
	    if (idString.equalsIgnoreCase(currentNode.getInfo().bcode)) {
		list.deleteElement(currentNode.getInfo());
	    }

	    currentNode = currentNode.getNextNode();
	}
    }

    /**
     *
     */
    Node<Product> partition(MyList<Product> list, Node<Product> start, Node<Product> end) {
	if (start == end || start == null || end == null) {
	    return start;
	}

	// set pivot index end
	Node<Product> pivot = end;
	Node<Product> pivot_prev = start;

	// index
	Node<Product> i = start;

	while (start != end) {
	    if ((start.getInfo().bcode).compareTo(pivot.getInfo().bcode) > 0) {

		pivot_prev = i;
		Product temp = i.getInfo();
		i.setInfo(start.getInfo());
		start.setInfo(temp);

		i = i.getNextNode();
	    }
	    start = start.getNextNode();
	}

	// swap the position of index
	Product temp = i.getInfo();
	i.setInfo(pivot.getInfo());
	end.setInfo(temp);

	// return one previous to current
	return pivot_prev;
    }

    void sort(MyList<Product> list, Node<Product> start, Node<Product> end) {
	if (start == null || start == end || start == end.getNextNode()) {
	    return;
	}

	Node<Product> pivot_prev = partition(list, start, end);
	sort(list, start, pivot_prev);

	if (pivot_prev != null && pivot_prev == start) {
	    sort(list, pivot_prev.getNextNode(), end);

	} else if (pivot_prev != null && pivot_prev.getNextNode() != null) {
	    sort(list, pivot_prev.getNextNode().getNextNode(), end);
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

	Node<Product> currentNode = list.headNode;
	Node<Product> indexNode = null;

	while (currentNode != null) {
	    indexNode = currentNode.getNextNode();

	    while (indexNode != null) {
		// if compareTO <= 0 keep position currentNode && indexNode
		if ((currentNode.getInfo().bcode).compareTo(indexNode.getInfo().bcode) > 0) {
		    Product temp = currentNode.getInfo();
		    currentNode.setInfo(indexNode.getInfo());
		    indexNode.setInfo(temp);

		}
		indexNode = indexNode.getNextNode();
	    }
	    currentNode = currentNode.getNextNode();
	}
    }

    /**
     *
     * Convert a decimal to of binary. Example: input i = 18
     * --> Output = 10001
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
     * Printing all products of the list to console screen
     *
     * @param list
     *
     */

    void displayAll(MyList<Product> list) {
	list.traverse();
    }
}
