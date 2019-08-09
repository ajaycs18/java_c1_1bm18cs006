import java.util.Scanner;

class Prog2 {
	public static void main(String[] args) {
		System.out.println(fib(Integer.parseInt(args[0])));
	}
	static int fib(int n) {
		int first = 1, second = 1, third = 1;
		for (int i = 0; i < n - 2; i++) {
			third = first + second;
			first = second;
			second = third;
		} 
		return third;	
	}
}
