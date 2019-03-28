package com.guru.constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class GuruConstants {
	public static WebDriver driver;
	public static String url="http://demo.guru99.com/V2/";
	@BeforeTest
	public static void launchApp()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	 	
	}
	@AfterTest
	public static void closeApp() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}

}
