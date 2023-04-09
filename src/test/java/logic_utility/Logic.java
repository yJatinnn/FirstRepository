package logic_utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import locators.*;

public class Logic {
	private static WebDriver ldriver;
	private static Login_locators obj;
	public  Logic(WebDriver driver) {
		this.ldriver=driver;
	obj= new Login_locators(ldriver);
	}
	
	
		
	public void user_id(String value) {
		obj.get_username().sendKeys(value);
	}
	public void user_password(String value) {
		obj.get_password().sendKeys(value);
	}
	public void user_submit() {
		obj.get_submit().click();
	}


}
