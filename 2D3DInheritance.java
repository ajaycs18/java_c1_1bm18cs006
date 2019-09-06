import java.util.Scanner;

class twoD {
	int length, breadth;

	twoD() {
		length = 0;
		breadth = 0;
	}

	twoD(int l, int b) {
		length = l;
		breadth = b;
	}

	int area() {
		return length * breadth;
	}
}

class threeD extends twoD {
	int height;

	threeD() {
		height = 0;
	}

 	threeD(int l, int b, int h) {
		super(l, b);
		height = h;
	}

	int volume() {
		return area() * height;
	}
}

class InheritMain {
	public static void main(String[] args) {
		threeD obj = new threeD(2, 3, 4);
		System.out.println("area: " + obj.area());
		System.out.println("volume: " + obj.volume());
	}
}
