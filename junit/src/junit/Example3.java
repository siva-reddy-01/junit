package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class Example3
{
	

	@Test
	public void test() 
	{
		
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
		assertEquals(c,+c);
		
	}

	
	

	

}
