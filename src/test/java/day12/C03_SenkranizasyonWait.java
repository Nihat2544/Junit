package day12;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBaseBeforeAfter;

import java.time.Duration;

public class C03_SenkranizasyonWait extends TestBaseBeforeAfter {
    @Test
    public void imlcitlyWaitTest() throws InterruptedException {
        // 1. Bir class olusturun : WaitTest
        // 2. Iki tane metod olusturun : implicitWait() , explicitWait()
        //    Iki metod icin de asagidaki adimlari test edin.
        /*
        imlicitlyWait kullandigimiz bu method
         */
       // 3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls ");
       // 4. Remove butonuna basin.
        driver.findElement(By.xpath("//*[text()='Remove']")).click();
       // 5. "It's gone!" mesajinin goruntulendigini dogrulayin.
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='message']")).isDisplayed());
      // 6. Add buttonuna basin
        driver.findElement(By.xpath("//*[text()='Add']")).click();
      // 7. It's back mesajinin gorundugunu test edin
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='message']")).isDisplayed());
    }

    @Test
    public void explicitWaitTest2() {
        // 3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls ");
        // 4. Remove butonuna basin.
        driver.findElement(By.xpath("//*[text()='Remove']")).click();
        // 5. "It's gone!" mesajinin goruntulendigini dogrulayin.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement itsGoneWE = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//*[@id='message']")));
        Assert.assertTrue(itsGoneWE.isDisplayed());
        /*
        explicitWait itsgonWE gorunur olmasini beklerken o web elentinin
        locate'ni kullanarak assert yapmak sorun olur ve exeption firlatir.
        Henuz gorulmeyen bir webelement'in locate edilmeside otomasyon icin
        mumkun olmaz. Bu durumda bekleme islemi icin explicitWait'i locate ile
        birlikte kullaniriz.
         */
        // 6. Add buttonuna basin
        driver.findElement(By.xpath("//*[text()='Add']")).click();
        // 7. It's back mesajinin gorundugunu test edin
        WebElement itsBackWE = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//*[@id='message']")));
        Assert.assertTrue(itsBackWE.isDisplayed());
    }
}
