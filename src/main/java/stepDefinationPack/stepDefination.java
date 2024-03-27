package stepDefinationPack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import org.testng.Assert;

import basePack.Base;
import basePack.ImplementLogin;
import basePack.LoginLocatordefine;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination extends Base {
	
	LoginLocatordefine loginobj=new LoginLocatordefine();
	
	@Given("User navigate on the page")
	public void user_navigate_on_the_page() {
		ImplementLogin.urlAccess();

        //Assert.assertEquals("https://magento.softwaretestingboard.com/", driver.getCurrentUrl());
	   
	}
	@Given("Click on signin button")
	public void click_on_signin_button() throws InterruptedException {
		
		loginobj.signIn();
        //driver.findElement(LoginLocatordefine.signinbutton).click();
		
	}
	

	@When("^Enter the useremail \"([^\"]*)\"$") 
	public void enter_the_useremail(String Username) {
		
	loginobj.user(Username);
	/*WebElement signinemail= driver.findElement(LoginLocatordefine.passwrd);
    signinemail.sendKeys(username);*/
    }
	
	
	@When("^Enter the password \"([^\"]*)\"$")
	public void enter_the_password(String pwd) {
	
	loginobj.password(pwd);
	
	 /*WebElement passwrd=driver.findElement(LoginLocatordefine.passwrd);
        passwrd.sendKeys(pwd);*/
     }
	
	     
	@Then("User is able to login successfully")
	public void user_is_able_to_login_successfully() {
		loginobj.signbuttonclick();
		
		/*driver.findElement(By.name("send")).click();*/
	}
	
	@Given("Click on dropdown button")
	public void click_on_dropdown_button() {
	    loginobj.dropdownarrowclick();
	    
	}
	@When("Select value from dropdown to logout")
	public void select_value_from_dropdown_to_logout() {
	   loginobj.clicklogout();
	}
	
	
	@Then("User is logout successfully")
	public void user_is_logout_successfully() {
	   loginobj.logout();
	}

	
	@When("click on Forget password")
	public void click_on_forget_password() {
		
		loginobj.forgetbuttonclick();
	}
	
	
	@When("Enter the email id \"([^\\\"]*)\"$")
	public void enter_the_email_id(String forgetuserid)
	{

	  loginobj.forgetemail(forgetuserid);
	}
	

	@When("click Reset my password")
	public void click_reset_my_password()
{
	loginobj.resetbuttonclick();
}
	
	
	@Then("User is getting pop message up and email")
	public void user_is_getting_pop_message_up_and_email() {
	  
	 loginobj.Forgetsuccessmessage();
	}
	
	
	
	
}

	
	
	
	
	
	
	
	


