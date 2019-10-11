/*
 * Develop a Java program to create a class Student whose variables are usn, name and sem.
 * Derive a class Test from Student to include an array of cie marks of each course and their
 * corresponding credits in another array. Derive a class Exam from Test which includes an
 * array of see marks. Derive a class Result which calculates the grade for each course and
 * the SGPA. Create n student objects and displays all the above details
 */

import java.util.Scanner;

class Student {
	String usn, name;
	int sem;
	Scanner in = new Scanner(System.in);	

	void get() {
		System.out.print("enter usn: ");
		usn = in.next();
		System.out.print("enter name: ");
		name = in.next();
		System.out.print("enter sem: ");	
		sem = in.nextInt();
	}
}

class Test extends Student {
	int[] cie = new int[3], credits = new int[3];
	
	void get() {
		super.get();
		System.out.println("enter cie marks: ");
		for (int i = 0; i < 3; i++) {
			cie[i] = in.nextInt();
		}
		System.out.println("enter credits: ");
		for (int i = 0; i < 3; i++) {
			credits[i] = in.nextInt();
		}
	}
}

class Exam extends Test {
	int[] see = new int[3];

	void get() {
		super.get();
		System.out.println("enter see marks: ");
		for (int i = 0; i < 3; i++) {
			see[i] = in.nextInt();
		}
	}
}

class Result extends Exam {
	float sgpa;
	char[] grade = new char[3];
	int[] gradepoint = new int[3];

	Result() {
		super.get();
	}

	void calcGrade() {
		for (int i = 0; i < 3; i++) {
			if (see[i] > 40)
				if (see[i] > 60)
					if (see[i] > 75)
						if (see[i] > 90)
						{ grade[i] = 'S'; gradepoint[i] = 10; }
						else { grade[i] = 'A'; gradepoint[i] = 9; }
					else { grade[i] = 'B'; gradepoint[i] = 8; }
				else { grade[i] = 'C'; gradepoint[i] = 7; }
			else { grade[i] = 'D'; gradepoint[i] = 6; }
		}
	}

	void calcSGPA() {
		for (int i = 0; i < 3; i++) {
			sgpa += gradepoint[i] * credits[i]; 
		}
		int total = 0;
		for (int i = 0; i < 3; i++) {
			total += credits[i];	
		}
		sgpa = sgpa / total;
	}
}

class Demo {
	public static void main(String[] args) {
		Result r = new Result();		
		r.calcSGPA();
		r.calcGrade();

		System.out.println("SGPA: " + r.sgpa);
		for (int i = 0; i < 3; i++) 
			System.out.println("grade " + (i+1) + ": " + r.grade[i]);

	}
}
