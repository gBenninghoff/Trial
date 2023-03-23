import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testPressDigit() {
		Calculator c = new Calculator();
		
		c.pressDigit("1");
		c.pressOp("+");
		c.pressDigit("0");
		
		
		assertEquals(c.getResult(),1);
		
	}
	
	@Test
	void testInvalidDigit() {
		Calculator c = new Calculator();
		
		try {
			c.pressDigit("12");
			fail();
		} catch (Exception e ) {
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}