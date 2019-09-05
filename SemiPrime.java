import java.util.Scanner;

class SemiPrimeMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String possible = "no";

		for (int i = 1; i <= num / 2; i++) {
			int first = i, second = num - i;
			if (isSemiPrime(first) && isSemiPrime(second))
//				System.out.println(first + " true " + second);
				possible = "yes";
		}

		System.out.println(possible);
	}

	static boolean isSemiPrime(int n) {
		int count = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				if (isPrime(i) && isPrime(n / i) && (n / i != i))
					return true;
		}

//		 semiprimes have [1, 2 distinct primes, no. itself] as their factors.
		return false;
	}

	static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}
}
