package strategy;

public class Add  implements Strategy{

	@Override
	public void opreation(int num1, int num2) {
		System.out.println("sum of two nos "+ (num1+num2));
	}

}
