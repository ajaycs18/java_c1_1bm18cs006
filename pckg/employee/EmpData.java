package employee;

public class EmpData {
	static int count = 0;
	public EmpData() {
		System.out.println("Employee " + ++count);
	}
}
