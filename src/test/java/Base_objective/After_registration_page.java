package Base_objective;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class After_registration_page extends Base_class {
public After_registration_page(WebDriver driver)
{
	super(driver);
}
@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
WebElement chk_txt_box;

public String verification()
{
	try
	{
		
		return(chk_txt_box.getText());
	}
	catch(Exception e)
	{
		return(e.getMessage());
	}
}
}
