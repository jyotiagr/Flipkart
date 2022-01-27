package seleniumgluecode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homepage {

	  public static WebDriver driver;
	
	@Given("^User enters URL on the browsers$")
	public void user_enters_URL_on_the_browsers() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");

    	//Creating an object of ChromeDriver
    	WebDriver driver = new ChromeDriver();
    	
    	// TO Maximize chrome driver
    	driver.manage().window().maximize();
    	
    	// Every elememts get maximum 10 seconds of time 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        // URL to open
        driver.get("https://www.marksandspencer.in/");
        Thread.sleep(1000);
        
        System.out.println("inside URL");
        
        throw new PendingException();
	}

	@Given("^User clicked on login icon$")
	public void user_clicked_on_login_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.linkText("#login")).click();
	    throw new PendingException();
	}
	

	@When("^enter \"([^\"]*)\"$")
	public void enter(String arg1) throws Throwable {
		driver.findElement(By.id("login-form-username")).sendKeys("Jyotipassion14@gmail.com");
	    	    throw new PendingException();
	}


    @When("^click on continue button$")
	public void click_on_continue_button() throws Throwable {
	    driver.findElement(By.className("btn btn-block btn-primary rounded")).click();
	    throw new PendingException();
    }
    
	@Then("^user is on the dashboard$")
	public void user_is_on_the_dashboard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}




}
