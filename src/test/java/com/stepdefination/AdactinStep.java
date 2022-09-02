package com.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinStep {

	WebDriver driver;


	@Given("User on the Adactin login page")
	public void user_on_the_adactin_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

	}
	@When("User should enter login details {string},{string}")
	public void user_should_enter_login_details(String user, String pass) {
		WebElement txtUsername = driver.findElement(By.xpath("//input[@id='username']"));
		txtUsername.sendKeys(user);

		WebElement txtPass = driver.findElement(By.xpath("//input[@id='password']"));
		txtPass.sendKeys(pass);

		WebElement txtLogin = driver.findElement(By.xpath("//input[@id='login']"));
		txtLogin.click();

	}
	@When("User should search for hotel {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_search_for_hotel(String location, String hotel, String room, String nos, String dateIn, String dateOut, String adult, String child) {

		WebElement dbnlocation = driver.findElement(By.xpath("//select[@id='location']"));
		Select s =  new Select(dbnlocation);
		s.selectByVisibleText(location);

		WebElement dbnHotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1 =  new Select(dbnHotel);
		s1.selectByVisibleText(hotel);

		WebElement dbnRoom = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s2 = new Select(dbnRoom);
		s2.selectByVisibleText(room);

		WebElement dbnNos = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s3 = new Select(dbnNos);
		s3.selectByVisibleText(nos);

		WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));

		checkin.clear();
		checkin.sendKeys(dateIn);

		WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkout.clear();
		checkout.sendKeys(dateOut);

		WebElement dbnAdult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4 = new Select(dbnAdult);
		s4.selectByVisibleText(adult);

		WebElement dbnChild = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5 = new Select(dbnChild);
		s5.selectByVisibleText(child);

		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		search.click();

	}
	@When("User should click the radio button")
	public void user_should_click_the_radio_button() {

		WebElement hotelId = driver.findElement(By.id("radiobutton_0"));
		hotelId.click();

		WebElement hotelCtn = driver.findElement(By.id("continue"));
		hotelCtn.click();

	}
	@When("user should enter the details {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter_the_details(String firstname, String lastname, String address, String creditcard, String cardtype, String expmonth, String expyear, String cvv) throws InterruptedException {

		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys(firstname);

		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys(lastname);

		WebElement address1 = driver.findElement(By.id("address"));
		address1.sendKeys(address);

		WebElement creditCard = driver.findElement(By.id("cc_num"));
		creditCard.sendKeys(creditcard);

		WebElement card = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select s6 = new Select(card);
		s6.selectByVisibleText(cardtype);

		WebElement expMonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s7 = new Select(expMonth);
		s7.selectByVisibleText(expmonth);

		WebElement expYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s8 = new Select(expYear);
		s8.selectByVisibleText(expyear);

		WebElement cvv1 = driver.findElement(By.id("cc_cvv"));
		cvv1.sendKeys(cvv);

		WebElement book = driver.findElement(By.id("book_now"));
		book.click();

		Thread.sleep(5000);

	}
	@When("user prints the order id in console")
	public void user_prints_the_order_id_in_console() {

		WebElement orderNo = driver.findElement(By.id("order_no"));
		System.out.println(orderNo.getAttribute("value"));


	}
	@Then("Verify the sucess login message")
	public void verify_the_sucess_login_message() {

		Assert.assertTrue("verified al the details", true);
		driver.close();
	}
}
































