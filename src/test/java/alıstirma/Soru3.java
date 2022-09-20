package alıstirma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru3 {

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
        driver.close();
     }
     @Test
    public void test1() throws InterruptedException {
        // 1. http://zero.webappsecurity.com/ Adresine gidin
         driver.get("http://zero.webappsecurity.com/");
        // 2. Sign in butonuna basin
         Thread.sleep(1500);
         driver.findElement(By.xpath("//*[@class='icon-signin']")).click();
        // 3. Login kutusuna “username” yazin
         Thread.sleep(1500);
         driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("username");
        // 4. Password kutusuna “password.” yazin
         Thread.sleep(1500);
         driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("password");
        // 5. Sign in tusuna basin
         Thread.sleep(1500);
         driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
         Thread.sleep(1500);
         driver.navigate().back();
        // 6. Pay Bills sayfasina gidin
         Thread.sleep(1500);
         driver.findElement(By.xpath("(//*[text()='Online Banking'])[1]")).click();
         Thread.sleep(1500);
         driver.findElement(By.xpath("//*[@id='pay_bills_link']")).click();
        // 7. “Purchase Foreign Currency” tusuna basin
         Thread.sleep(1500);
         driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency']")).click();
        // 8. “Currency” drop down menusunden Eurozone’u secin
         Thread.sleep(1500);
         driver.findElement(By.xpath("//*[@id='pc_currency']")).sendKeys("Eurozone");
        // 9. “amount” kutusuna bir sayi girin
         driver.findElement(By.xpath("//*[@id='pc_amount']")).sendKeys("25");
        // 10. “US Dollars” in secilmedigini test edin
         driver.findElement(By.xpath("//*[@id='pc_inDollars_true']"));
        // 11. “Selected currency” butonunu secin
         Thread.sleep(1500);
         driver.findElement(By.xpath("//*[@id='pc_inDollars_false']")).click();
        // 12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
         Thread.sleep(1500);
         driver.findElement(By.xpath("//*[@id='pc_calculate_costs']")).click();
         Thread.sleep(1500);
         driver.findElement(By.xpath("//*[@id='purchase_cash']")).click();
        // 13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini kontrol edin
         WebElement foreign = driver.findElement(By.xpath("//*[@id='alert_content']"));
         Assert.assertTrue(foreign.isDisplayed());
         String str = " EMEGIN KARSILIGINI ALMAK COK GUZEL";
         System.out.println(str);
         Thread.sleep(4000);
     }
}
