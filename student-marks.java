import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("enter number of students: ");
		int numStudents = in.nextInt();

		System.out.print("enter number of subjects: ");
		int numSubjects = in.nextInt();

		float[][] marks = new float[numStudents + 2][numSubjects + 2]; // create array, avg = numStudents + 2 column, total = numStudents + 1 column, same for subjects

		System.out.println("------enter the details------");
		for (int i = 0; i < numStudents; i++) {
			System.out.print("enter marks of student " + (i+1) + ": ");
			for (int j = 0; j < numSubjects; j++) {
				marks[i][j] = in.nextFloat();
			}
		}

		setStudentTotMarks(marks);
		setStudentAvg(marks);

		setSubjectTotMarks(marks);
		setSubjectAvg(marks);

		System.out.println("-------------final student marks details are-------------");
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++) {
				System.out.print(marks[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void setStudentTotMarks(float[][] marks) {
		for (int i = 0; i < marks.length; i++) {
			float total = 0;
			for (int j = 0; j < marks[i].length-2; j++) {
				total += marks[i][j];
			}
			marks[i][marks[i].length-2] = total; // total is 2nd last column 
		}
	}

	static void setStudentAvg(float[][] marks) {
		for (int i = 0; i < marks.length; i++) {
			marks[i][marks[i].length-1] = marks[i][marks[i].length-2] / (marks[i].length-2); // total/length excluding last 2 columns
		}
	}

	static void setSubjectTotMarks(float[][] marks) {
		for (int i = 0; i < marks[0].length; i++) {
			float total = 0;
			for (int j = 0; j < marks.length-2; j++) {
				total += marks[j][i];
			}
			marks[marks.length-2][i] = total; // total is 2nd last row 
		}
	}

	static void setSubjectAvg(float[][] marks) {
		for (int i = 0; i < marks[0].length; i++) {
			marks[marks.length-1][i] = marks[marks.length-2][i] / (marks.length-2); // total/length excluding last 2 rows
		}
	}
}
