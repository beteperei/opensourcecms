package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseCapabilities {

    public static WebDriver driver;

    public static WebDriver Capabilities()  {
        WebDriver driver = new ChromeDriver();
        String URL = "https://s1.demo.opensourcecms.com/wordpress/wp-login.php";
        driver.get(URL);
        return driver;
    }

}
