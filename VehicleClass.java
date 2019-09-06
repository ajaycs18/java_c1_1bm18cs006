import java.util.Scanner;

class Vehicle {
	String model;
	int year;
	String color;
	static int total_number_of_vehicles;

	Vehicle() {
		model = "";
		year = 0;
		color = "";
		total_number_of_vehicles++;
	}

	Vehicle(String model, int year, String color) {
		this.model = model;
		this.year = year;
		this.color = color;
		total_number_of_vehicles++;
	}

	void output() {
		System.out.println("model: " + model + " year: "+ year + " color: " + color);
	}

	static int displayNum() {
		return total_number_of_vehicles;
	}
}

class VehicleMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter num: ");
		int num = in.nextInt();

		Vehicle[] v = new Vehicle[num];
		System.out.println("enter vehicles data: ");
		for (int i = 0; i < num; i++) {
			v[i] = new Vehicle(in.next(), in.nextInt(), in.next());
		}
		
		for (int i = 0; i < num; i++) {
			v[i].output();
		}

		System.out.println("total number of vehicles: " + Vehicle.displayNum());
	}
}
