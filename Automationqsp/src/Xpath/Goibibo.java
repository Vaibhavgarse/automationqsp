package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/hotels/");
		driver.findElement(By.xpath("//input[@class='SearchBlockUIstyles__RadioButton-sc-fity7j-7 bnBFyA']")).click();
		driver.findElement(By.xpath("//input[@class='HomePageAutosuggeststyles__SearchInputStyles-sc-1v6s32j-1 euhecC']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='TrendingDestinationsUI__PopularBigImageOverlayWrap-sc-qz22gb-4 hUOCzL']/descendant::p[.='Mysore']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Check-in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-testid='date_23_9_2021']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-testid='date_24_9_2021']")).click();
		Thread.sleep(1000);
		String NightCount=driver.findElement(By.xpath("//div[@class='dwebCommonstyles__CenteredDivWrap-sc-112ty3f-1 SearchBlockUIstyles__NightCountWrap-sc-fity7j-15 ibYPGm fypXuF']")).getText();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@class='SearchBlockUIstyles__CitySearchInput-sc-fity7j-12 uGGSH']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'])[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'])[4]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'])[6]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'])[6]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'])[7]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//ul[@class='PaxWidgetstyles__ChildDropdownWrap-sc-gv3w6r-9 cuOfFa']/descendant::li[.='10']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//div[@class='dwebCommonstyles__CenteredSpaceWrap-sc-112ty3f-0 PaxWidgetstyles__ContentActionWrapperDiv-sc-gv3w6r-5 PaxWidgetstyles__ContentActionDropdownWrapper-sc-gv3w6r-6 eHRHNU lhNBSu kfVCVI'])[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//ul[@class='PaxWidgetstyles__ChildDropdownWrap-sc-gv3w6r-9 cuOfFa']/descendant::li[.='12']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class='dwebCommonstyles__ButtonBase-sc-112ty3f-10 PaxWidgetstyles__ButtonWrapper-sc-gv3w6r-11 KETBj dIHxWr']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class='dwebCommonstyles__ButtonBase-sc-112ty3f-10 SearchBlockUIstyles__SearchButtonAutoSuggest-sc-fity7j-13 KETBj dMpVqc']")).click();
	   
	    System.out.println(NightCount +" Stay");
	 

	   
	}

}
