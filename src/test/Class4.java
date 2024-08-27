package test;

import org.testng.annotations.Test;

public class Class4 {
	@Test
	public void WebLoginHomeLOan()
	{
		
	System.out.println("WebLoginHome");
	
	
	}
	
	@Test(timeOut=4000)
	public void MobileLoginbHomeLoan()
	{
		
	System.out.println("MobileLoginHome");
	
	
	}
	@Test
	public void APILoginbHomeLoan()
	{
		
	System.out.println("APILoginbHome");
	
	
	}
	
	public void RestAPILoginbHomeLoan()
	{
		
	System.out.println("RestAPILoginbHome");
	
	
	}
	@Test(groups= {"Smoke"})
	public void Smoke3()
	{
		
	System.out.println("Smoke test case run3");
	}
	

}




