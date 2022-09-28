package day15;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Odev {
    /*
    1.satirdaki 2.hucreye gidelim ve yazdiralim
1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
Satir sayisini bulalim
Fiziki olarak kullanilan satir sayisini bulun
Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim
     */

    @Test
    public void odev() throws IOException {
        String dosyaYolu = "src/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        //1.satirdaki 2.hucreye gidelim ve yazdiralim
        Sheet sheet = workbook.getSheet("sayfa1");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(1);
        System.out.println(cell);
        //System.out.println(workbook.getSheet("sayfa1").getRow(0).createCell(1));

        //2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
        Sheet sheet1 = workbook.getSheet("sayfa1");


    }
}
