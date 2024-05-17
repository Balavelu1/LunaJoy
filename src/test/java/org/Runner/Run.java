package org.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\User\\eclipse-workspace2\\Lunajoy\\src\\test\\java\\Features_Luna", 
glue = "org.Steps_Luna", dryRun = false, monochrome = true

)

public class Run {
	public static WebDriver driver;

	@BeforeClass

	public static void openbro() {

		driver = new ChromeDriver();
	}

	@AfterClass
	public static void closebro() {
		driver.quit();

	}

}
