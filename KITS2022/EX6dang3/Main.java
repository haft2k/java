package EX6dang3;


public class Main {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 9, 10, 16, 4, 6, 8, 3 };
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = (int) (Math.random() * 100 + 1);
		// }
		// System.out.println("Array = " + Arrays.toString(arr));

		int maxLength = 0, count = 0, lastIndex = 0; // A[0]

		int sum = arr[0], sumOfSubArr = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i % 2] == 0) {
				count++;
			}

			else {
				count = 1;

			}

			if (count > maxLength) {
				maxLength = count;
				lastIndex = i;
			}

		}

		System.out.println("Max Length = " + maxLength + " " + "Sum Sub Array = " + sumOfSubArr);
		System.err.println(" ");
		for (int i = lastIndex - maxLength + 1; i < lastIndex; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(arr[lastIndex] + " !");
	}

}
