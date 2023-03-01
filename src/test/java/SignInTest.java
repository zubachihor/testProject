import org.testng.annotations.Test;
import ui.pageObject.HomePage;
import utils.PropertyReader;


public class SignInTest extends BaseTest {

    @Test
    public void test() {
        HomePage homePage = new HomePage();

        homePage.clickOnSignButton()
                .enterEmailOrPhoneNumberField(PropertyReader.getValue("email"))
                .enterPasswordField(PropertyReader.getValue("password"))
                .verifyIfEnterButtonDisplayed();
        System.out.println("Test");
    }
}
