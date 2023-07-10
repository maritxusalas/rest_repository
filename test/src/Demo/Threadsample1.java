package Demo;

class Threadsample1 extends Thread{
	public void run() {
		System.out.println("Thread is activated");
	}

	public static void main(String[] args) {
		Threadsample1 ts1 = new Threadsample1();
		ts1.start();

	}

}
