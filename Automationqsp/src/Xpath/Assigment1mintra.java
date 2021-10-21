package Xpath;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment1mintra {

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
		String TshirtName=driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/descendant::h3[@class='product-brand' ] ")).getText();
		String Prize=driver.findElement(By.xpath("(//div[@class='product-sliderContainer']/ancestor::section/descendant::span[@class='product-discountedPrice'])[1]")).getText();
		String Discount=driver.findElement(By.xpath("(//div[@class='vertical-filters-filters'][4]/descendant::label[@class='common-customRadio vertical-filters-label'])[5]")).getText();
		String OrignalPrize=driver.findElement(By.xpath("(//div[@class='product-productMetaInfo' or @text()='Printed Round Neck T-Shirt'])[2]/descendant::span[@class='product-strike']")).getText();
		//Dimension Image=driver.findElement(By.xpath("//img[@src='https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/2308267/2018/1/29/11517216335231-Roadster-Men-Maroon-Printed-Round-Neck-T-shirt-5591517216335098-1.jpg']")).getSize();
		System.out.println("Name Of The Tshirt : " +TshirtName);
		System.out.println("Current Prize Of The Tshirt : " +Prize);
		System.out.println("Discount On % Prize : "+Discount);
		System.out.println("Orrignal Prize of The Product is : "+OrignalPrize);
		//System.out.println("Diamension Of the Picture : "+ Image);
		
		
		
	  // driver.findElement(By.xpath("((//div[@class='common-radioIndicator']/ancestor::div[@id='mountRoot']/descendant::div[@class='common-radioIndicator'])[9]")).click();

}
}
