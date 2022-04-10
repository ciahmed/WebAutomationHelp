package org.pnt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    public WebDriver driver;

    @Before
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/chowdhuryahmed/IdeaProjects/WebAutomationHelp/Built/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
    }

    @Test
    public void test1() {

    }

    @After
    public void afterTest() {
        driver.quit();
    }

}
