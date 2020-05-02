package strategy;

public class Multiplication  implements Strategy{

	@Override
	public void opreation(int num1, int num2) {
		System.out.println("Multiplication of two numbers "+ (num1*num2));
	}

}
