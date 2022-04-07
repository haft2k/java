package assignment2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void showMenu() {

	System.out.println("Choose one of this options:");

	System.out.println("Product list:\n");

	System.out.println("1. Load data from file and display");

	System.out.println("2. Input & add to the end.");

	System.out.println("3. Display data");

	System.out.println("4. Save product list to file.");

	System.out.println("5. Search by ID");

	System.out.println("6. Delete by ID");

	System.out.println("7. Sort by ID.");

	System.out.println("8. Convert to Binary");

	System.out.println("9. Load to stack and display");

	System.out.println("10. Load to queue and display.");

	System.out.println("0. Exit");

    }

    public static void main(String[] args) throws IOException {
	Scanner scanner = new Scanner(System.in);
	OperationToProduct operation = new OperationToProduct();
	MyList<Product> list = new MyList<Product>();

	int choice;

	do {
	    showMenu();
	    System.out.print("Enter choice: ");
	    choice = Integer.parseInt(scanner.nextLine());

	    // Function choice == 0 end program
	    if (choice == 0) {
		System.out.println("Have nice day. Good bye");
		break;
	    }

	    /**
	     *
	     * function 1 to 10 follow by menu()
	     *
	     */

	    switch (choice) {

	    // load data from file data.txt
	    case 1: {
		list = new MyList<Product>();
		operation.getAllItemsFromFile("data.txt", list);
		operation.displayAll(list);

		operation.writeFilePrintStream("console_output.txt", list);
		System.out.println("Data complete save to file data.txt");

		break;

	    }

	    // add product and write to file
	    // file data.txt
	    case 2: {
		operation.addLast(list);
		// operation.writeAllItemsToFile("data.txt", list);
		break;

	    }

	    // print list
	    case 3: {
		operation.displayAll(list);
		break;
	    }

	    // data in list save to data.txt
	    case 4: {
		operation.writeAllItemsToFile("data.txt", list);
		System.out.println("Successfully!");
		System.out.println();

		/* write to console.txt */
		operation.writeFilePrintStream("console_output.txt", list);

		break;
	    }

	    // input key id search product
	    // print product with ID compare
	    case 5: {
		operation.searchByCode(list);

		break;
	    }

	    // delete Product by ID
	    case 6: {
		operation.deleteByCode(list);
		operation.writeAllItemsToFile("data.txt", list);
		operation.displayAll(list);
		System.out.println("Deleted done!");

		/* write to console.txt */
		operation.writeFilePrintStream("console_output.txt", list);
		break;
	    }

	    // sorting follow alphabet
	    case 7: {
		operation.sortByCode(list);
		/* write to console.txt */
		operation.writeFilePrintStream("console_output.txt", list);

		break;
	    }

	    // convert to binary
	    case 8: {
		System.out.print("Quantity = " + list.headNode.getInfo().quantity + " ==> ");
		operation.convertToBinary(list.headNode.getInfo().quantity);

		break;
	    }

	    // save list to stack and display
	    case 9: {
		Stack<Product> stack = new Stack<Product>();
		operation.getAllItemsFromFile("data.txt", stack);
		stack.printStack(stack);

		operation.writeFilePrintStream("console_output.txt", list);

		break;
	    }

	    // save list to queue and display
	    case 10: {
		Queue<Product> queue = new Queue<Product>();
		operation.getAllItemsFromFile("data.txt", queue);
		queue.printQueue(queue);
		operation.writeFilePrintStream("console_output.txt", list);

		break;

	    }


	    default:
		break;
	    }

	} while (true);

    }
}
