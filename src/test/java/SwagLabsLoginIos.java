import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SwagLabsLoginIos {

    @Test
    public void login() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone 13");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("udid", "CB3931EC-0B2F-4763-AF77-723B5751DC2E");
        capabilities.setCapability("bundleId", "com.saucelabs.SwagLabsMobileApp");
        capabilities.setCapability("app", "/Users/gowthamipv/IdeaProjects/LoginPageios/src/test/resources/app/iOS.Simulator.SauceLabs.Mobile.Sample.app.2.7.1.app");


        IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"test-Username\"]")).sendKeys("standard_user");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name=\"test-Password\"]")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"test-LOGIN\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"test-ADD TO CART\"])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"1\"])[4]")).click();
        Thread.sleep(3000);


        TouchAction t = new TouchAction(driver);
        t.tap(PointOption.point(186,657)).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"test-First Name\"]")).sendKeys("Gowthami");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"test-Last Name\"]")).sendKeys("PV");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"test-Zip/Postal Code\"]")).sendKeys("563122");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"test-CONTINUE\"]")).click();
        Thread.sleep(3000);
        t.press(PointOption.point(206,762)).waitAction(WaitOptions.waitOptions(Duration.ofMillis((3000)))).moveTo(PointOption.point(215,204)).release().perform();
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAccessibilityId("test-FINISH")).click();
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAccessibilityId("test-BACK HOME")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
