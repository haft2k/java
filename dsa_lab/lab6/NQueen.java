package lab6;

import java.util.Scanner;

class Queen {
    int num, count;
    boolean cols[], diagonalDown[], diagonalUp[];
    int x[];
    Scanner scanner;

    Queen() {
	x = new int[20];
	cols = new boolean[20];
	diagonalDown = new boolean[40];
	diagonalUp = new boolean[40];
	scanner = new Scanner(System.in);
    }

    void init() {
	System.out.print("n = ");
	num = scanner.nextInt();
	count = 0;

	for (int i = 1; i <= num; i++) {
	    cols[i] = true;
	}
	for (int i = 1; i <= 2 * num; i++) {
	    diagonalDown[i] = true;
	}
	for (int i = 1; i <= 2 * num; i++) {
	    diagonalUp[i] = true;
	}
    }

    // method find test algo
    void test(int i) {
	int j;
	for (j = 1; j <= num; j++) {
	    if (cols[j] && diagonalDown[i - j + num] && diagonalUp[i + j - 1]) {
		x[i] = j;
		cols[j] = false;
		diagonalDown[i - j + num] = false;
		diagonalUp[i + j - 1] = false;

		if (i == num) {
		    result();
		} else {
		    test(i + 1);
		}

		cols[j] = true;
		diagonalDown[i - j + num] = true;
		diagonalUp[i + j - 1] = true;

	    }
	}
    }

    void result() {
	System.out.printf("\n%3d: ", ++count);
	for (int i = 1; i <= num; i++) {
	    System.out.printf("%4d", x[i]);
	}
    }

}

public class NQueen {
    public static void main(String[] args) {
	Queen queen = new Queen();
	queen.init();
	queen.test(1);
	System.out.println();
    }
}