package seleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;




public class OpenGooglecase {

	public static void main(String[] args) {
		WebDriver driver;

		ExtentHtmlReporter reporter = new ExtentHtmlReporter("report.html");
		ExtentReports extreport = new ExtentReports();
		extreport.attachReporter(reporter);
		ExtentTest test = extreport.createTest("IT");

		//System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver  = new SafariDriver();
		driver.get("https://www.wikipedia.org");

		WebElement start = driver.findElement(By.id("searchInput"));
		start.sendKeys("Software testing"+Keys.ENTER);
		//start.click();
		test.pass("Test Passed");

		driver.quit();

		extreport.flush();


	}

}
