package com.qa.ap.hybridpom.utilities;

//Listner Class user to generate extent reports
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to load the configuration file" + e.getMessage());
			e.printStackTrace();
		}
	}
	public String getBrowser()
	{
		String brwsr = pro.getProperty("browser");
		if(brwsr!=null)
		{
			return brwsr;
		}else
		{
			throw new RuntimeException("browser is not specified in config file.");
		}
	}
	public String getApplicationUrl()
	{
		String url = pro.getProperty("qaURL");
		if(url!=null)
		{
			return url;
		}else
		{
			throw new RuntimeException("qaURL is not specified in config file.");
		}
	}
	public String getStandardUsername()
	{
		String s_user = pro.getProperty("s_username");
		if(s_user!=null)
		{
			return s_user;
		}else
		{
			throw new RuntimeException("Standard username is not specified in config file.");
		}
	}
	public String getStandardUserPassword()
	{
		String s_pass = pro.getProperty("s_password");
		if(s_pass!=null)
		{
			return s_pass;
		}else
		{
			throw new RuntimeException("Standard User's Password is not specified in config file.");
		}
	}
}