package basePack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	   public static WebDriver driver;
	  
	    public static WebDriver getDriver()
	    {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\chromedriver.exe");
	    	//WebDriverManager.chromedriver().setup();
	            driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.manage().deleteAllCookies();
	    
	        
	        return driver;
	    }
	    public static void waitFun(By element,int time, String elementname)
	    {
	    	
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	    }

	}


