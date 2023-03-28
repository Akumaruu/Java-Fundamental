/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.ArrayList;

/**
 *
 * @author akmal
 */
public class dataSiswa {
    public static void main(String[] args) {
        ArrayList dataSiswa = new ArrayList ();
        dataSiswa.add("Akmal");
        dataSiswa.add("XRPL3");
        dataSiswa.add("Absen 25");
        dataSiswa.add("Malang");
        
        
        for (int i = 0 ; i < dataSiswa.size() ; i++ ){
            System.out.println(dataSiswa.get(i));
        }
                
    }
    
}
