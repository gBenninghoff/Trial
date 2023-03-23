import java.util.ArrayList;

public class Calculator {

	private String value1 = "";
	private String value2 = "";
	private String op = null;

	public void pressDigit(String digit){
		if(op == null){
			value1 = value1 + digit;
		} else{
			value2 = value2 + digit;
		}
	}

	public void pressOp(String op){
		if(op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*")){
			this.op = op;
		} else {
			throw new RuntimeException("Invalid Operation: " + op); 
		}
		this.op = op;
	}

	public int getResult() {
		int num1 = Integer.parseInt(value1);
		int num2 = Integer.parseInt(value2);

		value1 = "";
		value2 = "";
		
		if(op.equals("+")){
			return num1 + num2;
		}else if(op.equals("-")){
			return num1 - num2;
		}else if(op.equals("*")) {
			return num1 * num2;
		}else if(op.equals("/")) {
			return num1/num2;
		}
		return 0;

	
	
	
}
}
