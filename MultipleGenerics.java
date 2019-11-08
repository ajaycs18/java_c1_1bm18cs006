// Write a program to demonstrate generics with multiple object parameters

class Display<T1, T2> {
	Display(T1 obj1, T2 obj2) {
		System.out.println(obj1 + " " + obj2);
	}
}


class Main {
	public static void main(String[] args) {
		new Display<Integer, Character>(1, 'a');
		new Display<String, Character>("abcd", 'z');
		new Display<Float, Integer>(1.0f, 2);
	}
}
