package Test_base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Experiment {
	Properties p;
@Test
public void m1() throws Throwable
{
	FileInputStream fs=new FileInputStream(".//src//test//resources//filee.properties");

	p=new Properties();
	p.load(fs);

	System.out.println(p.getProperty("execution_env"));
	System.out.println(p.getProperty("execution env"));

}
}
