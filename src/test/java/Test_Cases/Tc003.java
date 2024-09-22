package Test_Cases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base_objective.After_login;
import Base_objective.Creadential_page;
import Base_objective.Home_page;
import Test_base.Test_base;

public class Tc003 extends Test_base {
@Test(groups = {"sanity"})
public void start() throws IOException
{
	try {
	FileInputStream fs=new FileInputStream(".//src//test//resources//filee.properties");
	p=new Properties();
	p.load(fs);
	Home_page h1=new Home_page(driver);
	h1.click_on_myaccount();
	h1.Click_on_logon();
	
	Creadential_page c1=new Creadential_page(driver);
	c1.input_mail(p.getProperty("email"));
	c1.input_password(p.getProperty("password"));
	c1.login();
	
	After_login a1=new After_login(driver);
	boolean targetpage=a1.ismyaccountpage();
	assertEquals(targetpage, false,"fail");
	}
	catch (Exception e) {
		Assert.fail();
	}
	
	
}
}
