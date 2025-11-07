package genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class webdriverUtility {
	
	public void waitToPageLoad(WebDriver driver,int sec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	public void maximizeWindow(WebDriver driver)
	{
	driver.manage().window().maximize();	
	}
	
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement dst)
	{
     Actions act=new Actions(driver);
     act.dragAndDrop(src, dst);
	}

}
