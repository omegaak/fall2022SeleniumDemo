package org.example.intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Glovo {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Test
    public void begin() throws InterruptedException {
        driver.get("https://glovoapp.com/kg/ru/bishkek/");

        WebElement cookieButton = driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button"));
        cookieButton.click();

        WebElement beginButton = driver.findElement(By.xpath("(//button[@id=\"user-register\"])[2]"));
        beginButton.click();
        Thread.sleep(4000);
    }
   @Test
    public  void signUp() { //throws InterruptedException {
        //Thread.sleep(2000);
        WebElement nameField = driver.findElement(By.xpath("//*[@id=\"signup-name\"]/div/input"));
        nameField.sendKeys("TestName");

       WebElement emailField = driver.findElement(By.xpath("//*[@id=\"signup-email\"]/div/input"));
       emailField.sendKeys("TestName@test.ts");

       WebElement passField = driver.findElement(By.xpath("//*[@id=\"signup-password\"]/div/div/input"));
       passField.sendKeys("Test$1234");

       WebElement logInButton = driver.findElement(By.xpath("//*[@id=\"signup-button\"]/span"));
       logInButton.click();


   }
@AfterClass
    public void tearsDown(){
        driver.close();
        driver.quit();
}
}


