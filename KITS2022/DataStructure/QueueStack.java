package DataStructure;


public class QueueStack {

	public static void main(String[] args) {


		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 46 };
		BinarySearch a = new BinarySearch();
		int b = a.binarySearch(0, arr.length - 1, arr, 46);
		System.out.println(b);
		
		System.out.println(bina(0, arr.length - 1, arr, 46));
		
	}

	static int bina(int left, int right, int[] arr, int point) {
		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == point)
				return mid;
			else if (arr[mid] < point)
				left = mid + 1;
			else right = mid - 1;
		}

		return -1;
	}

}

class BinarySearch {

	int binarySearch(int left, int right, int[] arr, int point) {
		if (right >= left) {

			int mid = (left + right) / 2;


			if (arr[mid] == point) {
				return mid;
			}

			else if (arr[mid] > point) {
				// 0 -- > mid - 1
				return binarySearch(left, mid - 1, arr, point);

			}
			// mid + 1 -- length array
			return binarySearch(mid + 1, right, arr, point);


		}
		return -1;
	}
}


class Queue {

	private int[] arrQueue;
	private int front;
	private int rear;

	public Queue(int n) {
		int front = 0, rear = -1;
		this.arrQueue = new int[n];
	}


	void enQueue(int data) {
		if (isFull()) {
			System.out.println("Full queue");
			return;
		}

		arrQueue[rear] = data;
		rear++;
	}


	int deQueue() {
		if (isEmpty()) {
			return -1;
		}

		int data = arrQueue[front++];

		return data;

	}


	boolean isFull() {
		if (front >= arrQueue.length) {
			System.out.println("Full queue");
		}
		return true;
	}

	boolean isEmpty() {
		if (front == rear)
			return true;
		return false;
	}
}
