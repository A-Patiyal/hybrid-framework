package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro;
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		try {
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
		}catch (Exception e)
		{
			System.out.println("Unable to load properties file");
		}
	}
	public String setBrowser()
	{
		String brwsr = pro.getProperty("browser");
		if(brwsr != null)
			return brwsr;
		else
			throw new RuntimeException("Browser is not specified in config file");	
	}
	public String setQAURL()
	{
		String url = pro.getProperty("qaURL");
		if(url != null)
			return url;
		else
			throw new RuntimeException("QA URL is not specified in config file");	
	}
	public String setUserName()
	{
		String user = pro.getProperty("username");
		if(user != null)
			return user;
		else
			throw new RuntimeException("Username is not specified in config file");	
	}
	public String setPassword()
	{
		String pass = pro.getProperty("password");
		if(pass != null)
			return pass;
		else
			throw new RuntimeException("Password is not specified in config file");	
	}	
}
