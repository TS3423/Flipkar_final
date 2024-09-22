package Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base_objective.After_login;
import Base_objective.Creadential_page;
import Base_objective.Home_page;
import Test_base.Test_base;
import Utilities.DataProviders;

public class TC004 extends Test_base {
	@Test(dataProvider="login",dataProviderClass=DataProviders.class)
	public void verify_loginDDT(String email, String password, String exp)
	{
	
		try {
	
	
			Home_page h1=new Home_page(driver);
			h1.click_on_myaccount();
			h1.Click_on_logon();
			System.out.println("ccc1");
//			Creadential_page c1=new Creadential_page(driver);
			System.out.println("ccc2");

			//Login page
			Creadential_page c1=new Creadential_page(driver);
			c1.input_mail(email);
			c1.input_password(password);
		c1.login();
		After_login al=new After_login(driver);
		boolean tarpage=al.ismyaccountpage();
		System.out.println(tarpage);
		System.out.println(email+password);
		if(exp.equalsIgnoreCase("valid"))
		{
			if(tarpage==true)
			{
				al.logout();
				Assert.assertEquals(tarpage, true);
			}
			else
			{
//				Assert.assertTrue(false);
				Assert.fail();
			}
		}
//	--------------------
		if(exp.equalsIgnoreCase("invalid"))
		{
			if(tarpage==true)
			{
				al.logout();
//				Assert.assertTrue(false);
				Assert.fail();
			}
			else
			{
//				Assert.assertTrue(true);
				Assert.assertEquals(tarpage, true);
			}
		}
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
			//My Account Page
//			MyAccountPage macc=new MyAccountPage(driver);
//			boolean targetPage=macc.isMyAccountPageExists();
//			
//			if(exp.equalsIgnoreCase("Valid"))
//			{
//				if(targetPage==true)
//				{
//					macc.clickLogout();
//					Assert.assertTrue(true);
//				}
//				else
//				{
//					Assert.assertTrue(false);
//				}
//			}
//			
//			if(exp.equalsIgnoreCase("Invalid"))
//			{
//				if(targetPage==true)
//				{
//					macc.clickLogout();
//					Assert.assertTrue(false);
//				}
//				else
//				{
//					Assert.assertTrue(true);
//				}
//			}
//		}
//		catch(Exception e)
//		{
//			Assert.fail("An exception occurred: " + e.getMessage());
//		}
//			
//		logger.info("**** Finished TC_003_LoginDDT *****");
	}

}
