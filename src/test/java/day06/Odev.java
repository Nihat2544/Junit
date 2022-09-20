package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev {
    /*
    Bir Class olusturalim YanlisEmailTesti
http://automationpractice.com/index.php sayfasina gidelim
Sign in butonuna basalim
Email kutusuna @isareti olmayan bir mail yazip enter’a
bastigimizda “Invalid email address” uyarisi ciktigini test edelim

     */

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        //driver.close();
    }
    @Test
    public void test1() throws InterruptedException {
        // 1.Bir Class olusturalimYanlisEmailTesti
        // 2.http://automationpractice.com/index.php sayfasinagidelim
        driver.get("http://automationpractice.com/index.php");
        // 3.Sign in butonunabasalim
        driver.findElement(By.xpath("//*[@class='login']")).click();
        // 4.Email kutusuna @isareti olmayan bir mail yazipenter'a
        driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("nht.gmail.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='icon-user left']")).click();

    }
}
