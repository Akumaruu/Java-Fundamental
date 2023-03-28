/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author akmal
 */
public class Lingkaran extends BangunDatar {
    
        
    public float luas(float r)
    {
        float luas = 22/7 * r * r;
        
        System.out.println("Luas lingkaran = " + luas );
        
        return 0;
    }
    
    public float keliling(float r)
    {
        float keliling = 2 * 22/7 * r;
        
        System.out.println("Keliling lingkaran = " + keliling + "\n");
        
        return 0;
    }
    
    
}
