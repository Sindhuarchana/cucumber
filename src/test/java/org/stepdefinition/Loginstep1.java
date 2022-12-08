package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginstep1 {
	static WebDriver driver;
	@Given("The user should be open in asos homepage")
	public void the_user_should_be_open_in_asos_homepage() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.asos.com/men/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("The user has to click join signin option and after fill registration form")
	public void the_user_has_to_click_join_signin_option_and_after_fill_registration_form() {
		 WebElement account = driver.findElement(By.id("myAccountDropdown"));
		    account.click();
		    
		    WebElement joinclk = driver.findElement(By.xpath("//a[text()='Join']"));
		    joinclk.click();
		    
		    WebElement pass = driver.findElement(By.xpath("//h2[text()='Or sign up with email']"));
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("arguments[0].scrollIntoView(true)",pass);
		    
		    
		    
	}

	@When("give inavalid password and click outside the textbox")
	public void give_inavalid_password_and_click_outside_the_textbox() {
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		   email.sendKeys("ssws");
		   WebElement outreg = driver.findElement(By.xpath("//div[@id='register-container']"));
		   outreg.click();
		   
	}

	@Then("Error message for invalid password should be shown")
	public void error_message_for_invalid_password_should_be_shown() {
		boolean displayed = driver.findElement(By.id("Email-error")).isDisplayed();
	     Assert.assertTrue(displayed);
	     System.out.println("invalid email id");
	     driver.quit();
	}

	
	@Given("The user should be open in asos homepages")
	public void the_user_should_be_open_in_asos_homepages() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.asos.com/men/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("The user has to click join signin option and after fill to registration form")
	public void the_user_has_to_click_join_signin_option_and_after_fill_to_registration_form() {
		WebElement account = driver.findElement(By.id("myAccountDropdown"));
	    account.click();
	    
	    WebElement joinclk = driver.findElement(By.xpath("//a[text()='Join']"));
	    joinclk.click();
	    
	    WebElement pass = driver.findElement(By.xpath("//h2[text()='Or sign up with email']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true)",pass);
	    
	}

	@When("give inavalid pass and click outside the textbox")
	public void give_inavalid_pass_and_click_outside_the_textbox() {
		WebElement wrpass = driver.findElement(By.id("Password"));
	    wrpass.sendKeys("567glo");
	    WebElement outreg = driver.findElement(By.xpath("//div[@id='register-container']"));
		   outreg.click();
	}

	@Then("Error message for invalid pass should be shown")
	public void error_message_for_invalid_pass_should_be_shown() {
		 boolean displayed = driver.findElement(By.id("Password-error")).isDisplayed();
		 Assert.assertTrue(displayed);
		 System.out.println("invalid password");
		 driver.quit();
	}
	
	@Given("The user should be open in asos homepagess")
	public void the_user_should_be_open_in_asos_homepagess() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.asos.com/men/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("The user has to click join signin options")
	public void the_user_has_to_click_join_signin_options() {
		WebElement account = driver.findElement(By.id("myAccountDropdown"));
	    account.click();
	    
	    WebElement joinclk = driver.findElement(By.xpath("//a[text()='Join']"));
	    joinclk.click();
	}

	@Then("message for valid dircetion")
	public void message_for_valid_dircetion() {
		
	    Assert.assertTrue("verify url", driver.getCurrentUrl().contains("register?lang"));
	    System.out.println("valid page");
	    driver.quit();
	}
	
	@Given("The user should be open in asos homepages{int}")
	public void the_user_should_be_open_in_asos_homepages(Integer int1) {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.asos.com/men/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("The user has to click join signin options{int}")
	public void the_user_has_to_click_join_signin_options(Integer int1) {
		WebElement account = driver.findElement(By.id("myAccountDropdown"));
	    account.click();
	    
	    WebElement joinclk = driver.findElement(By.xpath("//a[text()='Join']"));
	    joinclk.click();
	    
	    WebElement pass = driver.findElement(By.xpath("//h2[text()='Or sign up with email']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true)",pass);
	    
	}

	@When("give firstname with special character and click outside the textbox")
	public void give_firstname_with_special_character_and_click_outside_the_textbox() {
		WebElement fname = driver.findElement(By.id("FirstName"));
	    fname.sendKeys("sindhu@!*.");
	    WebElement outreg = driver.findElement(By.xpath("//div[@id='register-container']"));
		   outreg.click();
		
	}

	@Then("Error message for invalid firstname should be shown")
	public void error_message_for_invalid_firstname_should_be_shown() {
		boolean displayed = driver.findElement(By.id("FirstName-error")).isDisplayed();
		 Assert.assertTrue(displayed);
		 System.out.println("invalid firstname");
		 driver.quit();
	}
	
	
	@Given("The user should be open in asos homepages last")
	public void the_user_should_be_open_in_asos_homepages_last() {
		
			WebDriverManager.chromedriver().setup();
		     driver=new ChromeDriver();
		    
		    driver.get("https://www.asos.com/men/");
		    
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
	}

	@When("The user has to click join signin options last")
	public void the_user_has_to_click_join_signin_options_last() {
		WebElement account = driver.findElement(By.id("myAccountDropdown"));
	    account.click();
	    
	    WebElement joinclk = driver.findElement(By.xpath("//a[text()='Join']"));
	    joinclk.click();
	    
	    WebElement pass = driver.findElement(By.xpath("//h2[text()='Or sign up with email']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true)",pass);
	}

	@When("give lastname with special character and click outside the textbox")
	public void give_lastname_with_special_character_and_click_outside_the_textbox() {
		WebElement fname = driver.findElement(By.id("LastName"));
	    fname.sendKeys("sindhu@!*.");
	    WebElement outreg = driver.findElement(By.xpath("//div[@id='register-container']"));
		   outreg.click();
	}

	@Then("Error message for invalid Lastname should be shown")
	public void error_message_for_invalid_Lastname_should_be_shown() {
		boolean displayed = driver.findElement(By.id("LastName-error")).isDisplayed();
		 Assert.assertTrue(displayed);
		 System.out.println("invalid lastname");
		 driver.quit();
	}
	
	
	@Given("The user should be open in asos homepages success logins")
	public void the_user_should_be_open_in_asos_homepages_success_logins() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.asos.com/men/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	
	}

	@When("The user has to click  signin options last")
	public void the_user_has_to_click_signin_options_last() {
		WebElement account = driver.findElement(By.id("myAccountDropdown"));
	    account.click();
	    
	    WebElement joinclk = driver.findElement(By.xpath("//a[text()='Sign In']"));
	    joinclk.click();

	}

	@When("give correct emailaddress and password and click signinss")
	public void give_correct_emailaddress_and_password_and_click_signinss() {
		WebElement email = driver.findElement(By.name("Username"));
		email.sendKeys("sindu3357@gmail.com");
		WebElement pwd = driver.findElement(By.name("Password"));
		pwd.sendKeys("1111111111");
		WebElement button = driver.findElement(By.id("signin"));
		button.click();
		
	}

	@Then("redirection should happen to my account page")
	public void redirection_should_happen_to_my_account_page() {
		Assert.assertTrue("verify url", driver.getCurrentUrl().contains("login?signin"));
	    System.out.println("invalid login page");
	    driver.quit();
	}
	
	
	@Given("The user should be open in asos homepages forget")
	public void the_user_should_be_open_in_asos_homepages_forget() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.asos.com/men/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("The user has to click  signin options forget")
	public void the_user_has_to_click_signin_options_forget() {
		WebElement account = driver.findElement(By.id("myAccountDropdown"));
	    account.click();
	    
	    WebElement joinclk = driver.findElement(By.xpath("//a[text()='Sign In']"));
	    joinclk.click();
	}

	@Then("check for forget password and validate")
	public void check_for_forget_password_and_validate() {
		boolean displayed = driver.findElement(By.xpath("//a[text()='Forgot password?']")).isDisplayed();
		 Assert.assertTrue(displayed);
		 System.out.println("forget password avilable");
		 driver.quit();
	}


	
	@Given("The user has to open asos homepage")
	public void the_user_has_to_open_asos_homepage() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.asos.com/men/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("The user has to click the signin options")
	public void the_user_has_to_click_the_signin_options() {
		WebElement account = driver.findElement(By.id("myAccountDropdown"));
	    account.click();
	    
	    WebElement joinclk = driver.findElement(By.xpath("//a[text()='Sign In']"));
	    joinclk.click();

	}

	@When("give valid mail and invalid password")
	public void give_valid_mail_and_invalid_password() {
		WebElement email = driver.findElement(By.name("Username"));
		email.sendKeys("sindu3357@gmail.com");
		WebElement pwd = driver.findElement(By.name("Password"));
		pwd.sendKeys("111");
		WebElement button = driver.findElement(By.id("signin"));
		button.click();
	}

	@Then("redirection should happen to my account url")
	public void redirection_should_happen_to_my_account_url() {
		Assert.assertTrue("verify url", driver.getCurrentUrl().contains("login?signin"));
	    System.out.println("invalid password");
	    driver.quit();
	}
	


}