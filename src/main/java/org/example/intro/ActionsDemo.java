package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActionsDemo extends BaseTest {

    @Test
            public void testRadioButton(){
    driver.get("https://demoqa.com/radio-button");
    WebElement yesRadio = driver.findElement(By.xpath("//label[@for='yesRadio']"));
    yesRadio.click();

    


    }
 }
