package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://104.42.251.168/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        driver.quit();
    }

    public static void main (String args[]){
        HomePage test = new HomePage();
        test.setUp();
    }
}
