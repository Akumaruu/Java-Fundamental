/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bintang;

import java.util.Scanner;

/**
 *
 * @author akmal
 */
public class suhuBadan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("masukkan suhu tubuh : ");
        int suhu = scan.nextInt();
        
        if (suhu > 37){
            
            System.out.println("masukkan kondisi (batuk/tidak) : ");
            String batuk = scan.next(); 
            
            if (batuk.equalsIgnoreCase("batuk")){
                System.out.println("ayang : kamu jangan masuk dulu yaa");
            } else if (batuk.equalsIgnoreCase("tidak")){
                System.out.println("ayang : tetap jaga kesehatan ya jangan lupa !");
            }
            
        } else if (suhu < 37 ){
            
            System.out.println("masukkan kondisi (batuk/tidak) : ");
            String batuk = scan.next();
             
             if (batuk.equalsIgnoreCase("batuk") || batuk.equalsIgnoreCase("tidak")){
                 System.out.println("ayang : kamu periksa dulu aja yaa");
             }
        }
                
    }
    
}
