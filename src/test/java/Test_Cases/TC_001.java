package Test_Cases;

import java.time.Duration;

import org.openqa.selenium.devtools.v122.fedcm.model.Account;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base_objective.Account_creation;
import Base_objective.After_registration_page;
import Base_objective.Home_page;
import Test_base.Test_base;

public class TC_001 extends Test_base {
@Test(groups = {"regression","master"})
public void execute() throws Exception
{
Home_page h1=new Home_page(driver);
h1.click_on_myaccount();
h1.click_on_register();

Account_creation ac=new Account_creation(driver);
//driver.manage().window().wait(Duration.ofSeconds(10));
ac.inputfirstname(randomeString());
ac.inputlastname(randomeString());
ac.mail(randomAlphaNumeric());
ac.contect_number(randomeNumber());
String pass=randomeString();
ac.input_password(pass);
ac.input_confirm_password(pass);
ac.click_policy_box();
ac.register();
After_registration_page aft=new After_registration_page(driver);
String msg=aft.verification();
System.out.println(msg);

Assert.assertEquals(msg, "Your Account Has Been Created!");


}
}
