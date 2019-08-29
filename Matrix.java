import java.util.Scanner;

class Matrix {
	private int[][] m;

	Matrix() {
	    Scanner in = new Scanner(System.in);
		m = new int[2][2];
		System.out.println("enter elements: ");
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				m[i][j] = in.nextInt();
	}
	Matrix(Matrix m2) {
	    m = new int[2][2];
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				// m[i][j] = m2.get(i, j);
				m[i][j] = m2.m[i][j];
	}

	int determinant() {
		return m[0][0] * m[1][1] - m[1][0] * m[0][1]; 
	}

	boolean singular() {
		return determinant() == 0;
	}

	float[][] inverse() {
		float[][] inv = new float[2][2];
		int d = determinant();
		inv[0][0] = m[1][1] / d;
		inv[1][1] = m[0][0] / d;
		inv[0][1] = -m[0][1] / d;
		inv[1][0] = m[1][0] / d;
		return inv;
	}

	void print() {
		for (int[] row: m) {
			for (int ele: row) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}
	}
}

class Main {
	public static void main(String[] args) {
		Matrix m1 = new Matrix();
		m1.print();

		Matrix m2 = new Matrix(m1);
		float[][] inv = m2.inverse();
		for (float[] row: inv) {
			for (float ele: row) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}
	}
}
