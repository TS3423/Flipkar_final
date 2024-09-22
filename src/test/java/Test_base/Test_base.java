package Test_base;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.github.dockerjava.api.model.Driver;

import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_base {
	static public  WebDriver driver;
public Properties p;
@BeforeTest(groups = {"master","sanity","regression"})
@Parameters ({"os","broswer"})
public void start(String os,String br) throws IOException
{
	FileInputStream fs=new FileInputStream(".//src//test//resources//filee.properties");
	p=new Properties();
	p.load(fs);
	System.out.println(p.getProperty("execution_env"));
	if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
	{
//		os
		DesiredCapabilities cap=new DesiredCapabilities();
		if(os.equalsIgnoreCase("window"))
		{
			cap.setPlatform(Platform.WIN11);
		}
		else if(os.equalsIgnoreCase("linux"))
		{
			cap.setPlatform(Platform.LINUX);
		}
		else
		{
			System.out.println("No matching os..");
			return;
		}
//		browser
		switch(br.toLowerCase())
		{
		case "chrome" :cap.setBrowserName("chrome") ;
		break;
		case "edge" :cap.setBrowserName("edge");
		break;
		default: System.out.println("No matching browser.."); return;
		}
		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);

	}
	
	
	else if (p.getProperty("execution_env").equalsIgnoreCase("local"))
	{
	switch (br.toLowerCase()) {
	case "chrome":WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	break;
	case "edge":WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	break;
		default:System.out.println("wrong u type");
		break;
	}
	}
	{
	
	}
//	FileInputStream fs=new FileInputStream(".//src//test//resources//filee.properties");
//	p=new Properties();
//	p.load(fs);

	FileInputStream fs1=new FileInputStream(".//src//test//resources//filee.properties");
	p=new Properties();
	p.load(fs1);


	

	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(p.getProperty("appURl"));
	driver.manage().window().maximize();
}
	

@AfterClass
public void teaedown()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.close();
}
public String randomeString()
{
	String generatedString=RandomStringUtils.randomAlphabetic(5);
	return generatedString;
}

public String randomeNumber()
{
	String generatedString=RandomStringUtils.randomNumeric(10);
	return generatedString;
}

public String randomAlphaNumeric()
{
	String str=RandomStringUtils.randomAlphabetic(3);
	String num=RandomStringUtils.randomNumeric(3);
	
	return (str+"@"+num+"gmail.com");
}
public String captureScreen(String tname)
{
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\Screen_shot\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;
}

}
