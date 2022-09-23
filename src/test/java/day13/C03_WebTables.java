package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

public class C03_WebTables extends TestBaseBeforeAfter {
    @Test
    public void test() {
        // Bir onceki class daki adrese gidelim
        driver.get("https://www.hotelmycamp.com/admin/HotelRoomAdmin ");
        // login methodunu kullanarak sayfaya giris yapalim
        Actions actions = new Actions(driver);
        WebElement username = driver.findElement(By.xpath("//*[@id='UserName']"));
        actions.click(username).sendKeys("manager").sendKeys(Keys.TAB).
                sendKeys("Manager1!").sendKeys(Keys.ENTER).perform();
        // input olarak verilen Satir sayisi ve sutun sayisina sahip cell deki text'i yazdiralim
        int satir =3;
        int sutun =4;
        System.out.println(driver.findElement(By.xpath("//tbody//tr[3]//td[4]")).getText());
    }
}
