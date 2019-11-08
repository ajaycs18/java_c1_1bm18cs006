package CIE;

public class Internals extends Student {
	int[] marks = new int[5];
	public Internals() {
		System.out.print("enter marks: ");
		for (int i = 0; i < 5; i++) {
			marks[i] = in.nextInt();
		}
	}
	public void show() {
		for (int i = 0; i < 5; i++)
			System.out.print(marks[i] + " ");
		System.out.println();
	}
}
