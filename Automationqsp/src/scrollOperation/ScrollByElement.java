package scrollOperation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScrollByElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
	 WebElement target = driver.findElement(By.xpath("//a[@class='button button-with-border']"));
	 Point tr = target.getLocation();
	 int xaxis = tr.getX();
	 int yaxis = tr.getY();
	 JavascriptExecutor  js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy("+xaxis+", "+yaxis+")");
		

	}

}
