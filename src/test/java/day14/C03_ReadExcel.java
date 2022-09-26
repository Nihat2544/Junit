package day14;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ReadExcel {
    @Test
    public void ReadExcelTest() throws IOException {
        int satir =12;
        int sutun =2;
        //Belirtilen satir no ve sutun no degerlerini parametre olarak alip
        String dosyaYolu = "src/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        //Sheet sheet = workbook.getSheet("sayfa1");
        //o cell'deki datayi konsola admiring.
        String actualData = workbook.
                getSheet("sayfa1").
                getRow(satir-1).
                getCell(sutun-1).
                toString();
        System.out.println(actualData);
        //Sonucun konsolda yazanla aynı oldugunu dogrulayalim
        String expectedData = "Baku";
        Assert.assertEquals(actualData,expectedData);
    }
}
