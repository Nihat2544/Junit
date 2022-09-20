package day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_WindowsHandle {
    WebDriver driver;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public void tearDown() {
        //driver.close();
    }
    @Test
    public void test1() throws InterruptedException {
        //1- Amazon Sayfasina girelim
        driver.get("https://amazon.com");
        String amazonWindowHandle = driver.getWindowHandle();
        /*
        Eger bize verilen testde sayfalara arasi gecis varsa her driver.get() methodundan sonra
        driver'in Window handle degerini string bir degiskene atariz
        Sonrasinda farkli bir sayfaya yada sekmeye gittikten sonra tekrar ilk sayfaya donmemiz
        istenirse String degiskene atatadigimiz windowHandle degerleriyle sayfalar arasi gecis yapariz
         */
        //2- Url'nin amazon içerdiğini test edelim
        String expectedUrl = "amazon";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        //3- Yeni bir pencere açıp bestbuy anasayfasına gidelim.(https://www.bestbuy.com)
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);//Yeni bir pencere acmak icin bu methodu kullaniriz
        Thread.sleep(1500);
        driver.get("https://www.bestbuy.com");
        String bestbuyWindowHandle = driver.getWindowHandle();
        //4- title'in BestBuy içerdiğini test edelim
        Thread.sleep(1500);
        String expectedTitle = "Best Buy";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        //5- İlk sayfaya dönüp sayfada java aratalım
        Thread.sleep(1500);
        driver.switchTo().window(amazonWindowHandle);//Sayfalar arasi gecis icin bu method kullanilir
        WebElement searcbox = driver.findElement(By.id("twotabsearchtextbox"));
        searcbox.sendKeys("java", Keys.ENTER);
        //6- Arama sonuclarının java içerdiğini test edelim
        WebElement aramaSonucu = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        String arananKelime = "java";
        String actualSonuc = aramaSonucu.getText();
        Assert.assertTrue(actualSonuc.contains(arananKelime));
        //7- Yeniden bestbuy sayfasına gidelim
        Thread.sleep(1500);
        driver.switchTo().window(bestbuyWindowHandle);
        //8- Logonun görünürlüğünü test edelim
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='logo'])[1]")).isDisplayed());


    }
}
