package TestNG_Day2;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {
	
	String expectedMessage = "April";
	
	@Test
	public void TestPrintMessage() {
		System.out.println("Printing inside TestPrintMessage()");
		String actualMessage = "April";
		AssertJUnit.assertEquals(actualMessage, expectedMessage);
	}
	
	
	@Test(dependsOnMethods = {"TestPrintMessage", "thirdMethod"})
	public void testSalutationToApril() {
		System.out.println("Printing inside testSalutationToApril()");
	}
	
	
	@Test
	public void thirdMethod() {
		System.out.println("Printing inside thirdMethod()");
		AssertJUnit.assertTrue(true);
	}
	

}
