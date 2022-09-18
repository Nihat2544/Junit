package alıstirma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class soru2 {
    WebDriver driver;

    @Before
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() {
        //driver.close();
    }

    @Test
    public void test1() {
       // 2. 'http://automationxercise.com' URL'ye gidin.
        driver.get("https://www.automationexercise.com/test_cases");
       // 3 Ana sayfanın başarıyla görünür olduğunu doğrulayın
        driver.getTitle();
       // 4. 'Kayıt / Giriş' düğmesine tıklayın
        driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
       // 5. 'Hesabınıza giriş yapın' görünür olduğunu doğrulayın
        driver.findElement(By.xpath("//h2"));
       // 6. Yanlış e -posta adresi ve şifre girin
        driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("nho@gmail.com");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("123456");
       // 7. 'Giriş' düğmesine tıklayın
        driver.findElement(By.xpath("//*[text()='Login']")).click();
       // 8. 'E -postanız veya şifreniz yanlış!' Hatasını doğrulayın. Görünür
        driver.findElement(By.xpath("//*[text()='Your email or password is incorrect!']"));
    }
}