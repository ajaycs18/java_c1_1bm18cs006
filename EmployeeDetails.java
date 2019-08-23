import java.util.Scanner;

class Employee {
	int no;
	String name;
	float basic, salary, DA, IT;

	void read() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no: ");
		no = sc.nextInt();
		System.out.print("enter name: ");
		name = sc.next();
		System.out.print("enter basic: ");
		basic = sc.nextFloat();
	}

	void calcSal() {
		DA = 0.75f * basic;
		IT = 0.30f * basic;
		salary = basic + DA - IT;
	}

	void print() {
		System.out.println("no:  " + no);
		System.out.println("name: " + name);
		System.out.println("basic: " + basic);
		System.out.println("DA: " + DA);
		System.out.println("IT: " + IT);
		System.out.println("salary: " + salary);
		System.out.println("---------------------------------------");
	}
}

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter num. of employees: ");
		int n = sc.nextInt();
		Employee[] emps = new Employee[n];

		System.out.println("enter employee details: ");
		for (int i = 0; i < n; i++) {
			emps[i] = new Employee();
			emps[i].read();
			emps[i].calcSal();
		}

		System.out.println("employee details: ");
		for (int i = 0; i < n; i++) {
			emps[i].print();
		}
	}	
}	
