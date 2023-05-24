package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Background {
	static WebDriver driver;
	
	public  void setup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
	}
	@Given("User is on login page")
	public void userIsOnLoginPage() {
		setup();
		driver.get("https://adactinhotelapp.com/");
	}

	@When("user enter valid credentials and should click login button")
	public void userEnterValidCredentialsAndShouldClickLoginButton() {
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("mdaaj2706");
		password.sendKeys("shahzu2706");
		
	}
	@When("user should click login button")
	public void userShouldClickLoginButton() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}
	@Then("redirected to homepage")
	public void redirectedToHomepage() {
		WebElement message = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[1]"));
		boolean isdisplay = message.isDisplayed();
		System.out.println("is element displayed :" + isdisplay);
	}
	@Then("Validate welcome message")
	public void validateWelcomeMessage() {
		WebElement message = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[1]"));
		String msg = message.getText();
		System.out.println(msg);
		
	}

	@When("user should enter invalid credentials and click login button")
	public void userShouldEnterInvalidCredentialsAndClickLoginButton() {
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("mdaaj2706");
		password.sendKeys("shahzu2706hgs");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}



	@Then("Used should see error message")
	public void usedShouldSeeErrorMessage() {
		WebElement error = driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[5]/td[2]/div/b"));
		boolean isdisplay = error.isDisplayed();
		System.out.println("is element displayed :" + isdisplay);
	}


}
