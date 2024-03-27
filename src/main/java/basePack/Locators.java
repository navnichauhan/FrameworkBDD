package basePack;

import org.openqa.selenium.By;

public class Locators{
	
	
	/*<--Sign In-->*/
	//public static String signin="//div[@class='panel header']//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2luZGV4Lw%2C%2C/']";
	
	public static String signin="//div[@class='panel header']//a[contains(text(),'Sign In')]//parent::a";
	
	public static String username="//input[@id='email']";
	
	public static String password="//fieldset[@class='fieldset login']/div/div/input[@id='pass']";
	
	public static String signinclick="send";
	
	
	/*<--Sign out-->*/
	public static String signinmessage="div[@class='panel header']//li/span[contains(text(),'Welcome')]";
			//div[@class='panel header']//li[@class='greet welcome']/span[contains(text(),'Welcome')]";
	
	public static String signoutarrow="//span[@class='customer-name']/button[@class='action switch']";
	public static String signout="//div[@class='panel header']//li[1]/following::li[1]//a[contains(text(),'Sign Out')]";
	//public static String signoutmessage="//h1[@class='page-title']/span[contains(text(), 'Customer Login')]";
	public static String list="//div[@class='panel header']//div[@class='customer-menu']/ul/li/a";
	
	/*<--Forget Password-->*/
	public static String forgetpasswordbutton="//a[@class='action remind']/span[contains(text(),'Forgot Your Password?')]";
	public static String forgetemail="//input[@id='email_address']";
	public static String reset="//span[text()='Reset My Password']";
	
	public static String forgetmessage="//div[@class='message-success success message']";
	
	//Sibling to another child sibling Traverse
	//By.xpath(//header/div/button[1]/following-sibling::button[1]);
	
	//Sibling to another child sibling Traverse---- Only applicable for xpath
	//By.xpath(//header/div/button[1]/parent::div/parent::div/a);
	
	
	/*<--Create User Account-->*/
	
	public static String createacc="//button[@class='action submit primary']/span";
	
	

}
