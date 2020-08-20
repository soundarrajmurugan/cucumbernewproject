package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	WebDriver driver;
	
	@Given("user the the  google page")
	public void user_the_the_google_page() {
		System.setProperty("webdriver.chrome.driver","D:\\WorkSpace\\NewCucumberProject\\File\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	}

	@When("enter the value")
	public void enter_the_value() {
		driver.get("https://www.google.com/");
	   
	}
	@Then("click the submit button")
	public void click_the_submit_button() {
		WebElement soundar=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		soundar.sendKeys("soundar" );
		soundar.sendKeys(Keys.ENTER);
	    
	}
	@And("user see the result")
	public void user_see_the_result() {
		driver.quit();
		
		
	    
	}

}
