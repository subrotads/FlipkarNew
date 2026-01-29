package PageObjects;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
//ghdghfkjhjhfkfkhfj
    
    @FindBy(xpath = "//input[@placeholder='Search for Products, Brands and More']")
    WebElement searchBox;

    @FindBy(xpath = "(//a[contains(@href,'/p/')])[1]")
    WebElement product;

    @FindBy(xpath = "//input[contains(@placeholder,'Pincode')]")
    WebElement pincode;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div[1]/span")
    WebElement checkbtn;

    
    @FindBy(xpath = "//div[@class='x6Qw7d']")
    WebElement msg;
   
    public void clickOnSearchTextBox() {
        wait.until(ExpectedConditions.elementToBeClickable(searchBox)).click();
    }

    public void searchProduct(String text) {
        searchBox.sendKeys(text + Keys.ENTER);
    }
    

    public void clickProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(product)).click();
        switchToNewTab();
    }

    public void switchToNewTab() {
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            driver.switchTo().window(window);
        }
    }
    
    
    public void clickOnPincodeBox() {
    	wait.until(ExpectedConditions.elementToBeClickable(pincode)).click();
    }

    public void enterPincode(String pin) {
        pincode.sendKeys(pin);
    }

    public void clickCheckButton() {
        wait.until(ExpectedConditions.elementToBeClickable(checkbtn)).click();
    }

   
}
