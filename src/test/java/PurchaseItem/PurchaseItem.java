package PurchaseItem;

import BaseTest.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PurchaseItem {

    private WebDriver driver;

    public void purchaseItem(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://104.42.251.168/");
        driver.manage().window().maximize();

        By deskTopsDropdown = new By.ByXPath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");
        By macDropdownSelection = new By.ByXPath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a");
        By addToCartBtn = new By.ByXPath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]/span");
        By cartBtn = new By.ByXPath("//*[@id=\"top-links\"]/ul/li[4]/a/i");
        By checkoutBtn = new By.ByXPath("//*[@id=\"content\"]/div[3]/div[2]/a");
        By guestCheckout = new By.ByXPath("//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label/input");
        By continueBtn = new By.ByXPath("//*[@id=\"button-account\"]");
        By checkOption = new By.ByXPath("//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label/text()");
       // By guestContinueBtn = new By.ByXPath("//*[@id=\"button-account\"]");
        By firstNameField = new By.ByXPath("//*[@id=\"input-payment-firstname\"]");
        By lastNameField = new By.ByXPath("//*[@id=\"input-payment-lastname\"]");
        By emailField = new By.ById("input-payment-email");
        By telephoneField = new By.ById("input-payment-telephone");
        By addressField = new By.ById("input-payment-address-1");
        By cityField = new By.ById("input-payment-city");
        By postcodeField = new By.ById("input-payment-postcode");
        By countryDropdown = new By.ByXPath("//*[@id=\"input-payment-country\"]");
        By countrySelection = new By.ByXPath("//*[@id=\"input-payment-country\"]/option[27]");
        By regionStateDropdown = new By.ById("input-payment-zone");
        By regionStateSelection = new By.ByXPath("//*[@id=\"input-payment-zone\"]/option[6]");
        By deliveryContinueBtn = new By.ById("button-guest-shipping");
        By shippingContinueBtn = new By.ById("button-shipping-method");
        By paymentMethodCheckbox = new By.ByXPath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]");
        By paymentMethodContinueBtn = new By.ByXPath("//*[@id=\"button-payment-method\"]");
        By confirmOrderBtn = new By.ByXPath("//*[@id=\"button-confirm\"]");


        driver.findElement(deskTopsDropdown).click();
        driver.findElement(macDropdownSelection).click();
        driver.findElement(addToCartBtn).click();
        driver.findElement(cartBtn).isDisplayed();
        driver.findElement(cartBtn).click();
        driver.findElement(checkoutBtn).click();

        driver.findElement(checkOption).isDisplayed();
        driver.findElement(guestCheckout).click();
        driver.findElement(continueBtn).click();
        //driver.findElement(guestContinueBtn).click();
        driver.findElement(firstNameField).sendKeys("Bob");
        driver.findElement(lastNameField).sendKeys("Builder");
        driver.findElement(emailField).sendKeys("b.b@gmail.com");
        driver.findElement(telephoneField).sendKeys("12093845");
        driver.findElement(addressField).sendKeys("909 Beach Street");

        System.out.println(driver.getTitle());

        driver.quit();
    }

    public static void main (String args[]){
        PurchaseItem test = new PurchaseItem();
        test.purchaseItem();
    }

}
