package command2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Algorithm {

	private BlockingQueue<Command> commandList;

	public Algorithm() {
		commandList = new ArrayBlockingQueue<>(10);
	}

	public void produce() {
		try {

			for (int i = 1; i < 10; i++) {
				commandList.put(new TaskSolver(new Task(i)));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void consume() {
		try {

			for (int i = 1; i < 10; i++) {
				Thread.sleep(10000);
				commandList.take().execute();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
