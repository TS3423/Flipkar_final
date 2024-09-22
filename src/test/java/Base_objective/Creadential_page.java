package Base_objective;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Creadential_page extends Base_class {
public Creadential_page(WebDriver driver)
{
	super(driver);
}
@FindBy(xpath ="//input[@id='input-email']" )
WebElement email;
@FindBy(xpath ="//input[@id='input-password']" )
WebElement password;

@FindBy(xpath ="//input[@value='Login']" )
WebElement login;



//--------------------------------------method-----------------
public void input_mail(String mail)
{
	 email.sendKeys(mail);
}
public void input_password(String pass)
{
	password.sendKeys(pass);
}

public void login()
{
	login.click();
}
}
