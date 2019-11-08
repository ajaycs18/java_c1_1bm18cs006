// Write a program that demonstrates handling of exceptions in inheritance tree. Create a base class called “Father” and derived class called “Son” which extends the base class. In Father class, implement a constructor which takes the age and throws the exception WrongAge( ) when the input age=father’s age.

import java.util.Scanner;

class AgeException extends Exception {
	public String toString() {
		return "Exception: Invalid Age";
	}
}

 class Father {
	int fage;
	Father(int age) throws AgeException {
		System.out.print("enter fathers age: ");
		fage = new Scanner(System.in).nextInt();
		if (fage <= age || fage < 0 || age < 0) 
			throw new AgeException();
	}	
 }

class Son extends Father {
	int sage;
	Son(int age) throws AgeException {
		super(age);
		sage = age;
	}
}

class Main {
	public static void main(String[] args) {
		System.out.print("enter son's age: ");
		try {
			Son test = new Son(new Scanner(System.in).nextInt());	
		} catch (AgeException e) {
			System.out.println(e);
		}
	}
}
