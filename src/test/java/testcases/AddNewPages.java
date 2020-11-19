package testcases;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class AddNewPages extends BaseCapabilities {

    @When("user clicks Pages button")
    public void user_clicks_pages_button() {
        driver.findElement(By.id("menu-pages")).click();
    }

    @Then("The page is created successfully")
    public void the_page_is_created_successfully() throws IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        assertTrue(driver.findElement(By.xpath("//*[text()='Page published.']")).isDisplayed());
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("D:\\Udemy\\opensourcecms\\evidences\\addnewpage.png"));
    }


}
