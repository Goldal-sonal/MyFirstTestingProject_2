package StepDefination;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample {
	public String baseUrl="http://localhost/LogicInvoice/upload/admin/index.php";
	String driverPath="c:\\chromedriver.exe";
	
	public Select dropdown;

	public static WebDriver driver;
	@Given("^Open chrome browser and Start Applciation$")
	public void open_chrome_browser_and_Start_Applciation() throws Throwable {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("http://localhost/POS/public/home");			
	
	   
	}

	@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_valid_and_valid(String arg1, String arg2) throws Throwable {
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys("pointofsale");
		
		
	  	}

	@Then("^User should be login successfully$")
	public void user_should_be_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).click();
	   	}

	@Then("^Click on sales$")
	public void click_on_sales() throws Throwable {
		Thread.sleep(2000);
		  Actions action=new Actions(driver);
		  WebElement mainmenu=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[7]/a[2]"));
		 // Actions action=new Actions(driver);
		  mainmenu.click();
		
	  }    
	 	@Then("^Create Sale Recipt and parameter is item \"(.*?)\" and user is \"(.*?)\"$")
	public void create_Sale_Recipt_and_parameter_is_item_and_user_is(String arg1, String arg2) throws Throwable {
	 		
			              	  
			  WebElement submenu=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[2]/div[1]/button[1]/span[1]"));
			  //Actions action1=new Actions(driver);
			  submenu.click();
			  Actions action1=new Actions(driver);
			  WebElement submenu1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]"));
			  //Actions action2=new Actions(driver);
			  submenu1.click();
			     Thread.sleep(2000);  
			  
			  Actions action2=new Actions(driver);
			  WebElement submenu2=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[2]/div[1]/ul[1]/li[2]/input[1]"));
			  submenu2.sendKeys("Smartphone");
			  //Actions action3=new Actions(driver);
			  Thread.sleep(2000);
			  
			  Actions action3=new Actions(driver);
			  driver.findElement(By.xpath("//input[@id='customer']")).click();
			  WebElement submenu3=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
			 	  submenu3.sendKeys("3");
			 	// Actions action4=new Actions(driver);
			 	  driver.findElement(By.xpath("/html[1]/body[1]/ul[2]/li[3]")).click();
			        Thread.sleep(3000);
			  
	   }

	@Then("^CLick on Save$")
	public void click_on_Save() throws Throwable {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[7]/a[1]"));
		
	   }

	@Then("^Browser Closed$")
	public void browser_Closed() throws Throwable {
		driver.close();
	   }


}
