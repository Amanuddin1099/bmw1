package com.bmw.qa.test.pages;

import com.bmw.qa.test.utils.BaseClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Models extends BaseClass {
    @Test

    public void modelsTest() throws InterruptedException {
        driver.get("https://www.bmwusa.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > div:nth-child(3) > div > div > div.globalnav-container.bmw-grid-row.bmw-grid-middle-default > div.bmw-grid-col-default-25.bmw-grid-col-lg-14.bmw-grid-col-xl-12.globalnav-primary__bar > div > nav > ul > li:nth-child(1) > button > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > div:nth-child(3) > div > div > div.globalnav-primary-drop-down-nav-holder.globalnav-primary-drop-down-nav-holder--active > div.globalnav-primary-drop-down-nav__wrapper > div > div > div.vehicles.aem-GridColumn.aem-GridColumn--default--12 > div > div > div.globalnav-primary-vehicles__content-holder > div > div.globalnav-primary-vehicles__tab.globalnav-primary-vehicles__tab--active > div.globalnav-primary-vehicles__cars > div:nth-child(12) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/div/div[2]/div/ul/li[3]/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > div.content-footer__container > div.page-par.bmw-standard-page--no-offsets > div > div > div.gallery.aem-GridColumn--default--none.aem-GridColumn.aem-GridColumn--default--25.aem-GridColumn--offset--default--0 > div.gallery__container.gallery__large.font-gkl.gallery__light.ng-scope > div.gallery__large-mosaic > div.gallery__large-mosaic-tile.gallery__headerContainer.a > div.gallery__headerContainer-text > ul > li:nth-child(2) > a")).click();








    }
}
