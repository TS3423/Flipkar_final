package Base_objective;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account_creation extends Base_class {
public Account_creation(WebDriver driver) {
	super(driver);
}
//account creation page
@FindBy(xpath = "//input[@id='input-firstname']")
WebElement firstname;









@FindBy(xpath = "//input[@id='input-lastname']")
WebElement lastname;

@FindBy(xpath = "//input[@id='input-email']")
WebElement email;

@FindBy(xpath = "//input[@id='input-telephone']")
WebElement phone;

@FindBy(xpath = "//input[@id='input-password']")
WebElement passwordp;

@FindBy(xpath = "//input[@id='input-confirm']")
WebElement conformpassword;

@FindBy(xpath = "//input[@name='agree']")
WebElement agree;

@FindBy(xpath = "//input[@value='Continue']")
WebElement continuue;
//-----------------------------------------
public void inputfirstname(String name)
{
	firstname.sendKeys(name);
}
public void inputlastname(String name)
{
lastname.sendKeys(name);
}
public void mail(String male)
{
	email.sendKeys(male);
}
public void contect_number(String num1)
{
	phone.sendKeys(num1);
	
}
public void input_password(String password)
{
	passwordp.sendKeys(password);
}
public void input_confirm_password(String conpass)
{
	conformpassword.sendKeys(conpass);
}
public void click_policy_box()
{
	agree.click();
}

public void register()
{
	continuue.click();
}
}
