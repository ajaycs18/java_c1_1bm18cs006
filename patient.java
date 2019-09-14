import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Patient {
	int id, age;
	String name, doc;
	Patient() {
		Scanner in = new Scanner(System.in);
		System.out.print("enter id: ");
		id = in.nextInt();
		System.out.print("enter age: ");
		age = in.nextInt():
		System.out.print("enter name: ");
		name = in.next();
		System.out.print("enter doctor: ");
		doc = in.next();
	}

	void display() {
		System.out.println("id: " + id);
		System.out.println("age: " + age);
		System.out.println("name: " + name);
		System.out.println("doctor: " + doc);
		System.out.println();
	}
}

class PatientMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("enter number of patients: ");
		n = in.nextInt();

		Patient[] patients = new Patient[n];
		System.out.println("enter patients details: ");
		for (int i = 0; i < n; i++) {
			patients[i] = new Patients();
			patients[i].display();
		}

		String doctor;
		System.out.print("enter doctor name: ");
		doctor = in.next();
		System.out.println("everyone with " + doctor + " as their doctor");
		for (int i = 0; i < n; i++) {
			if (patients[i].doc == doctor)
				patients[i].display():
		}
	}
}
