package day16;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.io.IOException;

public class C01_GetScrenShotWE extends TestBaseBeforeAfter {
    @Test
    public void test1() throws IOException {
        // Amazon sayafasina gidelim
        driver.get("https://www.amazon.com");
        // Nutella aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
        // Arama sonucunun resmini alalim
        WebElement aramaSonucu = driver.findElement(By.xpath("(//*[@class='a-section aok-relative s-image-square-aspect'])[1]"));
       File nutellaAramaSonucu =  aramaSonucu.getScreenshotAs(OutputType.FILE);
       //WebElementin resmini alacaksak TakeScreenshot classini kullanmamiza gerek yok.
        //Locate ettigimiz webelementi direk gecici bir file'a atip FileUtils ile kopyalayip yolunu(path) belirtiriz.
        FileUtils.copyFile(nutellaAramaSonucu,new File("target/ekranGoruntusu/WebElement"+tarih+".jpeg"));


    }
}
