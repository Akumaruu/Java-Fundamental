/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package Inheritance;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author akmal
 */
public class main {
    
    public static void main(String[] args) {
        
        // ini scanner
        Scanner scan = new Scanner (System.in);
        
        // membuat objek persegi
        Persegi persegi = new Persegi();
        // membuat objek segitiga
        Segitiga segitiga = new Segitiga();
        // membuat objek lingkaran
        Lingkaran lingkaran = new Lingkaran();
        
        
        String pilihan = JOptionPane.showInputDialog (null, """
                                                            Mau menghitung apa? 
                                                            1. persegi 
                                                            2. segitiga 
                                                            3. lingkaran""");
        
        
        if (pilihan.equalsIgnoreCase("1"))
        {
           // ini luas dan keliling persegi
            persegi.luas();
            persegi.keliling();
        System.out.println("||MENGHITUNG PERSEGI||");
        System.out.println("Masukkan sisi persegi = ");
        float sisi = scan.nextFloat();
        persegi.luas(sisi);
        persegi.keliling(sisi); 
        }
        
        else if (pilihan.equalsIgnoreCase("2"))
        {
          // ini luas dan keliling segitiga
            segitiga.luas();
            segitiga.keliling();
        System.out.println("||MENGHITUNG SEGITIGA||");
        System.out.println("Masukkan alas segitiga = ");
        float alas = scan.nextFloat();
        System.out.println("Masukkan tinggi segitiga = ");
        float tinggi = scan.nextFloat();
        segitiga.luas(alas, tinggi);
        segitiga.keliling(alas);  
        }
        
        else if (pilihan.equalsIgnoreCase("3"))
        {
           // ini luas dan keliling lingkaran
            lingkaran.luas();
            lingkaran.keliling();
        System.out.println("||MENGHITUNG LINGKARAN||");
        System.out.println("Masukkan jari-jari lingkaran = ");
        float r = scan.nextFloat();
        lingkaran.luas(r);
        lingkaran.keliling(r); 
        }
        
        else
        {
            System.out.println("tidak ada input yang kamu masukkan, ulangi lagi");
        }
        
    }
    
}
