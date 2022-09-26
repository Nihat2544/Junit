package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import java.util.List;

public class Day13Odev1 extends TestBaseBeforeAfter {
    /*
Tabloda<table> tagı altinda tablonun basligini gösteren <thead> tag'i bulunur.
Eger baslikta satir(row) varsa <thead> tag'i altinda <tr> (satir-row) tagi vardir.
Ve basliktaki sutunlara yani hucrelere(cell) de <th> tag' ile ulasilir.
Basligin altindaki verilere <tbody> tag'i ile altindaki satirlara(row) <tr> tag'i ile
sutunlara yani hucrelere<td> tag'i ile ulasilir.
 */
    @Test
    public void test1() {
        // Bir onceki class daki adrese gidelim
        driver.get("https://www.hotelmycamp.com/admin/HotelRoomAdmin ");
        // login methodunu kullanarak sayfaya giris yapalim
        Actions actions = new Actions(driver);
        WebElement username = driver.findElement(By.xpath("//*[@id='UserName']"));
        actions.click(username).sendKeys("manager").sendKeys(Keys.TAB).
                sendKeys("Manager1!").sendKeys(Keys.ENTER).perform();
      // Bir metod oluşturun : printData(int row, int column);
      List<WebElement> pirntData = driver.findElements(By.xpath("//thead//tr//td"));
      pirntData.forEach(t-> System.out.print(t.getSize()));
      // Satır(row) ve sütun(column) numarasını girdiğinizde, printData metodu bu
      // hücredeki(cell) veriyi yazdırmalıdır.
       // WebElement rowColumn =
        System.out.println(" ");
        System.out.println("Cell verisi --> " +driver.findElement(By.xpath("//tbody//tr[2]//td[5]")).getText());
      // Baska bir Test metodu oluşturun: printDataTest( );
      // Ve bu metodu printData( ) methodunu cagirmak icin kullanin.
      // Örnek: printData (3,5); => 3. satır, 5. Sütundaki veriyi yazdırmalıdır

      // yazdirilan datanin olmasi gereken dataya esit oldugunu test edin

    }
}
