package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

public class Odev1 extends TestBaseBeforeAfter {
    @Test
    public void name() throws InterruptedException {

        //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
        //2- Hover over Me First" kutusunun ustune gelin
        Actions actions = new Actions(driver);
        WebElement hover = driver.findElement(By.xpath("(//*[@class='dropbtn'])[1]"));
        actions.moveToElement(hover).perform();
        Thread.sleep(2000);
        //Link 1" e tiklayin
       driver.findElement(By.xpath("(//*[text()='Link 1'])[1]")).click();
        Thread.sleep(2000);
        //Popup mesajini yazdirin
        System.out.println("Popun mesaj : " + driver.switchTo().alert().getText());
        Thread.sleep(2000);
        //Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
        //“Click and hold" kutusuna basili tutun
      WebElement hold = driver.findElement(By.xpath("//*[@id='click-box']"));
        Thread.sleep(2000);
      actions.clickAndHold(hold).perform();
        //7-“Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(hold.getText());
        //8- “Double click me" butonunu cift tiklayin
        Thread.sleep(2000);
        WebElement doubleClick= driver.findElement(By.xpath("//h2"));
        actions.doubleClick(doubleClick).perform();

    }
}
