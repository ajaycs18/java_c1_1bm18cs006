/*
2. Design an interface named Stack with the following methods:
a) push and pop elements from the stack
b) check whether the stack is empty or not.
Implement the stack with the help of arrays and if the size of the array becomes too small to hold the elements, create a new one. Test this interface by inheriting it in its subclass StackTest.java
*/

import java.util.Scanner;

interface StackInterface {
	void push(int e);
	int pop();
	boolean isEmpty();
}

class Stack implements StackInterface {
	int top = -1, size = 2;
	int[] arr = new int[size];

	public void push(int ele) {
		if (top == size - 1) {
			size *= 2;
			int[] newStack = new int[size];
			for (int i = 0; i <= top; i++) {
				newStack[i] = arr[i];
			}
			arr = newStack;
		}
		arr[++top] = ele;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Underflow");
			return -999999;
		}
		return arr[top--];
	}

	public boolean isEmpty() {
		if (top == -1) 
			return true;
		return false;
	}

	void print() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

class StackDemo {
	public static void main(String[] args) {
		int choice;
		Scanner in = new Scanner(System.in);
		Stack s = new Stack();

		do {
			System.out.println("1. Push\n2. Pop\n3. Display\n0. Exit");
			System.out.print("Enter choice: ");
			choice = in.nextInt();

			switch (choice) {
				case 1: 
					System.out.print("Enter element: ");
					int ele = in.nextInt();
					s.push(ele);
					break;
				case 2:
					System.out.println("Popped Element: " + s.pop());
					break;
				case 3: 
					s.print();
			}
		} while (choice != 0);
	}
}
