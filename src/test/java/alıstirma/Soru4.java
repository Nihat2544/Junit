package alıstirma;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class Soru4 extends TestBaseBeforeAfter {
    @Test
    public void test1() throws IOException {
       //1amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
       //2amazon anasayfaya gittiginizi test edin ve tum sayfanin goruntusunu kaydedin
        TakesScreenshot ts = (TakesScreenshot) driver;
       File tumSayfa = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tumSayfa,new File("target/ekranGoruntusu/AllPage"+tarih+".jpeg"));
       //3- Nutella icin arama yapin
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
       //4- sonucun Nutella icerdigini test edin ve ilk urunun goruntusunu alin
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='\"Nutella\"']")).isDisplayed());


        TakesScreenshot ts1 = (TakesScreenshot) driver;
        WebElement nutella = driver.findElement(By.xpath("(//*[@class='a-section aok-relative s-image-square-aspect'])[1]"));
        File sayfa = nutella.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sayfa,new File("target/nutella/AllPage"+tarih+".jpeg"));

    }
}
