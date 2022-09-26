package grupCalismasi;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBaseBeforeAfter;

public class Soru1 extends TestBaseBeforeAfter {
    @Test
    public void tes() {

//1. Tarayıcıyı başlatın
//2. 'http://automationexercise.com' url'sine gidin
driver.get("http://automationexercise.com");
//3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='slider']")).isDisplayed());
//4. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
        driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
//5. 'Yeni Kullanıcı Kaydı'nı doğrulayın! görünür
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='New User Signup!']")).isDisplayed());
//6. Adı ve kayıtlı e-posta adresini girin
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Nihat");
        driver.findElement(By.xpath("(//*[@name='email'])[2]")).sendKeys("nho@gmail.com");

//7. 'Kaydol' düğmesini tıklayın
        driver.findElement(By.xpath("//*[text()='Signup']")).click();
//8. 'E-posta Adresi zaten var!' hatasını doğrulayın. görünür
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Email Address already exist!']")).isDisplayed());

    }
}
