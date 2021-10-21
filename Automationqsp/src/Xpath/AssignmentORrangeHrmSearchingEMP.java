package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentORrangeHrmSearchingEMP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='firstLevelMenu'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).sendKeys("Vaibhav Garse");
		driver.findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys("0512");
		driver.findElement(By.xpath("//select[@id='empsearch_employee_status']")).click();
		driver.findElement(By.xpath("//select[@id='empsearch_employee_status']/descendant::option[.='Full-Time Permanent']")).click();
		driver.findElement(By.xpath("//select[@id='empsearch_termination']")).click();
		driver.findElement(By.xpath("//select[@id='empsearch_termination']/descendant::option[.='Current and Past Employees']")).click();
		driver.findElement(By.xpath("//input[@id='empsearch_supervisor_name']")).sendKeys("SurajSir");
		driver.findElement(By.xpath("//select[@id='empsearch_sub_unit']")).click();
		driver.findElement(By.xpath("//select[@id='empsearch_job_title']/descendant::option[.='QA Engineer']")).click();
		driver.findElement(By.xpath("//select[@id='empsearch_sub_unit']")).click();
		driver.findElement(By.xpath("//select[@id='empsearch_sub_unit']/descendant::option[.='Engineering']")).click();
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		


	}

}
