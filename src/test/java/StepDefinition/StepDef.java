package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.ProductPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

    WebDriver driver;
    ProductPage productPage;

    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        productPage = new ProductPage(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @When("User click on SearchTextBox")
    public void user_click_on_search_text_box() {
        productPage.clickOnSearchTextBox();
    }

    @When("User enters {string} and press enter")
    public void user_enters_and_press_enter(String text) {
        productPage.searchProduct(text);
    }

    @When("User click on the product")
    public void user_click_on_the_product() {
        productPage.clickProduct();
    }

    @Then("User click on Delivery Pincode Box")
    public void user_click_on_delivery_pincode_box() {
        productPage.clickOnPincodeBox();
    }

    @Then("User enters {string}")
    public void user_enters(String pincode) {
        productPage.enterPincode(pincode);
    }

    @Then("User click on check button")
    public void user_click_on_check_button() {
        productPage.clickCheckButton();
    }

    @Then("close browser")
    public void close_browser() {
        driver.close();
    	driver.quit();
    }
}
