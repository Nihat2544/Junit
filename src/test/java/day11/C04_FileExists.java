package day11;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBaseBeforeAfter;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileExists {
    @Test
    public void test1() {
       // System.out.println(System.getProperty("user.dir"));///Users/nihatkizilkula/Desktop/Yeni Class/com.Beach81JUnit
        //Suanki icinde bulundugumuz yolu gosterir.

      //  System.out.println(System.getProperty("user.home"));///Users/nihatkizilkula
        // Gecerli kullanicinin ana dizinini verir
/*
        String farkliBolum = System.getProperty("user.home");
        //untitled folder-->Masa ustundeki dosyanın yolu
        String ortakBolum =

 */
        String dosyaYolu = "untitled folder";
        System.out.println(Files.exists(Paths.get(dosyaYolu)));
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
        /*
        Bir Web sitesinden indirdigimiz yada windows icinde
        olusturdugumuz dosyanin indigini yada orda oldugunu
        test edebilmek icin o dosyanin uzerine shift tusuna
        basili olarak sag click yapip dosyanin yolunu kopyalayıp
        bir String degiskene atariz ve dosyayi dogrulamak icin
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
        Bu methodu kullaniriz.
       */
    }
}
