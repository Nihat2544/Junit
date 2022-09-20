package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev2 {
    /*
1. http://zero.webappsecurity.com sayfasina gidin
2. Signin buttonuna tiklayin
3. Login alanine “username” yazdirin
4. Password alanine “password” yazdirin
5. Sign in buttonuna tiklayin
6. Pay Bills sayfasina gidin
7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
8. tarih kismina “2020-09-10” yazdirin
9. Pay buttonuna tiklayin
10. “The payment was successfully submitted.” mesajinin ciktigini control edin
     */
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }
    @Test
    public void method1() throws InterruptedException {
        // 1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com ");
        // 2. Signin buttonuna tiklayin
        Thread.sleep(1500);
       driver.findElement(By.xpath("//*[@id='signin_button']")).click();
       Thread.sleep(1500);
        // 3. Login alanine “username” yazdirin
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
        Thread.sleep(1500);
        // 4. Password alanine “password” yazdirin
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
        Thread.sleep(1500);
        // 5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        // 6. Pay Bills sayfasina gidin
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id='details-button']")).click();
        driver.navigate().back();
        // 7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        
        // 8. tarih kismina “2020-09-10” yazdirin
        // 9. Pay buttonuna tiklayin
        // 10. “The payment was successfully submitted.” mesajinin ciktigini control edin
    }
    @After
    public void tearDown(){
       // driver.close();
    }
}
