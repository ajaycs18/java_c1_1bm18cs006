import java.util.Scanner;

abstract class Person {
	String name, address;
	int age;
	Scanner in = new Scanner(System.in);
	Person() {
		System.out.print("enter name: ");
		name = in.next();
		System.out.print("enter address: ");
		address = in.next();
		System.out.print("enter age: ");
		age = in.nextInt();
	}
	abstract float getAverage();
	abstract String show();
}

abstract class Student extends Person {
	int roll, sem;
	Student() {
		System.out.print("enter roll: ");
		roll = in.nextInt();
		System.out.print("enter sem: ");
		sem = in.nextInt();
	}
	String show() {
		return name;
	}
}

class Exam extends Student {
	int marks1, marks2;
	Exam() {
		System.out.print("enter marks1: ");
		marks1 = in.nextInt();
		System.out.print("enter marks2: ");
		marks2 = in.nextInt();
		System.out.println();
	}

	float getAverage() {
		return (marks1 + marks2) / 2;
	}
}

class PersonMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter number of persons: ");
		int n = in.nextInt();

		Person[] persons = new Exam[n];
		for (int i = 0; i < n; i++) {
			persons[i] = new Exam();
		}

		float[] avgs = new float[n];
		for (int i = 0; i < n; i++) {
			avgs[i] = persons[i].getAverage();
		}

		float maxAvg = avgs[0];
		int index = 0;
		for (int i = 1; i < n; i++) {
			if (maxAvg < avgs[i]) {
				index = i;
				maxAvg = avgs[i];
			}
		}

		System.out.println("topper is: " + persons[index].show());
	}
}
