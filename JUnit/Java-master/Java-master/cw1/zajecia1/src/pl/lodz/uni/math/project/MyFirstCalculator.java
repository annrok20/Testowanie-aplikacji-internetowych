package pl.lodz.uni.math.project;

public class MyFirstCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calculator = new Calculator(7,8);
		
		calculator.add();
		
		calculator.getResult();
		
		calculator.setFisrtDigit(10);
		calculator.setSecondDigit(5);
		
		calculator.add();
		
		System.out.println(calculator.getResult());
	}

}
