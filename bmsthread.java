class Display implements Runnable {
	int time;
	String msg;
	Thread t;

	Display(String s, int ti) {
		time = ti; msg = s;
		t = new Thread(this);
	}

	public void run() {
		while (true) {
			System.out.println(msg);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {}
		}
	}
}

class Main {
	public static void main(String[] args) {
		Display bmsce = new Display("BMSCE", 10000);
		Display cse = new Display("CSE", 2000);

		bmsce.t.start();
		cse.t.start();
	
		try {	
			bmsce.t.join();
			cse.t.join();
		} catch (InterruptedException e) {}

	}
}
