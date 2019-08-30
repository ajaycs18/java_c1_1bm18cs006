import java.util.Scanner;

class Point {
	int x, y;

	Point() {
		x = 0; y = 0;
	}

	Point(int x, int y) {
		this.x = x; this.y = y;
	}

	Point(Point p) {
		x = p.x; y = p.y;
	}

	float distance(Point p) {
		return (float)(Math.sqrt(Math.pow(x-p.x, 2) + Math.pow(y-p.y, 2)));
	}
}

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Point p1 = new Point(); // origin, can be user input also

		System.out.print("enter coordinates of 2nd point: ");
		Point p2 = new Point(in.nextInt(), in.nextInt());

		System.out.println("distance between the two points: " + p1.distance(p2));
	}
}
