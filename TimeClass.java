import java.util.Scanner;

class Time {
	int h, m, s;

	Time(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}

	void advance(int hr, int min, int sec) {
		s += sec;
		m += min + s/60;
		s %= 60;
		h += hr + m/60;
		m %= 60;
		h %= 24;
	}

	void currentTime(int hr, int min, int sec) {
		h = hr;
		m = min;
		s = sec;
	}

	void print() {
		System.out.println("Time: " + h + ":" + m + ":" + s);
	}
}

class Main {
	public static void main(String[] args) {
		Time t1 = new Time(1, 59, 45);
		Time t2 = new Time(13, 38, 34);

		t1.print();
		t1.advance(3, 50, 50);
		t1.print();

		t2.print();
		t2.currentTime(5, 32, 23);
		t2.print();
	}
}
