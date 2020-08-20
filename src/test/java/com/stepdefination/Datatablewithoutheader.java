package com.stepdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datatablewithoutheader {
WebDriver driver;
	@Given("user enter the login page")
	public void user_enter_the_login_page() {
		System.setProperty("webdriver.chrome.driver","D:\\WorkSpace\\NewCucumberProject\\File\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("user enter the username password")
	public void user_enter_the_username_password(DataTable dataTable) {
		 List<String> soundar=dataTable.asList(String.class);
		String username= soundar.get(0);
		String password=soundar.get(1);
		  
	driver.findElement(By.id("txtUsername")).sendKeys(username);;
	  driver.findElement(By.id("txtPassword")).sendKeys(password);;
	    
	
	}

	@Then("user click to enter")
	public void user_click_to_enter() {
		driver.findElement(By.id("btnLogin")).click();
	    
	}

	@And("close the driver")
	public void close_the_driver() {
	    driver.quit();
	}

}
