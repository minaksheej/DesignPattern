package command2;

public class App {

	public static void main(String[] args) {
		Algorithm algorithm = new Algorithm();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				algorithm.produce();

			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				algorithm.consume();

			}
		});

		t1.start();
		t2.start();
	}

}
