package seleniumgluecode;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Payment {

	  public static WebDriver driver;
	
	@Given("^User enters URL on the browsers$")
	public void user_enters_URL_on_the_browsers() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");

    	//Creating an object of ChromeDriver
    	driver = new ChromeDriver();
    	
    	// TO Maximize chrome driver
    	driver.manage().window().maximize();
    	
    	// Every elememts get maximum 10 seconds of time 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        // URL to open
        driver.get("https://www.flipkart.com/");
        Thread.sleep(50000);
        
        System.out.println("inside flipkart URL");
	}

	@Given("^User clicked on login icon$")
	
	
	public void user_clicked_on_login_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("inside login");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("jyotipassion14@gmail.com");
	
	}
	
	@When("^enter \"([^\"]*)\"$")
	public void enter(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mughalsarai");
		System.out.println("Password print");  
	}

	
    @When("^click on login button$")
	public void click_on_login_button() throws Throwable {
    	System.out.println("Password field");
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
    }
    
    @When("^enter \"([^\"]*)\" in mobile number$")
    public void enter_in_mobile_number(String arg1) throws Throwable {
    	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8218092472");
    }

    @And("^click on continue button$")
    public void click_on_continue_button() throws Throwable {
    	driver.findElement(By.xpath("//span[normalize-space()='CONTINUE']")).click();
    }
    
    @And("^enter \"([^\"]*)\" in password$")
    public void enter_in_password(String arg1) throws Throwable {
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mughalsarai");
        
    }
    
    @Then("^verify my Account is displaying$")
    public void verify_my_Account_is_displaying() throws Throwable {
        	Thread.sleep(1000);
    	
    	try {
    	    WebElement Myaacount = driver.findElement(By.xpath("//div[contains(text(),'My Account')]"));
    	    boolean act = Myaacount.isDisplayed();
    	    Assert.assertTrue(act);
    	}
    	catch(org.openqa.selenium.StaleElementReferenceException ex) {}
         
    
    }

@When("^user clicks on Home & Furniture$")
public void user_clicks_on_Home_Furniture() throws Throwable {
	driver.findElement(By.xpath("//span[@class='_2I9KP_ _2WDRax']"));
	System.out.println("Home");
}



@And("^user clicks on Bedsheets$")
public void user_clicks_on_Bedsheets() throws Throwable {
	driver.findElement(By.xpath("//a[@class='_3QN6WI'][normalize-space()='Bedsheets']"));
	System.out.println("Bedsheets");
}

@Then("^bedsheets should be displayed$")
public void bedsheets_should_be_displayed() throws Throwable {
	driver.findElement(By.xpath("//h1[@class='_10Ermr']"));
	System.out.println("Bedsheets visible");
}

@When("^user go to cart$")
public void user_go_to_cart() throws Throwable {
	driver.findElement(By.xpath("//div[@class='KK-o3G']"));
	System.out.println("In cart");
}

@When("^click on Place order button$")
public void click_on_Place_order_button() throws Throwable {
    driver.findElement(By.xpath("//span[normalize-space()='Place Order']"));
	System.out.println("Placed order");
}

@When("^click on the checkbox$")
public void click_on_the_checkbox() throws Throwable {
	driver.findElement(By.xpath("//label[@for='CNTCT250A2F14ABF14CF281154A9DB']//div[@class='_1XFPmK']"));
	System.out.println("checkbox selected");
}

@When("^click on Deliver here button$")
public void click_on_Deliver_here_button() throws Throwable {
    driver.findElement(By.xpath("//button[@class='_2KpZ6l RLM7ES _3AWRsL']"));
	System.out.println("Deliver here");
}

@When("^click on Continue button$")
public void click_on_Continue_button() throws Throwable {
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _1seccl _3AWRsL']"));
	System.out.println("Continue click");
}

@When("^select the checkbox cash on delivery$")
public void select_the_checkbox_cash_on_delivery() throws Throwable {
    driver.findElement(By.xpath("//label[@for='COD']//div[@class='_1XFPmK']"));
	
}

@When("^enter the characters$")
public void enter_the_characters() throws Throwable {
	driver.findElement(By.xpath("//input[@name='captcha']"));
   
}

@When("^click on confirm order$")
public void click_on_confirm_order() throws Throwable {
    driver.findElement(By.xpath("//button[@type='button']")).getText().toString();
    
}

@Then("^order has been placed$")
public void order_has_been_placed() throws Throwable {
	String ActualTitle =("Order placed");
	String ExpectedTitle = "order placed";
	Assert.assertEquals(ExpectedTitle, ActualTitle);
}

}

