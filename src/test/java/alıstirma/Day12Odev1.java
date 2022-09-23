package alıstirma;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBaseBeforeAfter;

import java.time.Duration;

public class Day12Odev1 extends TestBaseBeforeAfter {
    @Test
    public void test1() {
      //  "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
      //  "Hover over Me First" kutusunun ustune gelin
        WebElement hover = driver.findElement(By.xpath("(//*[@class='dropbtn'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hover).perform();
      //  "Link 1" e tiklayin
       WebElement link1 =  driver.findElement(By.xpath("(//*[text()='Link 1'])[1]"));
       link1.click();
      //  Popup mesajini yazdirin
        System.out.println("Popun mesaji : " + driver.switchTo().alert().getText());
      //  Popup'i tamam diyerek kapatin
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.switchTo().alert().getText();
      //  "Click and hold" kutusuna basili tutun
       // WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement clickAndHoldBox = driver.findElement(By.id("click-box"));
        actions.clickAndHold(clickAndHoldBox).perform();
        //  System.out.println("Click Buttonunda cikan yazi : " + driver.switchTo().alert().getText());
      //  "Double click me" butonunu cift tiklayin
     //   WebElement doubleCl= driver.findElement(By.xpath("//*[@id='click-box']"));
      //  actions.doubleClick(doubleCl);
    }
}
