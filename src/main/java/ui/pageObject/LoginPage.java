package ui.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends AbstractPage {
    @FindBy(id = "auth_email")
    public WebElement emailOrPhoneNumberField;
    @FindBy(id = "auth_pass")
    public WebElement passwordField;
    @FindBy(xpath = "//button[@class = 'button button--large button--green auth-modal__submit ng-star-inserted']")
    public WebElement enterButton;


    public LoginPage enterEmailOrPhoneNumberField(String str) {
        waitClickableElement(10,enterButton);
        emailOrPhoneNumberField.sendKeys(str);
        return this;

    }

    public LoginPage enterPasswordField(String str) {
        passwordField.sendKeys(str);
        return this;
           }

    public LoginPage clickEnterButton(String str) {
        enterButton.click();
        return this;

    }

    public LoginPage verifyIfEnterButtonDisplayed() {
        enterButton.isDisplayed();
        return this;
            }

}
