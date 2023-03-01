import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ui.driver.DriverManager;


public abstract class BaseTest extends DriverManager {

    WebDriver driver;

    @BeforeMethod (alwaysRun = true)
    public void setDriver() {
        DriverManager.createDriver();
        driver = DriverManager.getDriver();
    }

    @AfterMethod (alwaysRun = true)
    public void quitDriver() {
        DriverManager.closeDriver();
    }
}


