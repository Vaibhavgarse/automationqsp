package hYBRIDFRAMEWORK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	//Declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBT;
	
	
	//Initialization
	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//Utilization


	public WebElement getUsn() {
		return usn;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLoginBT() {
		return loginBT;
	}
	public void loginpage(String username, String password) throws InterruptedException
	{
		usn.sendKeys(username);
		pass.sendKeys(password);
		Thread.sleep(2000);
		loginBT.click();
	}
	

}
