package TestNG_Day2;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestParallel {

	WebDriver driver;

	@Test
	public void method1() {
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
		driver.get("https://www.realmadrid.com/en-US");
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void method2() {
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
		driver.get("https://www.fcbarcelona.com/");
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
