package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
public class Class3 {
	@BeforeClass
	public void BeforeClass()
	{
		
	System.out.println("Before executing any method in the class ");
	
	
	}
	
	
	@Test
	public void WebLoginCarLOan()
	{
		
	System.out.println("WebLoginCar");
	
	
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		
	System.out.println("Execute before method ");
	
	
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		
	System.out.println( "After method Execute ");
	
	
	}
	
	@Test
	public void MobileLoginCarLoan()
	{
		
	System.out.println("MobileLoginCar");
	
	
	
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		
	System.out.println("im no 1");
	
	
	}
	
	@Test
	public void MobileSignin()
	{
		
	System.out.println("Mobile Signin");
	
	
	}
	
	@AfterClass
	public void AfterClass()
	{
		
	System.out.println("After executing all the method in the class ");
	
	
	}
	@Test
	
	public void MobileSignout()
	{
		
	System.out.println("Mobile Signout");
	
	
	}
	@Test(dependsOnMethods= {"WebLoginCarLOan","RestAPILoginbCarLoan"})
	public void APILoginbCarLoan()
	{
		
	System.out.println("APILoginbCar");
	
	
	}
	
	@Test(dataProvider="getData")
	public void RestAPILoginbCarLoan(String userName, String password)
	{
		
	System.out.println("RestAPILoginbCar");
	System.out.println(userName);
	System.out.println(password);
	
	
	
	}
	
	@Test(groups= {"Smoke"})
	public void Smoke2()
	{
		
	System.out.println("Smoke test case run2");
	}
	
@DataProvider
public Object[][] getData()
{
	Object[][] data = new Object[3][2];
	data[0][0]="firstsetusername";
	data[0][1]="firstpassword";
	data[1][0]="secondsetusername";
	data[1][1]="secondpassword";
	data[2][0]="thirdsetusername";
	data[2][1]="thirdpassword";
			
	return data;	
			
			
}
}




