package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class CssClass extends BaseTest {

    @Test
    public void cssTest() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        // WebElement searchInput = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);

        JavascriptExecutor js = (JavascriptExecutor) driver; //scroll down
        js.executeScript("window.scrollBy(0,300)");
        WebElement seeMore = driver.findElement(By.cssSelector("#brandsRefinements > ul > li:nth-child(8) > span > div > a > span"));
        seeMore.click();
        List<WebElement> brandNameElements = driver.findElements(By.xpath("//*[contains(@id,\"p_89/\")]/span/a"));

        String xpath1= "//*[contains(@id,\"p_89/";
        String xpath2 = "\")]/span/a/div/label/i";

        for (WebElement brandNameElement : brandNameElements) {
            String Input = brandNameElement.getText();
            if(brandNameElement.getText().equals("SAMSUNG")) {
                driver.findElement(By.xpath(xpath1+Input+xpath2)).click();
                //System.out.println("xpath1 + brandNameElement.getText() + xpath2");
            break;

            }
        }
    }
}
