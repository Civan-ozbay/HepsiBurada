package HepsiBurada.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchInputBox;

    @FindBy(className = "SearchBoxOld-buttonContainer")
    public WebElement searchButton;



}
