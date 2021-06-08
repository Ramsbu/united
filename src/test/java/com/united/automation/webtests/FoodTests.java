package com.united.automation.webtests;

import com.united.automation.selenium.BrowserLaunch;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import com.united.automation.selenium.BrowserLaunch;
import com.united.automation.selenium.DataDrivenCSV;
import com.united.automation.selenium.DataDrivenExcel;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.IOException;

public class FoodTests extends BrowserLaunch {

    WebDriver driver;

    @Before
    public void setup() throws IOException {
        BrowserLaunch openBrowser = new BrowserLaunch();
        driver = openBrowser.signInApplication();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}