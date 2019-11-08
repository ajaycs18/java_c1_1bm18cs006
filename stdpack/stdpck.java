import SEE.*;
import CIE.*;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter n: ");
		int n = in.nextInt();		
		
		for (int i = 0; i < n; i++) {
			Internals inter = new Internals();
			External exter = new External();
			inter.show();
			exter.show();
		}
	}
}
