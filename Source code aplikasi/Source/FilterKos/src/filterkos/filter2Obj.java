/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filterkos;

import Object.ObjectXcle;
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
 * @author Fadly
 */
public class filter2Obj {
    static List<ObjectXcle> filter = new ArrayList<>();
    
    public List<ObjectXcle> filterHargKec(int max, int min, String kec) throws IOException {
      FileInputStream xcleFile = new FileInputStream(new File("src\\Object\\data_terbaru.xlsx"));
      
      XSSFWorkbook workbook = new XSSFWorkbook(xcleFile);
      XSSFSheet spreadsheet = workbook.getSheetAt(0); //Read sheet pertama
      Iterator < Row >  rowIterator = spreadsheet.iterator();
      rowIterator.next();
      
      while (rowIterator.hasNext()){
          Row currentRow = rowIterator.next();
          
          Cell id = currentRow.getCell(0);
          Cell namaKos = currentRow.getCell(1);
          Cell type = currentRow.getCell(2);
          Cell harga = currentRow.getCell(3);
          Cell roomFas = currentRow.getCell(4);
          Cell area = currentRow.getCell(5);
          Cell bathFas = currentRow.getCell(6);
          Cell umFas = currentRow.getCell(7);
          Cell pakFas = currentRow.getCell(8);
          Cell akSel = currentRow.getCell(9);
          Cell akses = currentRow.getCell(10);
          Cell ketLain = currentRow.getCell(11);
          Cell ketBi = currentRow.getCell(12);
          Cell desKet = currentRow.getCell(13);
          Cell desKos = currentRow.getCell(14);
          Cell alamat = currentRow.getCell(15);
          Cell kelur = currentRow.getCell(16);
          Cell kecam = currentRow.getCell(17);
          Cell owner = currentRow.getCell(18);
          Cell poto = currentRow.getCell(19);
          Cell univ = currentRow.getCell(20);
          
          ObjectXcle str = new ObjectXcle();
          str.setHarga((int) harga.getNumericCellValue());
          str.setKecamatan(kecam.getStringCellValue());
          
          if (str.getHarga()>=min && str.getHarga()<=max && str.getKecamatan().equals(kec)){
              str.setAkses(akses.getStringCellValue());
              str.setLinkPhoto(poto.getStringCellValue());
              str.setArea(area.getStringCellValue());
              str.setUniversity(univ.getStringCellValue());
              str.setAksel(akSel.getStringCellValue());
              str.setAlamat(alamat.getStringCellValue());
              str.setBathfas(bathFas.getStringCellValue());
              str.setId(id.getStringCellValue());
              str.setKelurahan(kelur.getStringCellValue());
              str.setNama(namaKos.getStringCellValue());
              str.setPakfas(pakFas.getStringCellValue());
              str.setRoomfas(roomFas.getStringCellValue());
              str.setTipe(type.getStringCellValue());
              str.setUmfas(umFas.getStringCellValue());
              str.setKetLain(ketLain.getStringCellValue());
              str.setKetBi(ketBi.getStringCellValue());
              str.setDesKet(desKet.getStringCellValue());
              str.setDesKos(desKos.getStringCellValue());
              str.setOwner(owner.getStringCellValue());
              filter.add(str);
          }
      }
        
        return filter;
}
    public List<ObjectXcle> filterHargTipe(int max, int min, String tipe) throws IOException {
      FileInputStream xcleFile = new FileInputStream(new File("src\\Object\\data_terbaru.xlsx"));
      
      XSSFWorkbook workbook = new XSSFWorkbook(xcleFile);
      XSSFSheet spreadsheet = workbook.getSheetAt(0); //Read sheet pertama
      Iterator < Row >  rowIterator = spreadsheet.iterator();
      rowIterator.next();
      
      while (rowIterator.hasNext()){
          Row currentRow = rowIterator.next();
          
          Cell id = currentRow.getCell(0);
          Cell namaKos = currentRow.getCell(1);
          Cell type = currentRow.getCell(2);
          Cell harga = currentRow.getCell(3);
          Cell roomFas = currentRow.getCell(4);
          Cell area = currentRow.getCell(5);
          Cell bathFas = currentRow.getCell(6);
          Cell umFas = currentRow.getCell(7);
          Cell pakFas = currentRow.getCell(8);
          Cell akSel = currentRow.getCell(9);
          Cell akses = currentRow.getCell(10);
          Cell ketLain = currentRow.getCell(11);
          Cell ketBi = currentRow.getCell(12);
          Cell desKet = currentRow.getCell(13);
          Cell desKos = currentRow.getCell(14);
          Cell alamat = currentRow.getCell(15);
          Cell kelur = currentRow.getCell(16);
          Cell kecam = currentRow.getCell(17);
          Cell owner = currentRow.getCell(18);
          Cell poto = currentRow.getCell(19);
          Cell univ = currentRow.getCell(20);
          
          ObjectXcle str = new ObjectXcle();
          str.setHarga((int) harga.getNumericCellValue());
          str.setTipe(type.getStringCellValue());
          
          if (str.getHarga()>=min && str.getHarga()<=max && str.getTipe().equals(tipe)){
              str.setId(id.getStringCellValue());
              str.setNama(namaKos.getStringCellValue());
              str.setRoomfas(roomFas.getStringCellValue());
              str.setArea(area.getStringCellValue());
              str.setBathfas(bathFas.getStringCellValue());
              str.setUmfas(umFas.getStringCellValue());
              str.setPakfas(pakFas.getStringCellValue());
              str.setAksel(akSel.getStringCellValue());
              str.setAkses(akses.getStringCellValue());
              str.setKetLain(ketLain.getStringCellValue());
              str.setKetBi(ketBi.getStringCellValue());
              str.setDesKet(desKet.getStringCellValue());
              str.setDesKos(desKos.getStringCellValue());
              str.setAlamat(alamat.getStringCellValue());
              str.setKelurahan(kelur.getStringCellValue());
              str.setKecamatan(kecam.getStringCellValue());
              str.setOwner(owner.getStringCellValue());
              str.setLinkPhoto(poto.getStringCellValue());
              str.setUniversity(univ.getStringCellValue());
              
              filter.add(str);
          }
      }
        
        return filter;
}
    public List<ObjectXcle> filterKecTipe(String tipe, String kec) throws IOException {
      FileInputStream xcleFile = new FileInputStream(new File("src\\Object\\data_terbaru.xlsx"));
      
      XSSFWorkbook workbook = new XSSFWorkbook(xcleFile);
      XSSFSheet spreadsheet = workbook.getSheetAt(0); //Read sheet pertama
      Iterator < Row >  rowIterator = spreadsheet.iterator();
      rowIterator.next();
      
      while (rowIterator.hasNext()){
          Row currentRow = rowIterator.next();
          
          Cell id = currentRow.getCell(0);
          Cell namaKos = currentRow.getCell(1);
          Cell type = currentRow.getCell(2);
          Cell harga = currentRow.getCell(3);
          Cell roomFas = currentRow.getCell(4);
          Cell area = currentRow.getCell(5);
          Cell bathFas = currentRow.getCell(6);
          Cell umFas = currentRow.getCell(7);
          Cell pakFas = currentRow.getCell(8);
          Cell akSel = currentRow.getCell(9);
          Cell akses = currentRow.getCell(10);
          Cell ketLain = currentRow.getCell(11);
          Cell ketBi = currentRow.getCell(12);
          Cell desKet = currentRow.getCell(13);
          Cell desKos = currentRow.getCell(14);
          Cell alamat = currentRow.getCell(15);
          Cell kelur = currentRow.getCell(16);
          Cell kecam = currentRow.getCell(17);
          Cell owner = currentRow.getCell(18);
          Cell poto = currentRow.getCell(19);
          Cell univ = currentRow.getCell(20);
          
          ObjectXcle str = new ObjectXcle();
          str.setKecamatan(kecam.getStringCellValue());
          str.setTipe(type.getStringCellValue());
          
          if (str.getKecamatan().equals(kec) && str.getTipe().equals(tipe)){
              str.setAkses(akses.getStringCellValue());
              str.setLinkPhoto(poto.getStringCellValue());
              str.setArea(area.getStringCellValue());
              str.setUniversity(univ.getStringCellValue());
              str.setHarga((int) harga.getNumericCellValue());
              str.setAksel(akSel.getStringCellValue());
              str.setAlamat(alamat.getStringCellValue());
              str.setBathfas(bathFas.getStringCellValue());
              str.setId(id.getStringCellValue());
              str.setKelurahan(kelur.getStringCellValue());
              str.setNama(namaKos.getStringCellValue());
              str.setPakfas(pakFas.getStringCellValue());
              str.setRoomfas(roomFas.getStringCellValue());
              str.setUmfas(umFas.getStringCellValue());
              str.setKetLain(ketLain.getStringCellValue());
              str.setKetBi(ketBi.getStringCellValue());
              str.setDesKet(desKet.getStringCellValue());
              str.setDesKos(desKos.getStringCellValue());
              str.setOwner(owner.getStringCellValue());
              filter.add(str);
          }
      }
        
        return filter;
}
}
