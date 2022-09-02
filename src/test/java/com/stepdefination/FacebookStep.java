package com.stepdefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookStep {

	WebDriver driver;

	@Given("User logins to facebook")
	public void user_logins_to_facebook() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}
	@When("User is enters username and passowrd")
	public void user_is_enters_username_and_passowrd(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(1);
		String string = map.get(1);
		String string2 = map.get("yousuf");
		System.out.println(string2);
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys(string2);



	}




}
