package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("headless");
        //options.addArguments("disable-gpu");
        //driver = new ChromeDriver(options);
        WebDriver driver = new FirefoxDriver();
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
    }


}


