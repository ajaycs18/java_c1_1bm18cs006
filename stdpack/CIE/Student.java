package CIE;

import java.util.Scanner;

public class Student {
	String usn, name;
	int sem;
	public Scanner in = new Scanner(System.in);
	public Student() {
		System.out.print("enter name: ");
		name = in.next();
		System.out.print("enter usn: ");
		usn = in.next();
		System.out.print("enter sem: ");
		sem = in.nextInt();
	}
}
