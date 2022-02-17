package RegistrationError;

//import RegisterAccount.RegisterAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class RegistrationError {

    private WebDriver driver;
    public void registrationError(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://104.42.251.168/");
        driver.manage().window().maximize();


        //WebElements
        By selectMyAccount = new By.ByXPath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
        By selectRegister = new By.ByXPath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
        By enterFirstNameField = new By.ById("input-firstname");
        By enterLastNameField = new By.ById("input-lastname");
        By enterEmailField = new By.ById("input-email");
        By enterTelephoneField = new By.ById("input-telephone");
        By enterPasswordField = new By.ById("input-password");
        By enterPasswordConfirmField = new By.ById("input-confirm");
        By privacyPolicyCheckBox = new By.ByXPath("//*[@id=\"content\"]/form/div/div/input[1]");
        By continueBtn = new By.ByXPath("//*[@id=\"content\"]/form/div/div/input[2]");
        By registeredContinueBtn = new By.ByXPath("//*[@id=\"content\"]/div/div/a");

        driver.findElement(selectMyAccount).click();
        driver.findElement(selectRegister).click();
        driver.findElement(enterFirstNameField).sendKeys("Jabby");
        driver.findElement(enterLastNameField).sendKeys("Jordan");
        driver.findElement(enterEmailField).sendKeys("j.j@gmail.com");
        driver.findElement(enterTelephoneField).sendKeys("091234566");
        driver.findElement(enterPasswordField).sendKeys("Hello!23");
        driver.findElement(enterPasswordConfirmField).sendKeys("Hello!23");
        driver.findElement(privacyPolicyCheckBox).click();
        driver.findElement(continueBtn).click();
        driver.findElement(registeredContinueBtn).click();

        driver.findElement(new By.ByXPath("//*[@id=\"account-register\"]/div[1]")).isDisplayed();

        driver.quit();


    }
    public static void main(String args[]) {
        RegistrationError test = new RegistrationError();
        test.registrationError();

    }


}
