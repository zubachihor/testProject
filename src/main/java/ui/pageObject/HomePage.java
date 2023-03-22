package ui.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.Logger;


public class HomePage extends AbstractPage {

    @FindBy(xpath = "//button[@class= 'header__button ng-star-inserted']")
    public WebElement signButton;

    @FindBy(xpath = "//input[@class= 'search-form__input ng-untouched ng-pristine ng-valid']")
    public WebElement inputField;

        public LoginPage clickOnSignButton(){
        signButton.click();
        return new LoginPage();

    }
    public HomePage setInputField(){
        inputField.sendKeys("fsdfsdf");
        return this;
    }

}
