package databank;

public class Bank {
	static int count = 0;
	public Bank() {
		System.out.println("Bank created " + ++count);
	}
}
