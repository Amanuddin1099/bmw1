package com.bmw.qa.test.pages;

import com.bmw.qa.test.utils.BaseClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BmwCertified extends BaseClass {

    @Test
    public void bmwCertifiedTest() throws InterruptedException {
        driver.get("https://www.bmwusa.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > div:nth-child(3) > div > div > div.globalnav-container.bmw-grid-row.bmw-grid-middle-default > div.bmw-grid-col-default-25.bmw-grid-col-lg-14.bmw-grid-col-xl-12.globalnav-primary__bar > div > nav > ul > li:nth-child(4) > a")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"animation-container-2243593a-73a0-4760-b35b-5adf7f52e780\"]/div/div/div/div[7]/div/div/div[1]/div/section/a")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#zip-input-cpo")).sendKeys("11433");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#app > div > div > div > form > button")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#app > div > div.content-3--bold.top-sticky.sub-navigation_subnavigation_35lvI > div:nth-child(1) > div > button")).click();






    }


}
