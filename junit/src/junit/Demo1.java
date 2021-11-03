package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Demo1 {

	@Test
	public void test() 
	{
		System.out.println("this is the testcase in the class");
		String str="this is not a testcse in the class";
		assertEquals("this is the testcase in the class",str);
		fail("Not yet implemented");
	}

}
