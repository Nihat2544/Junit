package alıstirma;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class soru1 {
    /*
2. 'http://automationexercise.com' url'sine gidin
3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
4. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
5. 'Hesabınıza giriş yapın' ifadesinin görünür olduğunu doğrulayın
6. Doğru e-posta adresini ve şifreyi girin
7. 'Giriş' düğmesini tıklayın
8. 'Kullanıcı adı olarak oturum açıldı' ifadesinin görünür olduğunu doğrulayın
9. 'Hesabı Sil' düğmesini tıklayın
10. 'HESAP SİLİNDİ!' görünür
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
        //2. 'http://automationexercise.com' url'sine gidin
        driver.get("https://www.automationexercise.com/test_cases");
        //3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        driver.getTitle();
        //4. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
        driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
        //5. 'Hesabınıza giriş yapın' ifadesinin görünür olduğunu doğrulayın
        driver.findElement(By.xpath("//h2"));
        //6. Doğru e-posta adresini ve şifreyi girin
        driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("nho@gmail.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("1234.a");
        //7. 'Giriş' düğmesini tıklayın
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[text()='Login']")).click();
        //8. 'Kullanıcı adı olarak oturum açıldı' ifadesinin görünür olduğunu doğrulayın
        driver.findElement(By.xpath("//*[@class='fa fa-user']"));
        //9. 'Hesabı Sil' düğmesini tıklayın
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='fa fa-trash-o']")).click();
        //10. 'HESAP SİLİNDİ!' görünür
        driver.findElement(By.xpath("//*[text()='DELETE']")).click();
    }
}
