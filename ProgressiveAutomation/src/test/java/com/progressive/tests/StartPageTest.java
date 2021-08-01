package com.progressive.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.progressive.base.TestBase;
import com.progressive.pages.StartPage;
import com.progressive.pages.VehicleInfoPage;

public class StartPageTest extends TestBase{
	StartPage startPage;
	VehicleInfoPage vechileinfoPage;
	public StartPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		StartPage startPage = new StartPage();
	}
	
	@Test
	public void startPageTitle() {
		String title = startPage.validateloginPageTitle();
		Assert.assertEquals(title,"Top-Rated Insurance Company for Auto & More" );
		
	}
	@Test
	public void testclickautobtn() {
		startPage.clickautoButton();
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
}
