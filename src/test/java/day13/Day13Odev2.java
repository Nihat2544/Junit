package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

import java.util.ArrayList;
import java.util.List;

public class Day13Odev2 extends TestBaseBeforeAfter {
      /*
Tabloda<table> tagı altinda tablonun basligini gösteren <thead> tag'i bulunur.
Eger baslikta satir(row) varsa <thead> tag'i altinda <tr> (satir-row) tagi vardir.
Ve basliktaki sutunlara yani hucrelere(cell) de <th> tag' ile ulasilir.
Basligin altindaki verilere <tbody> tag'i ile altindaki satirlara(row) <tr> tag'i ile
sutunlara yani hucrelere<td> tag'i ile ulasilir.
 */

    @Test
    public void test2() {
       // “https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");
       // Headers da bulunan department isimlerini yazdirin
        List<WebElement> departmentList = new ArrayList<>(driver.findElements(By.xpath("//div[@role='gridcell'][6]")));
        departmentList.forEach(t-> System.out.println("Department : "+t.getText()));
        // sutunun basligini yazdirin
        System.out.println("==========================================");
        WebElement baslik = driver.findElement(By.xpath("//*[@class='rt-tr']"));
        System.out.println("Tablo Title : "+baslik.getText());
       // Tablodaki tum datalari yazdirin
        System.out.println("==========================================");
         WebElement tumData = driver.findElement(By.xpath("//*[@class='rt-tbody']"));
        System.out.println("Tum Data : " + tumData.getText());
       // Tabloda kac cell (data) oldugunu yazdirin
        System.out.println("==========================================");
        WebElement cell = driver.findElement(By.xpath("(//*[@class='rt-tr -odd'])[1]"));
        System.out.println("Cell Sayisi : " +cell.getSize());
       // Tablodaki satir sayisini yazdirin
        System.out.println("==========================================");
        List<WebElement> satirSayisi = driver.findElements(By.xpath("//*[@class='rt-tr-group']"));
        System.out.println("Satir Sayisi--> " + satirSayisi.size());
       // Tablodaki sutun sayisini yazdirin
        System.out.println("==========================================");
        List<WebElement> sutunSayisi = driver.findElements(By.xpath("//*[@class='rt-td']"));
        System.out.println("Sutun Sayisi : " + sutunSayisi.size());
       // Tablodaki 3.kolonu yazdirin
        System.out.println("==========================================");
       List<WebElement> ucuncuSatir = driver.findElements(By.xpath("//div[@class='rt-td' or role='gridcell'][3]"));
       ucuncuSatir.forEach(t-> System.out.println(t.getText()));
       // Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        WebElement kiearra = driver.findElement(By.xpath("//*[@class='rt-td' or role='giridcell'][5]"));
        System.out.println("Kierra : " +kiearra.getText());
       // Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini  girdigimde bana datayi yazdirsin
    }
}
