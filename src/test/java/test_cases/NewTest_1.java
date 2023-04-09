package test_cases;

import org.testng.annotations.Test;

import facebook_TC.Before_after_suite;
import logic_utility.Logic;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NewTest_1 extends Before_after_suite {
	private WebDriver driver;
	@BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\jatiny\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			
		  driver = new ChromeDriver();
		
		  System.out.println("this is before test method");
		  //assertEquals(0, 1);
		  
		  
	  }
	
	@BeforeMethod
	public static void login() {
		System.out.println("executes before every test cases");
	}

	/*
	 * @Test(priority = 0, groups = "household") public void f() throws
	 * InterruptedException {
	 * driver.get("https://development.blazetrade.com/login"); Thread.sleep(10000);
	 * 
	 * 
	 * driver.manage().window().maximize(); Logic obj1= new Logic(driver);
	 * 
	 * obj1.user_id("ashi"); Thread.sleep(1000); obj1.user_password("AtomAdmin1");
	 * Thread.sleep(1000); obj1.user_submit(); Thread.sleep(2000); driver.close();
	 * System.out.println("this is first  test method"); }
	 */
  @Test(priority = 1, groups = "household")
  public static void second_test() {
	  System.out.println("second test method ");
	  
  }
  @AfterMethod
  public static void logout() {
	  System.out.println("executes after every test case");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test method");
	  
  }

}
