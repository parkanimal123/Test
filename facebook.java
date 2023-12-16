package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class facebook {
    static String driverPath = "F:\\STQA\\eclipse tycs\\geckodriver.exe";
    static String PATH_PORT = "webdriver.firefox.port";

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", driverPath);
        FirefoxProfile fp = new FirefoxProfile();
        fp.setPreference(PATH_PORT, "7055");

        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(fp);

        WebDriver driver = new FirefoxDriver(options);
        String appUrl = "https://www.facebook.com/";
        driver.get(appUrl);
        driver.manage().window().maximize();

        String expectedTitle = "Facebook – log in or sign up";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Verification Successful - The correct title is displayed on the web page.");
            WebElement username = driver.findElement(By.id("email"));
            username.clear();
            username.sendKeys("abcd@gmail.com");

            WebElement password = driver.findElement(By.id("pass"));
            password.clear();
            password.sendKeys("password");
            password.sendKeys(Keys.ENTER);

            driver.close();
            System.out.println("\nTest script executed successfully.");
            System.exit(0);
        } else {
            System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
        }
    }
}
