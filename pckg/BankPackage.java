/*
Write a class Bank in a Package called DataBank .Create a Employee class to another package, which will make a object reference of Bank class and use all functionality of Bank class
*/

import databank.Bank;
import employee.EmpData;

class Demo {
	public static void main(String[] args) {
		Bank b1 = new Bank();
		EmpData e1 = new EmpData();
		
		Bank b2 = new Bank();
		EmpData e2 = new EmpData();
	}
}
