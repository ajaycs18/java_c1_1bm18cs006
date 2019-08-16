import java.util.Scanner;

class Sort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int n = in.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) arr[i] = in.nextInt();

		for (int i = 1; i < n; i++) {
			int j = i - 1;
			int temp = arr[i];
			while (j > -1 && arr[j] > temp) {
				arr[j + 1] = arr[j]; 
				j -= 1;	
			}
		       	arr[j + 1] = temp;
		}

		System.out.println("Sorted Array: ");
		for (int i = 0; i < n; i++) System.out.print(arr[i]);
		System.out.println();	
	}
}
