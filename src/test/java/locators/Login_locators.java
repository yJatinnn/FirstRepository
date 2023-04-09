package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_locators {
	
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
	public Login_locators(WebDriver driver) {
		PageFactory.initElements(driver, this );
	}
		
		public WebElement get_username() {
			return username;
		}
		public WebElement  get_password() {
			return password;
		}
		public WebElement get_submit() {
			return submit;
		}

}
