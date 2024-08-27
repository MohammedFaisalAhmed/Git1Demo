package test;

import org.testng.annotations.AfterTest;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Class1 {
	
	@AfterSuite
	public void AfterSuite()
	{
		
	System.out.println("im very last ");
	
	
	}

	@AfterTest
	public void lastExecution()
	{
		System.out.println("Im executing last");
	}
	@Test(enabled=false)
	public void Demo()
	{
		
	System.out.println("Hello");
	Assert.assertTrue(false);
	}
	
	@Test
	public void SecondTest()
	{
		
	System.out.println("bye");
	}
}


