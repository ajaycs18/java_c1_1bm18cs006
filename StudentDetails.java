import java.util.Scanner;

class Student{
	String USN, name;
	int[] marks, credits;
	float[] grades;

	Student() {
		Scanner in = new Scanner(System.in);

		System.out.print("enter name: ");
		this.name = in.next();

		System.out.print("enter usn: ");
	       	this.USN = in.next();

		System.out.print("enter no. of subjects: ");
		int n = in.nextInt();

		marks = new int[n];
		credits = new int[n];
		grades = new float[n];

		System.out.println();
	}

	void accept() {
		Scanner in = new Scanner(System.in);

		System.out.printf("enter marks for %s: ", name);
		for (int i = 0; i < marks.length; i++) 
			marks[i] = in.nextInt();

		System.out.printf("enter credits for %s: ", name);
		for (int i = 0; i < credits.length; i++) 
			credits[i] = in.nextInt();
	}

	void display() {
		System.out.println("------------Details--------------");

		System.out.println("Name: " + name);
		System.out.println("USN: " + USN);

		System.out.println("Marks: ");
		for (int i = 0; i < marks.length; i++) 
			System.out.print(marks[i] + " ");
		System.out.println();
		
		System.out.println("Credits: ");
		for (int i = 0; i < credits.length; i++)
			System.out.print(credits[i]+ " ");
		System.out.println();
		
		System.out.println("SCGPA: " + calcSGPA());

		System.out.println("--------------------------------");
	}

	float calcSGPA() {
		float total_marks = 0;
		grades = marksToGrades();

		for (int i = 0; i < credits.length; i++)
			total_marks += grades[i] * credits[i];

		int total_credits = 0;
		for (int i = 0; i < credits.length; i++)
			total_credits += credits[i];

		return total_marks / total_credits; 
	}

	float[] marksToGrades() {
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] >= 40)
				if (marks[i] >= 50)
					if (marks[i] >= 60)
						if (marks[i] >= 75)
							if (marks[i] >= 90)
								grades[i] = 10;
							else
								grades[i] = 9;
						else
							grades[i] = 8;
					else
						grades[i] = 7;
				else
					grades[i] = 6;
			else
				grades[i] = 0;
		}

		return grades;
	}
}	

class Main {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();

		s1.accept();
		s1.display();

		s2.accept();
		s2.display();
	}
}
