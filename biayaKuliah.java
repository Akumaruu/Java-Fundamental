
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akmal
 */
public class biayaKuliah {
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("Masukkan ID : ");
        String nama = JOptionPane.showInputDialog("Masukkan Nama : ");
        String jalur = JOptionPane.showInputDialog("Masukkan jalur (SBMPTN/SNMPTN/MANDIRI) : ");
        String alamat = JOptionPane.showInputDialog("Masukkan alamat : ");                
        int pendapatan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan pendapatanmu : "));
        String dataKuliah = "CONFIRMED ID "+id+"\nNama : "+nama+"\nJalur : "+jalur+"\nAlamat : "+alamat;
        
        if (jalur.equalsIgnoreCase("sbmptn")){
            if (pendapatan<2_000_000){
                int dsp = 5_000_000;
                int spp = 500_000;
                long total = dsp + spp;
                JOptionPane.showMessageDialog(null, dataKuliah+"\nTotal biaya kuliah adalah Rp."+total);
            }
            else if (pendapatan>2_000_000 && pendapatan<11_000_000){
                int dsp = 15_000_000;
                int spp = 1_000_000;
                long total = dsp + spp;
                JOptionPane.showMessageDialog(null, dataKuliah+"\nTotal biaya kuliah adalah Rp."+total);
            }
            else if (pendapatan>10_000_000){
                int dsp = 30_000_000;
                int spp = 2_000_000;
                long total = dsp + spp;
                JOptionPane.showMessageDialog(null, dataKuliah+"\nTotal biaya kuliah adalah Rp."+total);
                
            }
            
        }
        if (jalur.equalsIgnoreCase("snmptn")){
            if (pendapatan<2_000_000){
                int dsp = 7_000_000;
                int spp = 500_000;
                long total = dsp + spp;
                JOptionPane.showMessageDialog(null, dataKuliah+"\nTotal biaya kuliah adalah Rp."+total);
            }
            else if (pendapatan>2_000_000 && pendapatan<11_000_000){
                int dsp = 17_000_000;
                int spp = 1_000_000;
                long total = dsp + spp;
                JOptionPane.showMessageDialog(null, dataKuliah+"\nTotal biaya kuliah adalah Rp."+total);
            }
            else if (pendapatan>10_000_000){
                int dsp = 35_000_000;
                int spp = 2_000_000;
                long total = dsp + spp;
                JOptionPane.showMessageDialog(null, dataKuliah+"\nTotal biaya kuliah adalah Rp."+total);
            }
        }
        if (jalur.equalsIgnoreCase("mandiri")){
            if (pendapatan<2_000_000){
                int dsp = 10_000_000;
                int spp = 1_000_000;
                long total = dsp + spp;
                JOptionPane.showMessageDialog(null, dataKuliah+"\nTotal biaya kuliah adalah Rp."+total);
            }
            else if (pendapatan>2_000_000 && pendapatan<11_000_000){
                int dsp = 25_000_000;
                int spp = 2_000_000;
                long total = dsp + spp;
                JOptionPane.showMessageDialog(null, dataKuliah+"\nTotal biaya kuliah adalah Rp."+total);
            }
            else if (pendapatan>10_000_000){
                int dsp = 50_000_000;
                int spp = 3_000_000;
                long total = dsp + spp;
                JOptionPane.showMessageDialog(null, dataKuliah+"\nTotal biaya kuliah adalah Rp."+total);
            }
        }
   }
}  
