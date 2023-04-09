package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators_try2 {
	@FindAll( {
		   @FindBy(id ="login-id"), @FindBy(xpath="//input[@id='login-id']"), @FindBy(css = "input[id='login-id']")} )
			WebElement username;
	@FindAll({
		@FindBy(id="login-password"), @FindBy(xpath = "//input[@id='login-password']"), @FindBy(css = "input[id='login-password']")
	})
	WebElement password;
	@FindAll({
		@FindBy(id="login-submit")
		})
	WebElement submit;
	public Locators_try2(WebDriver driver) {
		PageFactory.initElements(driver, this );
	}
		
		public void get_username(String user_id) throws InterruptedException {
			Thread.sleep(5000);
			username.sendKeys(user_id);
		}
		public void  get_password(String user_password) throws InterruptedException {
			Thread.sleep(5000);
			password.sendKeys(user_password);
		}
		public void get_submit() throws InterruptedException {
			Thread.sleep(5000);
			submit.click();
		}

}
