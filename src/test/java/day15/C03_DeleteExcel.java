package day15;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C03_DeleteExcel {
    @Test
    public void DeleteTest1() throws IOException {
        //- Dosya yolunu bir String degiskene atayalim
        String dosyaYolu = "src/resources/ulkeler.xlsx";
        //- FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis = new FileInputStream(dosyaYolu);// Olusturmus oldugumuz dosyayi sistemde isleme alir.
        //- Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        //- WorkbookFactory.create(fileInputStream)
        Workbook workbook = WorkbookFactory.create(fis);// Workbook objesi ile isleme fis ile akisa aldigimiz dosyamila bir excel dosyasi creat ettik.
        //- Sheet objesi olusturun workbook.getSheetAt(index)
        Sheet sheet = workbook.getSheet("Sayfa1");// Excel dosyamizda calismak istedigimiz sayfayi bu sekilde seceriz.
        //- Row objesi olusturun sheet.getRow(index)
        Row row = sheet.getRow(3);//sayfa bir deki 3. satiri bu sekilde seceriz
        //- Cell objesi olusturun row.getCell(index)
        Cell cell = row.getCell(3);//Satir secimi yapildiktan sonra hucre secimi bu sekilde yapilir.
        System.out.println(cell);
        //-3. Satır 3. Cell'deki veriyi silelim
        //-Silindiğini test edin
    }
}
