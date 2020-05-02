package strategy;

public class StrategyManager implements Strategy {
	
	private Strategy strategy;
	
	public  StrategyManager(Strategy strategy) {
		this.strategy=strategy;
		
	}

	@Override
	public void opreation(int num1, int num2) {
		strategy.opreation(num1, num2);		
	}
	
	

}
