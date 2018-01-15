package pl.lodz.uni.math.project;

public class Calculator {
	private int fisrtDigit;
	private int secondDigit;
	private int result;
	public Calculator (int firstDigit, int secondDigit)
	{
		this.fisrtDigit=firstDigit;
		this.secondDigit=secondDigit;
	}
	
	public int sum(int firstDigit, int secondDigit)
	{
		return firstDigit+secondDigit;
	}
	public int difference(int firstDigit, int secondDigit)
	{
		return firstDigit-secondDigit;
	}
	public int product(int firstDigit, int secondDigit)
	{
		return firstDigit*secondDigit;
	}
	public int modulo(int firstDigit, int secondDigit)
	{
		return firstDigit%secondDigit;
	}
	public boolean isModulo(int firstDigit, int secondDigit)
	{
		if (firstDigit%secondDigit==0)
			return true; 
		else 
			return false;
	}

	public void add() {
		this.result=this.fisrtDigit+ this.secondDigit;	
	}

	public int getResult() {
		return this.result;
		
	}
	public void setFisrtDigit(int fisrtDigit) {
		this.fisrtDigit = fisrtDigit;
	}
	public void setSecondDigit(int secondDigit) {
		this.secondDigit = secondDigit;
	}
	
	public String Null()
	{
		return null;
	}
 

}
