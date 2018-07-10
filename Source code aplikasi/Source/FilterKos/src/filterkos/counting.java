/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filterkos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Fadly
 */
public class counting {
    public static int countKecamatan(String kec) throws IOException {
      FileInputStream xcleFile = new FileInputStream(new File("src\\Object\\data_terbaru.xlsx"));
      int jumlah = 0;
      String kecamatan;
      
      XSSFWorkbook workbook = new XSSFWorkbook(xcleFile);
      XSSFSheet spreadsheet = workbook.getSheetAt(0); //Read sheet pertama
      Iterator < Row >  rowIterator = spreadsheet.iterator();
      rowIterator.next();
      
      while (rowIterator.hasNext()){
          Row currentRow = rowIterator.next();
          
          Cell kecam = currentRow.getCell(17);
          
          kecamatan=kecam.getStringCellValue();
          if (kecamatan.equals(kec)){
              jumlah += 1;
          }
      }
        
        return jumlah;
}
    public static int countTipe(String tip) throws IOException {
      FileInputStream xcleFile = new FileInputStream(new File("src\\Object\\data_terbaru.xlsx"));
      int jumlah = 0;
      String tipe;
      
      XSSFWorkbook workbook = new XSSFWorkbook(xcleFile);
      XSSFSheet spreadsheet = workbook.getSheetAt(0); //Read sheet pertama
      Iterator < Row >  rowIterator = spreadsheet.iterator();
      rowIterator.next();
      
      while (rowIterator.hasNext()){
          Row currentRow = rowIterator.next();
          
          Cell type = currentRow.getCell(2);
          
          tipe = type.getStringCellValue();
          if (tipe.equals(tip)){
              jumlah += 1;
          }
      }
        
        return jumlah;
}
    public static int countRange(int max, int min) throws IOException {
      FileInputStream xcleFile = new FileInputStream(new File("src\\Object\\data_terbaru.xlsx"));
      int jumlah = 0, price;
      
      XSSFWorkbook workbook = new XSSFWorkbook(xcleFile);
      XSSFSheet spreadsheet = workbook.getSheetAt(0); //Read sheet pertama
      Iterator < Row >  rowIterator = spreadsheet.iterator();
      rowIterator.next();
      
      while (rowIterator.hasNext()){
          Row currentRow = rowIterator.next();
          
          Cell harga = currentRow.getCell(3);
          
          price = (int) harga.getNumericCellValue();
          if (price>=min && price<=max){
              jumlah += 1;
          }
      }
        
        return jumlah;
}
    
}
