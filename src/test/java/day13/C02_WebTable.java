package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import java.util.List;

public class C02_WebTable extends TestBaseBeforeAfter {
    @Test
    public void test() {

        //login( ) metodun oluşturun ve oturum açın.

        //      https://www.hotelmycamp.com/admin/HotelRoomAdmin adresine gidin
        // driver.get("https://www.hotelmycamp.com/admin/HotelRoomAdmin ");
        login();
        //Username : manager
        //Password : Manager1!
        //       table( ) metodu oluşturun
        table();
        //Tüm table body’sinin boyutunu(sutun sayisi) bulun.
        //       Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        //printRows( ) metodu oluşturun //tr
        //table body’sinde bulunan toplam satir(row) sayısını bulun.
        //       Table body’sinde bulunan satirlari(rows) konsolda yazdırın.


    }

    private void table() {
        //Tüm table body’sinin boyutunu(sutun sayisi) bulun.
        /*
        Tabloda<table> tagı altinda tablonun basligini gösteren <thead> tag'i bulunur.
        Eger baslikta satir(row) varsa <thead> tag'i altinda <tr> (satir-row) tagi vardir.
        Ve basliktaki sutunlara yani hucrelere(cell) de <th> tag' ile ulasilir.
        Basligin altindaki verilere <tbody> tag'i ile altindaki satirlara(row) <tr> tag'i ile
        sutunlara yani hucrelere<td> tag'i ile ulasilir.
         */
        List<WebElement> sutunSayisi = driver.findElements(By.xpath("//thead//tr//th"));
        System.out.println("Sutun Sayisi --> " + sutunSayisi.size());
        //  sutunSayisi.stream().map(WebElement::getText).forEach(System.out::println);
        //Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        WebElement basliklar = driver.findElement(By.xpath("//thead//tr"));
        System.out.println("basliklar : " + basliklar.getText());
        WebElement body = driver.findElement(By.xpath("//tbody"));
        System.out.println(body.getText());

        //printRows( ) metodu oluşturun //tr
        //table body’sinde bulunan toplam satir(row) sayısını bulun.
        List<WebElement> satirSayisi = driver.findElements(By.xpath("//tbody//tr"));
        System.out.println("Tablodaki Satir sayisi : " + satirSayisi.size());
        //Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        satirSayisi.forEach(t-> System.out.println(t.getText()));
        // 4.satirdaki(row) elementleri konsolda yazdırın.
        System.out.println("Toblodaki 4. satir --> " +driver.findElement(By.xpath("//tbody//tr[4]")).getText());


    }
    private void login() {
        driver.get("https://www.hotelmycamp.com/admin/HotelRoomAdmin ");
       // driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("maneger");
        Actions actions = new Actions(driver);
        WebElement username = driver.findElement(By.xpath("//*[@id='UserName']"));
        actions.click(username).sendKeys("manager").sendKeys(Keys.TAB).
                sendKeys("Manager1!").sendKeys(Keys.ENTER).perform();


    }
}

