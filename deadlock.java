class Handshake {
	String name;
		
	Handshake(String n) {
		name = n;
	}
	
	synchronized void request(Handshake other) {
		System.out.println(this.name + " requested");
		other.response(this);
	}
	
	synchronized void response(Handshake other) {
		System.out.println(other.name + " responded");
	}
	
	public static void main(String[] args) {
		Handshake p1 = new Handshake("p1"), p2 = new Handshake("p2");
		
		new Thread(new Runnable() {
            public void run() { p1.request(p2); }
        }).start();
        
        new Thread(new Runnable() {
            public void run() { p2.request(p1); }
        }).start();
	}
}
