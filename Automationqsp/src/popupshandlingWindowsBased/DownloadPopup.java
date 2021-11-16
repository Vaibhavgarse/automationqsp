package popupshandlingWindowsBased;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DownloadPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		driver.findElement(By.xpath("//a[.='other languages exist']")).click();
		driver.findElement(By.xpath("(//a[.='Releases'])[2]")).click();
	    WebElement target = driver.findElement(By.xpath("//h2[.='Recent versions']"));
	    Point loc = target.getLocation();
	    int xaxis = loc.getX();
	    int yaxis = loc.getY();
	    Thread.sleep(3000);
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	    driver.findElement(By.xpath("(//p[@class='driver-download__meta']/descendant::a[.='x64'])[1]")).click();
	    Runtime.getRuntime().exec("C:\\Users\\Vaibhav Garse\\git\\repository\\Automationqsp\\autoIT\\downloadcancel1.exe");

	}

}
