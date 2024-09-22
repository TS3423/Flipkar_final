package Base_objective;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Log_in_page extends Base_class{

	public Log_in_page(WebDriver driver) {
		super(driver);
		
	}
	
	
	

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement mail;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
    
	@FindBy(xpath = "//input[@value='Login']")
	WebElement click;
//	------------------------------------------------------
	public void inputemail(String email)
	{
	mail.sendKeys(email);	
	}
    
	public void inputpassword(String passwword)
	{
	password.sendKeys(passwword);	
	}
	
	public void login()
	{
		click.click();
	}
}
