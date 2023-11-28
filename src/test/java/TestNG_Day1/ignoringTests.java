package TestNG_Day1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignoringTests {
	
	String myExpectedName = "Gothem";

	@Test(enabled=true, groups= {"SmokeTest"})
	public void testPrintMessage() {
		System.out.println("This is the message == Happy Holidays!");
	}
	
	@Test(groups= {"Regression"})
	public void assertTesting() {
		String actualName = "Gautam";
		AssertJUnit.assertEquals(actualName, myExpectedName);
		
		
	}
	
	
	
	
	
	
	

}
