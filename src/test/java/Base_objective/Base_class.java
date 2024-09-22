package Base_objective;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_class {
  WebDriver driver;
public Base_class(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}




}
