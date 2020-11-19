package testcases;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;


public class Login extends BaseCapabilities {

       @Given("user is in the login page")
       public void loadPage() {
           driver = Capabilities();
       }

       @When("user enters valid username {string}")
       public void user_enters_valid_username(String user){
        WebElement username =  driver.findElement(By.id("user_login"));
        username.sendKeys(user);
       }

       @And("user enters valid password {string}")
       public void user_enters_valid_password(String pass){
           WebElement password = driver.findElement(By.id("user_pass"));
           password.sendKeys(pass);
       }

       @And("user clicks the login button")
        public void user_clicks_the_login_button(){
           WebElement loginButton = driver.findElement(By.id("wp-submit"));
           loginButton.click();
       }

       @Then("the login is successful")
        public void loginSuccessful(){
               String newURL= driver.getCurrentUrl();
               String expectedURL = "https://s1.demo.opensourcecms.com/wordpress/wp-admin/";
               assertEquals(expectedURL,newURL);
        }

}
