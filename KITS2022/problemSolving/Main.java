package problemSolving;


public class Main {

	public static void main(String[] args) {
		Ex5 tm = new Ex5();

		// int[] arr = { 434, 12, 3, 434, 12, 434, 44, 38, 55, 434 };
		// int[] pos = new int[arr.length];

		// class ex5
		int[] arr = { 5, 7, 1, 9, 10, 16, 4, 6, 8, 3 };
		tm.ex5(arr);

		// class Test
		// Test test = new Test();
		// test.test(arr, pos);
		// class Test2
		// Test2 test2 = new Test2();
		// test2.pos(arr, arr.length);


	}

}

class Ex5 {
	
	void ex5(int[] arr) {

		int max = 1;
		int count = 1;
		int last = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1])
				count++;

			else
				count = 1;

			if (count > max) {
				max = count;
				last = i;
			}
			
			

		}
		
		System.out.println("Class Ex5");
		System.out.println("Max 1.1 = " + max);
		
		for (int i = max - last + 1; i <= max; i++) {
			System.out.print(" " + arr[i]);
		}


	}
}

class Test {

	void test(int[] arr, int[] pos) {
		System.out.println("Class Test");
		// call max index is 0
		int max = arr[0];
		int count = 1;

		pos[count - 1] = 0;

		for (int i = 1; i < arr.length; i++) {
			if (max == arr[i]) {
				count++;
				pos[count - 1] = i;

			} else if (max < arr[i]) {
				max = arr[i];
				count = 1;
				pos[count - 1] = i;
			}
		}

		System.out.println("Max = " + max);
		System.out.println("So lần xuất hiện: " + count);
		System.out.println("Xuất hiện ở các vị trí sau: ");

		for (int i = 0; i < count; i++)
			System.out.print(pos[i] + " ");

	}

}


class Test2 {

	public int maxNumber(int a[], int n) {
		int maxValue = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] > maxValue) {
				maxValue = a[i];
			}
		}
		return maxValue;
	}

	public void pos(int a[], int n) {
		System.out.println("Class Test2");

		int maxValue = maxNumber(a, n);
		System.out.println("Vi tri cua phan tu lon nhat: ");

		for (int i = 0; i < n; i++) {
			if (a[i] == maxValue) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
