package com.guru.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.guru.constants.GuruConstants;

public class GuruBankHomePage extends GuruConstants {
	
	/*@FindBy(xpath="//input[@name='uid']") WebElement uname;
	@FindBy(xpath="") WebElement password;
	@FindBy(xpath="") WebElement logbtn;
	@FindBy(xpath="//input[@value='RESET']") WebElement resetbtn;
	*/
	public boolean login(String uid,String pwd )
	{
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(uid);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		boolean res=false;
		if(driver.getCurrentUrl().contains("Managerhomepage"))
		{
			res=true;
		}
		return res;
		
	}
	
	

}
