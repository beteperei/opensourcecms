package testcases;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class AddNewPost extends BaseCapabilities {

    @When("user clicks Post button")
    public void user_clicks_post_button(){
        driver.findElement(By.id("menu-posts")).click();
    }

    @And("user clicks on Add New button")
    public void user_clicks_on_add_new_button(){
        driver.findElement(By.className("page-title-action")).click();
    }

    @And("user adds title {string}")
    public void user_adds_title(String title){
        driver.findElement(By.xpath("//button[text()='See next tip']")).click();
        driver.findElement(By.id("post-title-0")).sendKeys(title);

    }

    @And("user adds text {string}")
    public void user_adds_text(String text){
        driver.findElement(By.xpath("//textarea[contains(@aria-label,'Add block')]")).click();
        driver.findElement(By.xpath("//p[@class='block-editor-rich-text__editable editor-rich-text__editable wp-block-paragraph']")).sendKeys(text);
        driver.findElement(By.xpath("//button[text()='See next tip']")).click();

    }

    @And("user publishes the post")
    public void user_publishes_the_post(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[text()='Publish…']")).click();
        driver.findElement(By.xpath("//button[text()='Publish']")).click();

    }

    @Then("The post is created successfully")
    public void the_post_is_created_successfully() throws IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        assertTrue(driver.findElement(By.xpath("//*[text()='Post published.']")).isDisplayed());
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("D:\\Udemy\\opensourcecms\\evidences\\addnewpost.png"));
    }

    @After
    public void tearDown(){
        driver.quit();
    }


}
