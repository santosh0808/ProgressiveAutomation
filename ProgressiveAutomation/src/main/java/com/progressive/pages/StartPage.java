package com.progressive.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.progressive.base.TestBase;

public class StartPage extends TestBase {

	//Page OR 
	@FindBy(xpath="//img[@src='https://www.progressive.com/content/images/domainprogressive/wh3/base/icons/logo-progressive.svg']")
	WebElement Autobtn;
	@FindBy(name="ZipCode")
	WebElement ZipCode;
	@FindBy(name="qsButton")
	WebElement Quotebtn;
	@FindBy(name="NameAndAdressEdit_embedded_questions_list_FirstName")
	WebElement FirstName;
	@FindBy(name="NameAndAdressEdit_embedded_questions_list_LastName")
	WebElement LastName;
	@FindBy (name="NameAndAdressEdit_embedded_questions_list_DateOfBirth")
	WebElement DateOfBirth;
	@FindBy (name="NameAndAdressEdit_embedded_questions_list_MailingAddress")
	WebElement MailingAddress;
	@FindBy (name="NameAndAdressEdit_embedded_questions_list_City")
	WebElement City;
	
	//Initializing page objects
	public StartPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Action
	public String validateloginPageTitle() {
		return driver.getTitle();
	}
	public void clickautoButton() {
		Autobtn.click();
		
		
	}
	
	

}
