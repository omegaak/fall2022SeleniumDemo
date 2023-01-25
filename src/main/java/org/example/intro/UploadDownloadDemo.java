package org.example.intro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UploadDownloadDemo extends BaseTest{

    @Test
    public void UDTest (){
        driver.navigate().to("https://demoqa.com/upload-download");
        driver.findElement(By.id("uploadFile")).sendKeys("D:/Save/Загрузки/курс.png");
        Helper.pause(5000);

    }
}
