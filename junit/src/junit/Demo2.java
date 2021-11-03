/**
 * 
 */
package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Dell
 *
 */
public class Demo2
{

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	public static void setUpBeforeClass() throws Exception 
	{
		try
		{
			System.out.println("BeforeAll");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		try
		{
			System.out.println("After all");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception 
	{
		try
		{
			System.out.println("BeforeEach");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	public void tearDown() throws Exception 
	{
		try
		{
			System.out.println("AfterEach");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Test
	public void test()
	{
		System.out.println("Test cases find");
		String str="Test cases find";
		assertEquals("Test cases find",str);
		
	}

}
