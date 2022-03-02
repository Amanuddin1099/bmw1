package com.bmw.qa.test.pages;

import com.bmw.qa.test.utils.BaseClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyBmw extends BaseClass {

    @Test
    public void myBmwTest() throws InterruptedException {
        driver.get("https://www.bmwusa.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
//        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("")));
//        closeButton.click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > div:nth-child(3) > div > div > div.globalnav-container.bmw-grid-row.bmw-grid-middle-default > div.bmw-grid-col-default-21.bmw-grid-col-md-22.bmw-grid-col-lg-9.bmw-grid-col-xl-11.globalnav-primary-dealer > div > div.globalnav-primary-location-bar.label-2 > div > div.globalnav-primary-my-bmw > div.globalnav-primary-my-bmw__portal-holder > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("registerNowBtn")).click();


    }


}
