import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SwagLabsLoginIos {

    @Test
    public void login() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone 13");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("udid", "CB3931EC-0B2F-4763-AF77-723B5751DC2E");
        capabilities.setCapability("bundleId", "com.saucelabs.SwagLabsMobileApp");
        capabilities.setCapability("app", "/Users/gowthamipv/Downloads/iOS.Simulator.SauceLabs.Mobile.Sample.app.2.7.1.app");


        WebDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"test-Username\"]")).sendKeys("standard_user");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name=\"test-Password\"]")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"test-LOGIN\"]")).click();
    }
}

