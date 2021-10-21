package Xpath;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScannerXpathPrize {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Laptop Name");
		String laptop=sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(laptop);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
	
		String GP=driver.findElement(By.xpath("//div[text()='Lenovo IdeaPad 3 Core i3 10th Gen - (8 GB/1 TB HDD/Windows 10 Home) 15IML05 Thin and Light Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();

		
		System.out.println(GP);
		//Lenovo IdeaPad 3 Core i3 10th Gen - (8 GB/1 TB HDD/Windows 10 Home) 15IML05 Thin and Light Laptop

	}

}
