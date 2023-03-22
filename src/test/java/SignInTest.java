import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ui.pageObject.HomePage;
import ui.pageObject.LoginPage;
import utils.AllureListener;
import utils.PropertyReader;

@Listeners(AllureListener.class)


public class SignInTest extends BaseTest {


    @Description("Login test with wrong username and password")
    @Epic("Regression Tests")
    @Feature("Login Test")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Invalid username and password")
    @Owner("Igor Zubach")
    @Test
    public void loginTest() {
        HomePage homePage = new HomePage();

        homePage.clickOnSignButton()
                .enterEmailOrPhoneNumberField(PropertyReader.getValue("email"))
                .enterPasswordField(PropertyReader.getValue("password"))
                .verifyIfEnterButtonDisplayed();
        System.out.println("Test");

    }


    @Test
    public void checkErrorMessage() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.clickOnSignButton()
                .enterEmailOrPhoneNumberField(PropertyReader.getValue("email"))
                .enterPasswordField(PropertyReader.getValue("password"));
                Assert.assertEquals(loginPage.getTextFromErrorMessage(),"Введено невірну адресу ел. пошти або номер телефону");
    }

//    @Test
//    public void softAssertTestExample() {
//        SoftAssert softAssert = new SoftAssert();
//        String str1 = "Hello";
//        String str2 = "World";
//        softAssert.assertNotEquals(str1, str2, "Strings do not match");
//        softAssert.assertTrue(str1.contains("T"), "String does not contain H");
//        softAssert.assertTrue(str2.contains("W"), "String does not contain W");
//        softAssert.assertAll();
//    }
//
//    @Test(priority = 1, enabled = true, groups = { "functional", "regression", "Test Case:21231 " }, dependsOnMethods = { "loginTest" }, alwaysRun = true, timeOut = 5000)
//    public void trueTest() {
//        Assert.assertTrue(true);
//    }
}
