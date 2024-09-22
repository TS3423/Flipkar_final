package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base_objective.Log_in_page;
import Test_base.Test_base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_rahul extends Test_base {
@Test
	public void openurl()
	{

	Log_in_page ln=new Log_in_page(driver);
	
ln.inputemail("rahul@gmail.com");
ln.inputpassword("Ra12");
ln.login();

	}

}
