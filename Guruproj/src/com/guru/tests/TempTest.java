package com.guru.tests;

import org.testng.annotations.Test;

import com.guru.constants.GuruConstants;
import com.guru.library.GuruBankHomePage;

public class TempTest extends GuruConstants {
	@Test
	public void test() {
		
	
	GuruBankHomePage ghome=new GuruBankHomePage();
	ghome.login("Admin", "Adminhh");
	
	
	}
}
