package basePack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities extends Base {
	
	public void close() throws IOException
	{
		File srch= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srch, new File("C://dcocument.png"));	
	}
	
	
	/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));*/
	
	//Implicit Wait
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	public void closewindow()
	{
	  driver.close();
	}

}
