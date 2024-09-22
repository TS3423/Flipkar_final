package Base_objective;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_page extends Base_class{
public Home_page(WebDriver driver) {
	super(driver);
}


@FindBy(xpath = "//a[normalize-space()='Login']")
WebElement login;




//Start page(contains register and login)
@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement myaccount;

@FindBy(xpath = "//a[normalize-space()='Register']")
WebElement register;

public void click_on_myaccount()
{
	myaccount.click();
}
public void click_on_register()
{
	register.click();
}
public void Click_on_logon()
{
	login.click();
}
}
