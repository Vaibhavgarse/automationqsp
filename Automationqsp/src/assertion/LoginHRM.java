package assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginHRM {
	WebDriver driver;
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String loginpagetitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(loginpagetitle, "OrangeHRM");
		
		WebElement urn = driver.findElement(By.id("txtUsername"));
		boolean usertestbox = urn.isDisplayed();
		Assert.assertEquals(usertestbox, true);
		urn.sendKeys("admin");
		WebElement pass = driver.findElement(By.id("txtPassword"));
		boolean passtextbox = pass.isDisplayed();
		Assert.assertEquals(passtextbox, true);
		pass.sendKeys("admin123");
		WebElement loginbtn = driver.findElement(By.id("btnLogin"));
		boolean loginbutton = loginbtn.isDisplayed();
		Assert.assertEquals(loginbutton, true);
		loginbtn.click();
		String homepagetitle = driver.getTitle();
		softassert.assertEquals(homepagetitle, "Homepage");
		softassert.assertAll();
	}

}
