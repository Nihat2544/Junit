package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_BeforeClassAfterClass {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        /*
        BeforeClass ve AfterClass notasyonlarını kullaniyorsak olusturacağımız methodu static yapmamız gerekiyor
         */
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterClass
    public static void tearDown(){
        driver.close();
    }
    @Test
    @Ignore
    /*
    Calismasini istemedigimiz test icin altina Ignore case kullanilir
     */
    public void method1() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://www.amazon.com");
    }
    @Test

    public void method2() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://www.techproeducation.com");
    }
    @Test
    public void method3() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://www.hepsiburada.com");
    }
}

