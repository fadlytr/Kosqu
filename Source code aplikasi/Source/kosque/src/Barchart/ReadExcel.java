/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barchart;

import ObjectStatistik.ObjectXcle;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Salman Al Hafizh
 */
public class ReadExcel {
    static List<ObjectXcle> bacaData = new ArrayList<>();
    
    public List<ObjectXcle> ReadExcel(int no_sheet) throws IOException {
        FileInputStream xcleFile = new FileInputStream(new File("src\\Object\\Data.xlsx"));

        XSSFWorkbook workbook = new XSSFWorkbook(xcleFile);
        XSSFSheet spreadsheet = workbook.getSheetAt(no_sheet); //Read sheet pertama
        Iterator < Row >  rowIterator = spreadsheet.iterator();
        rowIterator.next();

        while (rowIterator.hasNext()){
            Row currentRow = rowIterator.next();

            Cell id = currentRow.getCell(0);
            Cell jumlah = currentRow.getCell(1);

            ObjectXcle str = new ObjectXcle();
            str.setJumlah((int)jumlah.getNumericCellValue());
            str.setId(id.getStringCellValue());

            bacaData.add(str);
        }

          return bacaData;
    }
}
