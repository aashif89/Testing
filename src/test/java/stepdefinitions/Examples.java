package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Examples {
	static WebDriver driver;
	
	@Given("User in adactin login page")
	public void userInAdactinLoginPage() {
		driver.get("https://adactinhotelapp.com/");
	}
	@When("User enter {string} and {string}")
	public void userEnterAnd(String Username, String password) {
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	@When("click on login button")
	public void clickOnLoginButton() {
		driver.findElement(By.id("login")).click();
	}
	@Then("to display success message")
	public void toDisplaySuccessMessage() {
		System.out.println("Successfully logged in");
	}
	

}
