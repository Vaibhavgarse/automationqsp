package selfDesignFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	@FindBy(name="username") private WebElement urn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement btn;
	//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	public WebElement getUrn() {
		return urn;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getBtn() {
		return btn;
	}
	//short method for valid login
	public void loginValid(String username,String password) {
		urn.sendKeys(username);
		pass.sendKeys(password);
		btn.click();
	}
}
