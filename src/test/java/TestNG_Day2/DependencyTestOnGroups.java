package TestNG_Day2;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestOnGroups {
	
	
	@Test (groups="cohort16")
	public void testPrintMessage() {
		System.out.println("Printing testPrintMessage()");
		AssertJUnit.assertTrue(true);
	}
	
	
	@Test (groups="cohort16")
	public void testPrintMessage2() {
		System.out.println("Printing testPrintMessage2()");
		AssertJUnit.assertTrue(true);
	}
	
	@Test(dependsOnGroups={"cohort16"})
	public void testSaluteGroups() {
		System.out.println("Printing this from TestSaluteGroups");
	}
	
	
	
	
	
	
	
	
	
	
	

}
