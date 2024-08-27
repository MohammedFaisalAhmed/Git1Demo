package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class5 {
	@Parameters({ "URL" })
	@Test
	public void WebLoginEducationLOan(String urlname)
	{
		
	System.out.println("WebLoginEducationHome");
	System.out.println(urlname);
	
	}
	

}
