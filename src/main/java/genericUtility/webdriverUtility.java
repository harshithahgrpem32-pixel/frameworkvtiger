package genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class webdriverUtility {
	
	public void waitToPageLoad(WebDriver driver,int sec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

}
