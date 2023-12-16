package gcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class gcd {
    static String driverPath = "F:\\STQA\\eclipse tycs\\geckodriver.exe";

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", driverPath);

        FirefoxProfile fp = new FirefoxProfile();
        fp.setPreference("webdriver.firefox.port", 7055);

        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(fp);

        WebDriver driver = new FirefoxDriver(options);

        driver.get("file:///F://STQA/gcdhtml.html");

        driver.manage().window().maximize();

        driver.findElement(By.name("n1")).sendKeys("36");
        driver.findElement(By.name("n2")).sendKeys("6");
        driver.findElement(By.name("btn")).click();

        String result = driver.findElement(By.name("result")).getAttribute("value");
        System.out.println("GCD = " + result);

        driver.quit();
    }
}
