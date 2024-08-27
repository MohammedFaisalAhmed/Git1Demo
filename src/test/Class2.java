package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {
	@Test
	public void Demo3()
	{
		
	System.out.println("OK");
	}
	
@BeforeTest
public void prerequiste()
{
	System.out.println("I will execute first this");
}

@Test(groups= {"Smoke"})
public void Smoke1()
{
	
System.out.println("Smoke test case run1");
}
}
