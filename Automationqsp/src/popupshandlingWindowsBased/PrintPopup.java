package popupshandlingWindowsBased;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		

	}

}
