package basePack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class LoginLocatordefine extends Base {
	
	 By signinbutton=By.xpath(Locators.signin);
     By uname=By.xpath(Locators.username);             //By class is used to locate the element
     By passwrd=By.xpath(Locators.password);
     By signclick=By.name(Locators.signinclick);
     By signinmessagedesc=By.xpath(Locators.signinmessage);
     By signoutdropdown=By.xpath(Locators.signoutarrow);
     By signoutbutton=By.xpath(Locators.signout);
     By listdropdown=By.xpath(Locators.list);
     //By signoutmessage=By.xpath(Locators.signoutmessage);
     By forgetbutton=By.xpath(Locators.forgetpasswordbutton);
     By forgetemailid=By.xpath(Locators.forgetemail);
     By resetbutton=By.xpath(Locators.reset);
     By forgetpasswordmessage=By.xpath(Locators.forgetmessage);
     
     public void signIn() throws InterruptedException
     {
    	 
    	 waitFun(signinbutton, 30, "signinbutton click");
    	 //Thread.sleep(2500);
    	 
    	// System.out.println("Open click signin");
    	/* String ele=driver.findElement(signinbutton).getText();
    	 System.out.println("Print:"+ele);*/
    	 driver.findElement(signinbutton).click();
    
     }
     
     public void user(String USER)
     {
    	 driver.findElement(uname).sendKeys(USER);
    	 waitFun(signinbutton, 20, "signinbutton click");
    	 
     }
     
     
    public void password(String PASSWORD)
     {
    	 driver.findElement(passwrd).sendKeys(PASSWORD);;
     }
    
    public void signbuttonclick()
    {
    	 waitFun(signclick, 20, "signinbutton click");
    	driver.findElement(signclick).click();
    	
    	waitFun(signinmessagedesc, 20, "signinbutton click");
    	System.out.println(driver.findElement(signinmessagedesc).getText());
        String [] name= (driver.findElement(signinmessagedesc).getText()).split(" ");
        
        String namef=name[1];
        String namel=name[2];
        String message= "Welcome,";
        String s= message.concat(" ").concat(namef).concat(" ").concat(namel);
    	Assert.assertEquals(driver.findElement(signinmessagedesc).getText(),s);
    }
    
    public void dropdownarrowclick()
    {
    	driver.findElement(signoutdropdown).click();
    }
    
    public void clicklogout()
    {
    	int i;
    	List<WebElement> signdrop= driver.findElements(listdropdown);
    	
    	for(i=0; i<signdrop.size();i++)
    	{ 
    		
    		
    		if(signdrop.get(i).getText().contains(("Sign Out")))  /* or use contain("") instead of IgnoreCase    */
    		{
    			
    			//WebElement listopt=(WebElement) options;
				     System.out.println(signdrop.get(i).getText());
					signdrop.get(i).click();
					
					break;
				}
		
    	}
        
        
    	
    } 
    
    


		public void logout()
        {
          //Assert.assertNotEquals(driver.findElement(signoutmessage).getText().equalsIgnoreCase("Customer Login"), "Customer Login");
			//waitFun(signinbutton, 30, "signinbutton click");
			String signintextvalue=driver.findElement(signinbutton).getText();
			Assert.assertEquals(signintextvalue, "Sign In");
        }
		
		public void forgetbuttonclick()
		{
			driver.findElement(forgetbutton).click();
		}
		
		

		public void forgetemail(String FORGETEMAIL) {
			// TODO Auto-generated method stub
			driver.findElement(forgetemailid).sendKeys(FORGETEMAIL);
			String emailaddress=FORGETEMAIL;
		}
		
        public void resetbuttonclick()
        {
        	driver.findElement(resetbutton).click();
        }
        
        public void Forgetsuccessmessage()
        {
        	WebElement fmessage=driver.findElement(forgetpasswordmessage);
        	String[] textemail= (fmessage.getText()).split(" ");
        	String emailadd= textemail[7];
        	//Assert.assertEquals("If there is an account associated with seeema344@gmail.com you will receive an email with a link to reset your password.",fmessage);
            if(fmessage.getText().equalsIgnoreCase("If there is an account associated with" +emailadd+ "you will receive an email with a link to reset your password."))
            {
            	
            }
        }

		
}
