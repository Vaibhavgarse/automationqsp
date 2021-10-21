package Xpath;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_02 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Tshirt Name");
		String Tshirt=sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys(Tshirt);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[.='Women']")).click();
		/*
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[9]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[15]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("(//label[@class='common-customRadio gender-label' or text()='Men'])[1]")).click();
		//Thread.sleep(3000);
		*/
		String Name=driver.findElement(By.xpath("//div[@class='product-productMetaInfo']/descendant::h3[@class='product-brand']/following-sibling::h4[@class='product-product']")).getText();
		Thread.sleep(3000);
		//String Prize=driver.findElement(By.xpath("(//div[@class='product-productMetaInfo']/descendant::span[@class='product-discountedPrice'])[1]")).getText();
		String Prize=driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[2]/div/span[1]/span[1]")).getText();
		Thread.sleep(3000);
		System.out.println("Name of The Product :" +Name);
		System.out.println("Prize on The Product :" +Prize);
		driver.findElement(By.xpath("//img[@title='Roadster Women White Cotton Solid Round Neck T-shirt']")).click();
		Thread.sleep(3000);
		//String Size=driver.findElement(By.xpath("//div[@class='pdp-description-container']/descendant::div[@class='size-buttons-size-buttons']")).getText();
		//System.out.println("Size of The Product :"+Size);
		//String Discount=driver.findElement(By.xpath("//span[@class='pdp-discount']")).getText();
		//System.out.println("Discount on The Product :" +Discount);
		//String Rating=driver.findElement(By.xpath("//div[@class='index-overallRating']")).getText();
		//Thread.sleep(3000);
		//System.out.println("Rating of The Product :" +Rating);
		//String Details=driver.findElement(By.xpath("//div[@class='pdp-productDescriptorsContainer']")).getText();
		//Thread.sleep(3000);
		//System.out.println(Details);

	}

}
