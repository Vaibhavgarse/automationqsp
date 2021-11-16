package hYBRIDFRAMEWORK;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverCommonLib extends BaseTest{
	public void waitimplicitly()
	{
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	}
	public void waitexplicitly(String TitleText,int time)
	{
		WebDriverWait wait= new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.titleContains(TitleText));
	}
	//-------------------------------------------------------------------------------------------//
   public void getScreenShot(String SSNAME) throws IOException
   {
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File src = ts.getScreenshotAs(OutputType.FILE);
	   File dest = new File(SCREENSHOT_PATH+SSNAME+".png");
	   Files.copy(src, dest);
	   
   }
   //-----------------------------------------------------------------------------//
   public void selectTheOptions(WebElement element,int i)
   {
	   Select sl=new Select(element);
	   sl.selectByIndex(i);
	   
   }
   public void selectTheOptions(WebElement element,String value)
   {
	   Select sl=new Select(element);
	   sl.selectByValue(value);
	   
   }
   public void selectTheOptions(String text,WebElement element)
   {
	   Select sl=new Select(element);
	   sl.selectByVisibleText(text);
   }
   //---------------------------------------------------------------------------//
   public void doubleclick(WebElement target)
   {
	   Actions act=new Actions(driver);
	   act.doubleClick(target).perform();
   }
   public void contextClick(WebElement target)
   {
	   Actions act=new Actions(driver);
	   act.contextClick(target).perform();
   }
   public void mouseHover(WebElement target)
   {
	   Actions act=new Actions(driver);
	   act.moveToElement(target).perform();
   }
   public void dragAndDrop(WebElement src,WebElement target)
   {
	   Actions act=new Actions(driver);
	   act.dragAndDrop(src, target);
   }
   //----------------------------------------------------------------------------------//
   
   public void getAllTheOptions(WebElement element)
   {
	   Select sl=new Select(element);
	   List<WebElement> options = sl.getAllSelectedOptions();
	   for(WebElement we:options)
	   {
		   String option = we.getText();
		   System.out.println(option);
		   
	   }
	System.out.println("___________________________________________________________");
   }
   //--------------------------------------------------------------------------------------------//
   public void maximizeBrowser()
   {
	   driver.manage().window().maximize();
   }
   //----------------------------------------------------------------------------------------------//
   public String getTheTitleofWebPage(String expectedTitle)
   {
	   String pagetittle = driver.getTitle();
	   System.out.println("Page Title is" +pagetittle+"and Expected page Title is "+expectedTitle);
	  return pagetittle;
   }
   //-----------------------------------------------------------------------------------------//
   public void verifyThePageTitle(String expectedTitle)
   {
	   String pagetittle = driver.getTitle();
	   
	   if (pagetittle.equalsIgnoreCase(expectedTitle))
	   {
		   System.out.println("The title of the "+pagetittle+" page is verified ! TEST CASE IS PASS");
	   }
	   else
	   {
		   System.out.println("The title of the "+pagetittle+" page is verified ! TEST CASE IS PASS");
	   }
   }
}
