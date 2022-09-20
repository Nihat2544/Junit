package alıstirma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class IframeOdev {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void tearDown(){
        //driver.close();
    }
    @Test
    public void test1() throws InterruptedException {
      //  1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/ ");
        //  2) sayfadaki iframe sayısını bulunuz.
        List<WebElement> iframeSayisi = driver.findElements(By.xpath("//iframe"));
        System.out.println(iframeSayisi);
        System.out.println(iframeSayisi.size());
      //  3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@width='560']")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@aria-label='Play']")).click();
      //  4) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().defaultContent();
      //  5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html) tıklayınız
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='a077aa5e']")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();


    }
}
