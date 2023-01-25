package org.example.intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Locators {

    WebDriver driver;

    @BeforeClass
        public  void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}


    @Test
    public void Locator(){

    driver.get("https://demoqa.com/text-box");

    WebElement nameText = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[1]/label"));
    WebElement nameText2 = driver.findElement(By.xpath("//label[@id='userEmail-label']"));

    String expectedEmailText = "Email";
    Assert.assertEquals(nameText.getText(),expectedEmailText);
    Assert.assertTrue(expectedEmailText.contains(nameText2.getText()));


   }

   @Test
   public void Test2(){
        WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
        username.sendKeys("Test123");
        System.out.println("Result is "+ username.getAttribute("value"));
        Assert.assertEquals(username.getAttribute("value"),"Test123");



   }
        @AfterClass
        public void tearDown(){
    driver.close();
    driver.quit();
    }
}
// (//button[@type='button'])[2] для дублирующихся xpath