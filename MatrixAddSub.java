import java.util.Scanner;

class MatrixAddSub {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter rows and columns of Matrix 1: ");
		int r1 = in.nextInt(), c1 = in.nextInt();
		int[][] m1 = new int[r1][c1];

		System.out.println("Enter elements of Matrix 1: ");
		for (int i = 0; i < r1; i++)
			for (int j = 0; j < c1; j++)
				m1[i][j] = in.nextInt();

		System.out.println("Enter rows and columns of Matrix 2: ");
		int r2 = in.nextInt(), c2 = in.nextInt();
		int[][] m2 = new int[r2][c2];
		
		System.out.println("Enter elements of Matrix 2: ");
		for (int i = 0; i < r2; i++)
			for (int j = 0; j < c2; j++)
				m2[i][j] = in.nextInt();

		if (r1 != r2 && c1 != c2)
			System.out.println("Incompatible Matrices");
	
		System.out.println("1. Addition\n2. Subtraction");
		int[][] res = new int[r1][c1]; 
		int choice = in.nextInt();
		switch(choice) {
			case 1:
				for (int i = 0; i < r1; i++)
					for (int j = 0; j < c1; j++)
						res[i][j] = m1[i][j] + m2[i][j];
				break;

			case 2:
				for (int i = 0; i < r1; i++)
					for (int j = 0; j < c1; j++)
						res[i][j] = m1[i][j] -  m2[i][j];
				break;

			default: break;
		}

		System.out.println("Resultant Matrix: ");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++)
				System.out.print(res[i][j] + " ");
			System.out.println();
		}
	}
}
