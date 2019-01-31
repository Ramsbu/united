package com.united.automation.basic;
import org.junit.Before;
import org.junit.After;
import com.united.automation.selenium.BrowserLaunch;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FuelTests extends BrowserLaunch {
WebDriver driver;

@Before
    public void setup() {
        BrowserLaunch openBrowser = new BrowserLaunch();
        driver = openBrowser.signInApplication();
    }
    @After
    public void tearDown() {
       driver.quit();
    }

    @Test
    public void testSearch() {
        driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
    }
}
