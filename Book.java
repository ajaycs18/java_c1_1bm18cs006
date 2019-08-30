import java.util.Scanner;

class Book {
	private String name, author;
	private float price;
	private int num_pages;
	
	Book() {
		name = author = "";
		price = 0.0f;
		num_pages = 0;
	}

	Book(String n, String auth, float p, int num) {
		name = n;
		author = auth;
		price = p;
		num_pages = num;
	}

	void set() {
		Scanner in = new Scanner(System.in);
		System.out.println("\nenter name: ");
		name = in.next();

		System.out.println("enter author: ");	
		author = in.next();

		System.out.println("enter price: ");	
		price = in.nextFloat();

		System.out.println("enter number of pages: ");	
		num_pages = in.nextInt();
	}

	void get() {
		System.out.println(this);
	}	

	public String toString() {
		return  "\n\n" + 
			"name: " + name + "\n" + 
			"author: " + author + "\n" + 
			"price: " + price + "\n" + 
			"number of pages: " + num_pages + "\n";
	}
}

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter number of books: ");
		Book[] books = new Book[in.nextInt()];

		System.out.println("\n-----enter details of books-----");
		for (int i = 0; i < books.length; i++) {
			books[i] = new Book();
			books[i].set();
		}

		System.out.println("details of books: ");
		for (Book b: books)
			b.get();
	}
}
