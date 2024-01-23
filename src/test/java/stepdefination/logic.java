package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logic {
	WebDriver driver;
	
	@Given("openBrowser and Enter Url")
	public void openBrowser_and_Enter_Url()
	{
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	
	@When("user entered valid username")
	public void user_entered_valid_username() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	}
	@And("User Enter valid Passsword")
	public void User_Enter_valid_Passsword() {
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
	}
	@When("user clicked on loginBtn")
   public void user_clicked_on_loginBtn() {
		driver.findElement(By.tagName("button")).click();
	}
   
   @Then("It should naviagte to Dashboard page")
   public void It_should_naviagte_to_Dashboard_page() {
	   
	  String ActualValue= driver.findElement(By.xpath("(//h1)[2]")).getText();
	  String ExpectedValue="Dashboard";
	  Assert.assertEquals(ExpectedValue, ActualValue);
   }
   
   
   @When("user entered invalid username")
   public void user_entered_invalid_username() {
	   driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("bcbc@yourstore.com");
   }

   @When("User Enterd invalid password")
   public void user_enterd_invalid_password() {
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("adefgregmin");
         }


   @Then("it should throw error")
   public void it_should_throw_error() {
	 String actualvalue= driver.findElement(By.xpath("//li[contains(text(),'No customer account found')]")).getText();
	 String ExpectedValue="No customer account found";
	 Assert.assertEquals(ExpectedValue, actualvalue);
	   
         }

   
   
}
