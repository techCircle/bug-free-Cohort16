package TestNG_Day2;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamWithDataProvider {
	
	
	@DataProvider(name="dataProvider1")
	public Object[][] nameOfTheMethod(){
		return new Object [][] {{"Shafkat", "Leather Jacket", 37}, {"Saroj", "T-Shirt", 24},{"April","Khakis", 21}, {"Summer","Polar Bear Jacket", 88}};
	}
	
	@Test(dataProvider="dataProvider1")
	public void printDataProvider(String name1, String name2, int age) {
		System.out.println("My name is " + name1 + ", and I am wearing " + name2 + ". And i am " + age + " years old.");

	}
	
	

}
