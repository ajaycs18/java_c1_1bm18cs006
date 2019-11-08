package SEE;

import CIE.Student;

public class External extends Student {
	int[] marks = new int[5];
	public External() {
		System.out.print("enter external marks");
		for (int i = 0; i < 5; i++) marks[i] = in.nextInt();
	}
	
	public void show() {
		for (int i = 0; i < 5; i++) 
			System.out.print(marks[i] + " ");
		System.out.println();
	}
}
