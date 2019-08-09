import java.util.Scanner;

class Prog1 {
	public static void main(String[] args) {
		System.out.println("Enter the coefficients: ");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
		int D = b*b - 4*a*c;
		if (D == 0) {
			System.out.println("Roots are equal: " + -b/2*a);
		} else if (D > 0) {
			System.out.println("Roots are real: " + (-b + Math.sqrt(D))/2*a + (-b - Math.sqrt(D))/2*a);
		} else {
			System.out.println("Roots are imaginary");
		}
 	}
}
