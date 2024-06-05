package pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	WebDriver driver;

  
  @BeforeMethod
  public void lauchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KURO GAMING\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
  }
  
  
  @Test
  public void verifyPageTitleTest() {	  
	  String title = driver.getTitle();
	  System.out.println(title);
	  assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", title , "Title Is Not Matching");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
