package day15;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class C04_GetSecreenShot extends TestBaseBeforeAfter {
    @Test
    public void test1() throws IOException {
        //Amazon sayfasina gidelim tum sayfanin resmini alalim
        driver.get("https://www.bestbuy.com");


        /*
        Bir Web sayfasinin resmini alabilmek icin TakesScreenshot class'indan obje
        olusturup gecici bir File class'indan degiskene TakesScreenshot'dan olusturdugum obje'den
        getScreenshotAs() method'unu kullanarak gecici bir file olustururuz.
         */
        //Faker faker = new Faker();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File tumSayfaResmi = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tumSayfaResmi,new File("target/ekranGoruntusu/AllPage"+tarih+".jpeg"));
       // FileUtils.copyFile(tumSayfaResmi, new File("target/ekranGoruntusu/"+faker.name().name()+"AllPage.jpeg"));

/*
==================ACİKLAMA=====================

//resmi resmin uzerine degil de yeni bir resim olarak alabilmek icin image ismine tarih ekleyip atadik
//tarih in normal formati dosya isimlendirmeye uygun olmadigi icin tarih yazim formati ile oynayip uygun hale getirdik
//sonra bu sekil bize her zaman lazim olabilir diye TestDataBase imize attik

 */

    }
}
