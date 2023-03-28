/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author akmal
 */
public class Segitiga extends BangunDatar{
    
    public float luas(float alas, float tinggi)
    {
        float luas = alas * tinggi / 2;
        
        System.out.println("Luas segitiga = " + luas );
        
        return 0;
    }
    
    public float keliling(float alas)
    {
        float keliling = 3 * alas;
        
        System.out.println("Keliling segitiga = " + keliling + "\n");
        
        return 0;
    }
    
}
