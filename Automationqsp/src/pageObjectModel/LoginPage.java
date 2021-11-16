package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginbutton;



	//Initiallization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);


	}
	//Utilization
	public WebElement getUsn() {
		return usn;
	}


	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}


	public void actiTimeLoginValid(String validusername,String validpassword) throws InterruptedException
	{
		usn.sendKeys(validusername);
		pass.sendKeys(validpassword);
		loginbutton.click();
		Thread.sleep(2000);
		
	}
	public void actiTimeLoginInvalid(String invalidusername,String invalidpassword) throws InterruptedException
	{
		usn.sendKeys(invalidusername);
		pass.sendKeys(invalidpassword);
		loginbutton.click();
		Thread.sleep(2000);
		usn.clear();
	}
}
