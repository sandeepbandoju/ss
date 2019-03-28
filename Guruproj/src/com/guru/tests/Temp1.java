package com.guru.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Temp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mngr185944
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V2/");
		driver.findElement(By.name("uid")).sendKeys("mngr185944");
		driver.findElement(By.name("password")).sendKeys("ghf");
		driver.findElement(By.name("btnLogin")).click();

	}

}
