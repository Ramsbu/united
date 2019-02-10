package com.united.automation.basic;

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

public class HeaderTests extends BrowserLaunch {
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

    @Test
    public void getTestData() throws IOException {
        DataDrivenCSV dataDrivenCSV = new DataDrivenCSV();
        ArrayList<String> data = dataDrivenCSV.getData("Headers");
        String ActualStores = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/header/div/nav/ul/li[1]/a")).getText();
        String ActualFuels = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/header/div/nav/ul/li[2]/a")).getText();
        String ActualCards = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/header/div/nav/ul/li[3]/a")).getText();
        String ActualWholesale = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/header/div/nav/ul/li[4]/a")).getText();
        String ActualPie = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/header/div/nav/ul/li[5]/a")).getText();
        String ActualRefinery = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/header/div/nav/ul/li[6]/a")).getText();
        String ActualAbout = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/header/div/nav/ul/li[7]/a")).getText();

        Assert.assertEquals("Actual value doesn't match with expected", data.get(1), ActualStores);
        Assert.assertEquals("Actual value doesn't match with expected", data.get(2), ActualFuels);
        Assert.assertEquals("Actual value doesn't match with expected", data.get(3), ActualCards);
        Assert.assertEquals("Actual value doesn't match with expected", data.get(4), ActualWholesale);
        Assert.assertEquals("Actual value doesn't match with expected", data.get(5), ActualPie);
        Assert.assertEquals("Actual value doesn't match with expected", data.get(6), ActualRefinery);
        Assert.assertEquals("Actual value doesn't match with expected", data.get(7), ActualAbout);


    }

}

