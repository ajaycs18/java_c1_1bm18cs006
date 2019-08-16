import java.util.Scanner;

class Rectangle {
	float length;
	float width;

	void set(int l, int w) {
		length = l;
		width = w;
	}

	void displayArea() {
		System.out.printf("Length: %.2f\nWidth: %.2f\nArea: %.2f\n\n\n", length, width, calcArea());
	}

	float calcArea() {
		return length * width;
	}
}

class Demo {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.set(11, 4);
		r1.displayArea();

		Rectangle r2 = new Rectangle();
		r2.set(5, 19);
		r2.displayArea();
	}
}
