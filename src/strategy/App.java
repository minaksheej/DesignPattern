package strategy;

public class App {

	public static void main(String[] args) {
		Strategy addStrategy=new StrategyManager(new Add());
		Strategy multiStrategy=new StrategyManager(new Multiplication());
		multiStrategy.opreation(10, 20);
		addStrategy.opreation(10, 20);
	}

}
