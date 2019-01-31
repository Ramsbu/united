package com.united.automation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.concurrent.TimeUnit;
public class BrowserLaunch {
static WebDriver driver;

    public WebDriver signInApplication() {
        System.setProperty("webdriver.chrome.driver", "/Users/charan/Documents/Java_projects/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.unitedpetroleum.com.au");
        return driver;
    }

}
