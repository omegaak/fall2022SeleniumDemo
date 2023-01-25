package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBox extends BaseTest{

//@Test
//    public void testCheckBox(){
//        driver.get("https://demoqa.com/checkbox");
//        driver.findElement(By.xpath("//button[@aria-label='Expand all']")).click();
//
//        WebElement checkBox = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[4]"));
//        checkBox.click();
//
//    Assert.assertTrue(checkBox.isEnabled());



  //  }
    @Test
    public void testDoubleClick() {
    driver.get("https://demoqa.com/buttons");
    WebElement click = driver.findElement(By.id("doubleClickBtn"));
    Actions actions = new Actions(driver);
    actions.doubleClick(click).perform();
    Assert.assertEquals(driver.findElement(By.id("doubleClickMessage")).getText(),"You have done a double click");





    }
    @Test
    public void testRightClick(){
        driver.get("https://demoqa.com/buttons");
        WebElement click = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(click).perform();
        Assert.assertEquals(driver.findElement(By.id("doubleClickMessage")).getText(),"You have done a double click");
        Helper.pause(3000);
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickBtn).perform();
        Assert.assertTrue(driver.findElement(By.id("rightClickMessage")).getText().contains("You have done a right click"));
        Helper.pause(3000);

        WebElement clickMeBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
        actions.click(clickMeBtn).perform();
        Helper.pause(3000);
        WebElement clickMessage = driver.findElement(By.id("dynamicClickMessage"));
        Assert.assertEquals(clickMessage.getText(),"You have a dynamic click");


    }
        @Test
    public void testMoveToElement(){
        driver.get("https://www.imoving.com/");
        WebElement houseTypeSelectMenu = driver.findElement(By.id("houseTypeSelectList"));
        Select select = new Select(houseTypeSelectMenu);
        select.selectByValue("1000");
        Helper.pause(3000);
        select.selectByVisibleText("My Apartment");
        Helper.pause(3000);
        select.selectByIndex(2);
        }
}
