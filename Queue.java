import java.util.Scanner;

class Queue {
	int front, rear;
	int[] q;

	Queue() {
		front = rear = 0;
		q = new int[100];
	}

	Queue(int size) {
		front = rear = 0;
		q = new int[size];
	}

	void insert(int ele) {
		if (rear == q.length) {
			System.out.println("overflow");
			return;
		}
		
		q[rear++] = ele;
	}

	int delete() {
		if (front == rear) {
			System.out.println("underflow");
			front = rear = 0;
			return -9999;
		}

		return q[front++];
	}

	void display() {
		for (int i = front; i < rear; i++)
			System.out.print(q[i] + " ");
		System.out.println();
	}
}

class QueueMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		Queue q = new Queue(size);

		int choice;
		do {
			System.out.println("enter choice");
			System.out.println("1. insert\n2. delete\n3. display\n0. exit");
			choice = in.nextInt();

			switch (choice) {
				case 1:
					System.out.print("enter element to insert: ");
					int ele = in.nextInt();
					q.insert(ele);
					break;

				case 2: 
					System.out.println("deleted element: " + q.delete());
					break;

				case 3:
					q.display();
					break;
			}
		} while (choice != 0);
	}
}
