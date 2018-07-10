/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectStatistik;

/**
 *
 * @author Fadly
 */

public class ObjectXcle {
    int jumlah;
    String id;

    public void setId(String id){
        this.id=id;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
   
    public String getId(){
        return this.id;
    }
    
    public int getJumlah(){
        return this.jumlah;
    }

}
