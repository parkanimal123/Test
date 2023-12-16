package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class listcombo {

    static String driverPath = "F:\\STQA\\eclipse tycs\\geckodriver.exe";
    static String PATH_PORT = "webdriver.firefox.port";

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", driverPath);

        FirefoxProfile fp = new FirefoxProfile();
        fp.setPreference(PATH_PORT, "7055");
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(fp);
        WebDriver driver = new FirefoxDriver(options);

        driver.get("file:///F:/STQA/combo.html");
        driver.manage().window().maximize();

        java.util.List<WebElement> select = driver.findElements(By.tagName("option"));

        System.out.println("The number of options present in the given select box is " + select.size());

        driver.quit();
    }
}
