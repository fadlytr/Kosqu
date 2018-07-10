/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filterkos;

import Object.ObjectXcle;
import static filterkos.counting.countKecamatan;
import static filterkos.counting.countRange;
import static filterkos.counting.countTipe;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Fadly
 */
public class FilterKos {
   
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        filter2Obj fil2 = new filter2Obj();
        filter3Obj fil3 = new filter3Obj();
        List<ObjectXcle> fin = fil3.filter3Object(200000000,20000, "Andir", "Campuran");
        String macam;
        String[] part;
        int i;
        
        for (ObjectXcle item : fin) {
            System.out.println(item.getNama()+ "\n tipe: " + item.getTipe() + "\n harga: " + item.getHarga()+ "\n aksel: " + item.getAksel()+ "\n alamt: " +item.getAlamt()+ "\n bathfas " +item.getBathfas()+ "\n desket: " +item.getDesKet()+ "\n deskos " +item.getDesKos()+ "\n id: " +item.getId());
        }
        
        String[] kecamatan={"Andir","Antapani","Arcamanik","Astanaanyar","Babakanciparay","Bandung Kidul","BandungKulon","Bandung Wetan","Batununggal",
            "Bojongloa Kaler","Bojongloa Kidul","Buah Batu","Cibeunying Kaler","Cibeunying Kidul","Cibiru","Cicendo","Cidadap","Cimenyan","Cinambo","Coblong",
            "Dayeuhkolot","Gedebage","Kiaracondong","Lengkong","Mandalajati","Panyileukan","Parongpong","Rancasari","Regol","Sukajadi",
            "Sukasari","Sumurbandung","Ujung Berung"};
        for ( i = 0; i < 33; i++) {
            System.out.println(countKecamatan(kecamatan[i])+kecamatan[i]);
        }
        
        String[] gender={"Pria","Campuran","Wanita"};
        
        for ( i = 0; i < 3; i++) {
            System.out.println(countTipe(gender[i])+gender[i]);
        }
        
        int[] max = {499999,999999,1499999,1999999,2999999,999999999};
        int[] min = {0,500000,1000000,1500000,2000000,3000000};
        
        
        for (i = 0; i < 6; i++) {
            
            System.out.println(countRange(max[i],min[i]));
            if(i<5){
               System.out.println(min[i]+"-"+max[i]);
            }else
                System.out.println("diatas " + min[i]);
        }
    }
}