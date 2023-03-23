import java.util.Scanner;

public class main {

	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		c.pressDigit("2");
		c.pressDigit("2");
		c.pressOp("+");
		c.pressDigit("4");
		System.out.println(c.getResult());
		
		
		
	}
}