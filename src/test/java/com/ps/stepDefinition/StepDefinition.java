package com.ps.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.*;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("^user is on shopping Page$")
	public void user_is_on_shopping_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("user is on purchase Page");

		driver.get("https://www.myntra.com/");
		
	    //throw new PendingException();
	}

	@When("^user selects categories$")
	public void user_selects_categories() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//navigate to Kids Sections
				Actions actions = new Actions(driver);
				WebElement kids1 = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/a"));
				actions.moveToElement(kids1).perform();
		//Select T-shirts from categories
				WebElement tshirts= driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/div/div/div/li[1]/ul/li[2]/a"));
				tshirts.click();
	    //throw new PendingException();
	}

	@When("^user selects age$")
	public void user_selects_age() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement age= driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[1]/section/div[1]/div[2]/ul/li[2]/label"));
		age.click();
		WebElement age2= driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[1]/section/div[1]/div[2]/div/ul/li[3]/label/div"));
		age2.click();
	    //throw new PendingException();
	}

	@Then("^user clicks on product$")
	public void user_clicks_on_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement product= driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[2]/a/div[1]/div"));
		product.click();
		//WebElement fproduct= driver.findElement(By.xpath("//*[@id=\"sizeButtonsContainer\"]/div[2]/div[4]/div[1]/button/p"));
		//fproduct.click();
		//throw new PendingException();
	}


}
