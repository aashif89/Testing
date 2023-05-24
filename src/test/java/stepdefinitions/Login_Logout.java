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

public class Login_Logout {
	static WebDriver driver;
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
	}
	
	@Given("Go to the URL")
	public void goToTheURL() {
		setup();
		driver.get("https://adactinhotelapp.com/");
	}
	@When("type the username and password to perform login")
	public void typeTheUsernameAndPasswordToPerformLogin() {
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login"));
		username.sendKeys("mdaaj2706");
		password.sendKeys("shahzu2706");
		login.click();
		
	}
	@Then("Check for homepage")
	public void checkForHomepage() {
		WebElement message = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[1]"));
		String msg = message.getText();
		System.out.println(msg);
		boolean isdisplay = message.isDisplayed();
		System.out.println("is element displayed :" + isdisplay);
		
		//driver.close();
	}
	
	@Given("Verify Homepage")
	public void verifyHomepage() {
		WebElement logout = driver.findElement(By.linkText("Logout"));
		boolean isdisplay= logout.isDisplayed();
		System.out.println("is element displayed: " + isdisplay);
	}
	@When("Click on Logout button")
	public void clickOnLogoutButton() {
		WebElement logout = driver.findElement(By.linkText("Logout"));
		logout.click();
	}
	@Then("Check for loginpage screen")
	public void checkForLoginpageScreen() {
		WebElement successmsg = driver.findElement(By.xpath("//td[@class='reg_success']"));
		String txt = successmsg.getText();
		System.out.println(txt);
		boolean isdisplay= successmsg.isDisplayed();
		System.out.println(isdisplay);
	}


}
