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
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



/**
 *
 * @author Fadly
 */
public class ReadXcel {
  static XSSFRow row;
    public void baca() throws IOException{
      FileInputStream fis = new FileInputStream(new File("src/data/DataDummy.xlsx"));
      
      XSSFWorkbook workbook = new XSSFWorkbook(fis);
      XSSFSheet spreadsheet = workbook.getSheetAt(0); //Read sheet pertama
      Iterator < Row >  rowIterator = spreadsheet.iterator(); //Masuki data row dari sheet ke Iterator(List?)
      
      while (rowIterator.hasNext()) { //Selama row selanjutnya masih ada
         row = (XSSFRow) rowIterator.next();
         Iterator < Cell >  cellIterator = row.cellIterator(); //Masukin data cell dari sheet ke Iterator(List?)
         
         while ( cellIterator.hasNext()) { //Selama cell selanjutnya masih ada
            Cell cell = cellIterator.next();
            
            switch (cell.getCellType()) { //Switch untuk melihat tipe dari cell sehingga bisa ditampilkan sesuai tipenya
               case Cell.CELL_TYPE_NUMERIC:
                  System.out.print(cell.getNumericCellValue() + " \t\t ");  //edit this line with assignment
                  break;
               
               case Cell.CELL_TYPE_STRING:
                  System.out.print(cell.getStringCellValue() + " \t\t ");  //edit this line with assignment
                  break;
            }
         }
         System.out.println();
      }
      fis.close();
    
    }
    
    public void Filter(boolean k, boolean h, boolean s, int kec, int harg, int sch){
        String kecamatan, school;
        int harga;
        if (kec!=0){
            
        }
    }
}
