package alıstirma;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class TekrarSoru extends TestBaseBeforeAfter {

    @Test
    public void test1() throws InterruptedException {
       // https://www.amazon.com/ sayfasina gidelim arama kutusunu locate edelim
        driver.get("https://www.amazon.com/");
       // “Samsung headphones” ile arama yapalim
        Thread.sleep(1500);
        WebElement baslik = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        baslik.sendKeys("Samsung headphones", Keys.ENTER);
        // Bulunan sonuc sayisini yazdiralim
        System.out.println(baslik.getSize());
        // Ilk urunu tiklayalim
       // Sayfadaki tum basliklari yazdiralim
    }
}
