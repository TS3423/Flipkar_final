package Base_objective;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class After_login extends Base_class{
	public After_login(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath =	"//h2[normalize-space()='My Account']")
WebElement myacc;

@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
WebElement logout;
 
public boolean ismyaccountpage()
{
try {
	return(myacc.isDisplayed());
}
catch (Exception e) {
	return false;
}
}

public void logout()
{
	logout.click();
}

}
