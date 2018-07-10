/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filterkos;

import Object.ObjectXcle;
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
    }
}