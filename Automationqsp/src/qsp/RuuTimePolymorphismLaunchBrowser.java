package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class RuuTimePolymorphismLaunchBrowser {
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Browser Name :");
		 String browserValue = sc.nextLine();
		 
		 if(browserValue.equalsIgnoreCase("Chrome"))
		 {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com");
		 driver.close();
		 }
		 else if (browserValue.equalsIgnoreCase("FireFox")){
			 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			 driver =new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.google.com");
			 driver.close();
			 
		 }
		 else 
		 {
			 System.out.println("Enter Valid Browser Name");
		 }
	}

}
