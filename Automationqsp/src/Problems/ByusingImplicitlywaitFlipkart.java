package Problems;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class ByusingImplicitlywaitFlipkart {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobile");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	driver.findElement(By.xpath("//div[@class='_3879cV' and .='6 GB & Above Vaibhav']")).click();//exception after 30 sec
	

	}

}
