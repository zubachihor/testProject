package ui.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.PropertyReader;


public class DriverManager {
    public static WebDriver driver;

    public static void createDriver() {
        System.setProperty(PropertyReader.getValue("name"), PropertyReader.getValue("driverPath"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(PropertyReader.getValue("url"));
            }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver=null;
        }
    }
}
