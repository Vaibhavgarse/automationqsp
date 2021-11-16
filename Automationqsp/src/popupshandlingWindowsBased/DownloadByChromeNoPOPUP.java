package popupshandlingWindowsBased;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadByChromeNoPOPUP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
	    
		

	}

}
