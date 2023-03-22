package ui.pageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.Logger;


public class LoginPage extends AbstractPage {

    public static Logger LOG;
    @FindBy(id = "auth_email")
    public WebElement emailOrPhoneNumberField;
    @FindBy(id = "auth_pass")
    public WebElement passwordField;
    @FindBy(xpath = "//button[@class = 'button button--large button--green auth-modal__submit ng-star-inserted']")
    public WebElement enterButton;
    @FindBy(xpath = "//p[@class ='error-message ng-star-inserted']")
    public WebElement errorMessage;


    public String getTextFromErrorMessage(){
        return errorMessage.getText();
    }
    @Step("Enter email: {0} ")
    public LoginPage enterEmailOrPhoneNumberField(String email) {
        waitClickableElement(10,enterButton);
        emailOrPhoneNumberField.sendKeys(email);
        //LOG.info("Email was entered");
        return this;

    }
    @Step("Enter password: {0} ")
    public LoginPage enterPasswordField(String password) {
        passwordField.sendKeys(password);
        //LOG.info("Pass was entered");
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
