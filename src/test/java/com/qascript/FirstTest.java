package com.qascript;

//import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox;
import org.testng.annotations.Test;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
       // WebDriver driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
       // Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
    }


}


