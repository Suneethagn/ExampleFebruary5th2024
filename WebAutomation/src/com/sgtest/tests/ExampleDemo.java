package com.sgtest.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleDemo 
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{	
		launchBrowser();
		navigateURL();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new FirefoxDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigateURL()
	{
		try
		{
			oBrowser.get("http://localhost/user/submit_tt.do");
			Thread.sleep(5000);//5sec
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
