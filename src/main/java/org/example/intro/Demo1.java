package org.example.intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Demo1 {
    @Test
    public void testDemo1(){
        WebDriverManager.chromedriver().setup(); //chrome driver configuration

        WebDriver driver = new ChromeDriver(); //creating instance of WebDriver
        driver.manage().window().maximize(); //maximize window of a browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //Driver waits for 20secs
        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName")); //username field
        fullNameInputField.sendKeys("test");

        WebElement userEmailInputField = driver.findElement(By.id("userEmail")); //email field
        userEmailInputField.sendKeys("test@test.ru");

        WebElement currentAddressInputField = driver.findElement(By.id("currentAddress")); //current address field
        currentAddressInputField.sendKeys("city street");

        WebElement permanentAddressInputField = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")); //permanent address field
        permanentAddressInputField.sendKeys("city 1 street 1");

        JavascriptExecutor js = (JavascriptExecutor) driver; //scroll down
        js.executeScript("window.scrollBy(0,3000)");

        WebElement submitButton = driver.findElement(By.id("submit")); //button submit
        submitButton.click();

    }




}
