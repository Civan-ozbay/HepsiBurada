package HepsiBurada.Step_Definitions;

import HepsiBurada.Pages.HomePage;
import HepsiBurada.Utilities.ConfigurationReader;
import HepsiBurada.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Degerlendirme_Step_Def {


    @Given("User open to {string}")
    public void user_open_to(String string) {
        Driver.get().get(ConfigurationReader.get("url"));
    }



    @Then("User searching {string}")
    public void user_searching(String string) {
        HomePage homePage = new HomePage();

        homePage.searchInputBox.sendKeys(string);
        homePage.searchButton.click();


    }
    @Then("User choose a first product")
    public void user_choose_a_first_product() {
        Driver.get().findElement(By.xpath("(//p[@class='hb-pl-cn'])[1]")).click();
    }
    @Then("User navigates to Değerlendirmeler tab")
    public void user_navigates_to_Değerlendirmeler_tab() throws InterruptedException {
 /*       JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,650)");
        Thread.sleep(4000);*/
        Driver.get().findElement(By.id("productReviewsTab")).click();
    }
    @Then("User click to first like button")
    public void user_click_to_first_like_button() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        /*
        js.executeScript("arguments[0].scrollIntoView();", Driver.get().findElement(By.xpath("(//div[@class='hermes-ReviewCard-module-tAGUS'])[1]")));
        */
        js.executeScript("window.scrollBy(0,1000)");
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);


        wait.until(ExpectedConditions.elementToBeClickable(Driver.get().findElement(By.xpath("(//div[@class='hermes-ReviewCard-module-tAGUS'])[1]")))).click();
    }
    @Then("Verify Teşekkür Ederiz. text message")
    public void verify_Teşekkür_Ederiz_text_message() {
        String actual = Driver.get().findElement(By.xpath("//span[@class='hermes-ReviewCard-module-1ZiTv']")).getText();
        Assert.assertEquals("Teşekkür Ederiz.",actual);
    }



}
