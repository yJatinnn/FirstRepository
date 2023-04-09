package facebook_TC;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Before_after_suite {
	@AfterSuite
	  public static void after_suite() {
		  System.out.println("this is after suite");
	  }
	@BeforeSuite
	public static void before_suite() {
		System.out.println("this is before suite method");
	}
}
