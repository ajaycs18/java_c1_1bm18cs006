import java.util.Scanner;

class MaxElement {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter rows and columns: ");

		int rows = in.nextInt(), cols = in.nextInt();
		int[][] arr = new int[rows][cols];

		System.out.println("Enter the array elements: ");

		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				arr[i][j] = in.nextInt();

		int max = 0;
		
		for (int[] row: arr) 
			for (int ele: row)
				if (ele > max) max = ele;

		System.out.println("Largest Element is: " + max);
	}
}
