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

public class Odev1 {

    WebDriver driver;
    @Before
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void soru1() throws InterruptedException {

        //1. Tarayıcıyı başlatın
        //2. 'http://automationexercise.com' url'sine gidin
        driver.get("http://automationexercise.com");
        //3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        driver.getTitle();
        //4. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
        Thread.sleep((2000));
        driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
        //5. 'Yeni Kullanıcı Kaydı'nı doğrulayın! görünür
        WebElement yeniKullanici= driver.findElement(By.xpath("(//*[@type='hidden'])[1]"));
        //6. Adı ve e-posta adresini girin
        WebElement adı = driver.findElement(By.xpath("//*[@type='text']"));
        Thread.sleep(2000);
        adı.sendKeys("Nihat", Keys.ENTER);
        WebElement email = driver.findElement(By.xpath("//*[@data-qa='signup-email']"));
        Thread.sleep(2000);
        email.sendKeys("nho@gmail.com", Keys.ENTER);

        //7. 'Kaydol' düğmesini tıklayın
        Thread.sleep(2000);
        WebElement kaydol = driver.findElement(By.xpath("(//*[@type='submit'])[1]"));
        //8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin görünür olduğunu doğrulayın
        driver.findElement(By.xpath("(//*[@class='title text-center'])[1]"));
        //9. Doldurma ayrıntıları: Unvan, Ad, E-posta, Şifre, Doğum tarihi
        driver.findElement(By.xpath("//*[@id='uniform-id_gender1']")).click();
        Thread.sleep(2000);
        WebElement ad = driver.findElement(By.xpath("//*[@id='name']"));
        ad.sendKeys("Nihat",Keys.ENTER);
        Thread.sleep(2000);
        WebElement eposta = driver.findElement(By.xpath("//*[@id='email']"));
        Thread.sleep(2000);
        WebElement sifre = driver.findElement(By.xpath("//*[@id='password']"));
        sifre.sendKeys("1234.a",Keys.ENTER);
        Thread.sleep(2000);
        WebElement dogumTarihi = driver.findElement(By.xpath("(//*[@class='row'])[1]"));
        Thread.sleep(2000);
        WebElement day = driver.findElement(By.xpath("//*[@id='days']"));
        day.sendKeys("20",Keys.ENTER);
        Thread.sleep(2000);
        WebElement month = driver.findElement(By.xpath("//*[@id='months']"));
        month.sendKeys("July",Keys.ENTER);
        Thread.sleep(2000);
        WebElement year = driver.findElement(By.xpath("//*[@id='years']"));
        year.sendKeys("1985",Keys.ENTER);
        //10. 'Bültenimize kaydolun!' onay kutusunu seçin.
        driver.findElement(By.xpath("//*[@id='newsletter']")).click();
        //11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
        driver.findElement(By.xpath("//*[@id='optin']")).click();
        Thread.sleep(1000);
        //12. Doldurma ayrıntıları: Ad, Soyadı, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
        Thread.sleep(2000);
        WebElement ad1 = driver.findElement(By.xpath("//*[@id='first_name']"));
        ad1.sendKeys("nihat",Keys.ENTER);
        Thread.sleep(2000);
        WebElement soyad = driver.findElement(By.xpath("//*[@id='last_name']"));
        soyad.sendKeys("aaaa",Keys.ENTER);
        Thread.sleep(2000);
        WebElement sirket = driver.findElement(By.xpath("//*[@id='company']"));
        Thread.sleep(2000);
        WebElement adres1 = driver.findElement(By.xpath("//*[@id='address1']"));
        Thread.sleep(2000);
        adres1.sendKeys("aaaa",Keys.ENTER);
        WebElement adres2 = driver.findElement(By.xpath("//*[@id='address2']"));
        Thread.sleep(2000);
        adres2.sendKeys("aaaa",Keys.ENTER);
        WebElement ulke = driver.findElement(By.xpath("//*[@id='country']"));
        Thread.sleep(2000);
        ulke.sendKeys("Canada",Keys.ENTER);
        WebElement eyalet = driver.findElement(By.xpath("//*[@id='state']"));
        Thread.sleep(2000);
        eyalet.sendKeys("Newyork",Keys.ENTER);
        WebElement sehir = driver.findElement(By.xpath("//*[@id='city']"));
        Thread.sleep(2000);
        sehir.sendKeys("aaaa",Keys.ENTER);
        WebElement postaKod= driver.findElement(By.xpath("//*[@id='zipcode']"));
        Thread.sleep(2000);
        postaKod.sendKeys("1515",Keys.ENTER);
        WebElement cepNo = driver.findElement(By.xpath("//*[@id='mobile_number']"));
        cepNo.sendKeys("012345",Keys.ENTER);
        //13. 'Hesap Oluştur düğmesini' tıklayın
        Thread.sleep(2000);
        WebElement hesapOlustur = driver.findElement(By.xpath("(//*[@type='submit'])[1]"));
        //14. 'HESAP OLUŞTURULDU!' görünür
        driver.findElement(By.xpath("//*[@class='title text-center']"));
        //15. 'Devam' düğmesini tıklayın
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        //16. 'Kullanıcı adı olarak oturum açıldı' ifadesinin görünür olduğunu doğrulayın
        driver.findElement(By.xpath("//*[@class='fa fa-user']"));
        //17. 'Hesabı Sil' düğmesini tıklayın
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='fa fa-trash-o']")).click();
        //18. 'HESAP SİLİNDİ!' görünür ve 'Devam' düğmesini tıklayın
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[text()='Delete Account'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Delete']")).click();
        Thread.sleep(2000);


    }
    @After
    public void tearDown(){
        driver.close();
    }
}
