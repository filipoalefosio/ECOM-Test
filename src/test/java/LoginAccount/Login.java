package LoginAccount;

import RegisterAccount.RegisterAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {


    private WebDriver driver;

    public void login() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://104.42.251.168/");
        driver.manage().window().maximize();

        By selectMyAccount = new By.ByXPath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
        By selectLogin = new By.ByXPath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
        By enterEmailField = new By.ByXPath("//*[@id=\"input-email\"]");
        By enterPasswordField = new By.ByXPath("//*[@id=\"input-password\"]");
        By loginBtn = new By.ByXPath("//*[@id=\"content\"]/div/div[2]/div/form/input");

        driver.findElement(selectMyAccount).click();
        driver.findElement(selectLogin).click();
        driver.findElement(enterEmailField).sendKeys("b.j@gmail.com");
        driver.findElement(enterPasswordField).sendKeys("Hello!23");
        driver.findElement(loginBtn).click();

        System.out.println(driver.getTitle());
        //driver.findElement(new By.ByXPath("//*[@id=\"content\"]/h2[1]"));

        driver.quit();
    }

    public static void main(String args[]) {
        Login test = new Login();
        test.login();
    }
}
