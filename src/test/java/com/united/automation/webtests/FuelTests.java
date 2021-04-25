package com.united.automation.webtests;

import org.junit.*;
import com.united.automation.selenium.BrowserLaunch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import static java.lang.Thread.*;
public class FuelTests extends BrowserLaunch {
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
    public void testSearch() throws InterruptedException {
        driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
        driver.findElement(By.id("searchStoreAdd")).click();
        driver.findElement(By.id("searchStoreAdd")).clear();
        driver.findElement(By.id("searchStoreAdd")).sendKeys("6025 Padbury");
        sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"store_map_submit\"]/div[1]/button")).click();
        String ActualName = driver.findElement(By.xpath("//div[@class='iw_title']")).getText();
        Assert.assertEquals("Name doesn't match", "UNITED HEPBURN HEIGHTS (PADBURY)", ActualName);
    }

    @Test
    public void tapOnFuelHeader() throws InterruptedException {
    driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/header/div[2]/nav/ul/li[3]/a")).click();
    String ActualHeader = driver.findElement(By.xpath("//h2[@class='g_title']")).getText();
    Assert.assertEquals("Fuel headers doesn't match", "United Fuels", ActualHeader);
    }

    //*[@id="wrapper"]/div[3]/header/div[2]/div[1]/div[2]/div/a[1]/img
}
