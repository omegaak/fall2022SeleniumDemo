package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iMovingOrder extends BaseTest{

    @Test
    public void firstPageTest(){
        driver.navigate().to("https://www.imoving.com/");
        WebElement houseTypeSelectMenu = driver.findElement(By.id("houseTypeSelectList"));
        Select select = new Select(houseTypeSelectMenu);
        select.selectByValue("1080");
        WebElement moveSizeMenu = driver.findElement(By.id("hp-nav-select-house"));
        Select select2 = new Select(moveSizeMenu);
        select2.selectByVisibleText("Just a few Items");
        WebElement clickQuotes = driver.findElement(By.xpath("//button[@class='btn btn-white quickQuoteLink']"));
        clickQuotes.click();
        Helper.pause(3000);

    }
    @Test
    public void secondPage(){
        Helper.pause(2000);
        driver.findElement(By.xpath("//span[@class='col-sm-9 col-xs-12']")).click();
        Helper.pause(2000);
        driver.findElement(By.xpath("//div[@class='modal-buttons']/a")).click();
        Helper.pause(3000);
        driver.findElement(By.id("closeTutorial")).click();


    }
    @Test
    public void itemsTest(){
        Actions action = new Actions(driver);
        WebElement picture = driver.findElement(By.xpath("//div[@class='14']//figure"));
        WebElement plusBox = driver.findElement(By.xpath("//span[@class='quantityCounterBlock']//button[@class='quantity-plus']"));
        WebElement tv = driver.findElement(By.xpath("//div[@class='12']//figure"));
        action.moveToElement(picture);
        action.moveToElement(plusBox);
        action.moveToElement(tv);
        action.build();
        action.perform();

        driver.findElement(By.xpath("//div[@class='14']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")).click();
        Helper.pause(3000);
    }
}
