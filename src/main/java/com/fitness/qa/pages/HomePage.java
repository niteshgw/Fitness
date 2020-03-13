package com.fitness.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fitness.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//img[@alt='Fad 2 Fit Logo']")
	@CacheLookup
	WebElement RebootLogo;

	@FindBy(xpath = "//button[@class='intake challengePopup not-allowed']")
	WebElement EnterWaterIntake;
	
	@FindBy(xpath = "//div[@class='rightnav']/ul/li[2]/a")
	WebElement Dashboard;
	

	@FindBy(xpath = "//div[@class='rightnav']/ul/li[3]/a")
	WebElement Instructions	;

	@FindBy(xpath = "//div[@class='rightnav']/ul/li[4]/a")
	WebElement UserNameDropdown;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName(){
		return RebootLogo.isDisplayed();
	}
	
	public DashboardPage clickOnContactsLink(){
		Dashboard.click();
		return new DashboardPage();
	}
	
	public DealsPage clickOnDealsLink(){
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink(){
		tasksLink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContactLink(){
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		
	}
	
}