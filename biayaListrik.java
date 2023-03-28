
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

        
/**
 *
 * @author akmal
 */
public class biayaListrik {
    public static void main(String[] args) {

        String nama = JOptionPane.showInputDialog("Masukkan nama : ");
        
        String alamat = JOptionPane.showInputDialog("Masukkan Alamat : ");
        
        int golongan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan golongan 1/2/3 : "));
        
        if (golongan > 3){
            JOptionPane.showMessageDialog(null, "Kamu bukan termasuk golongan!!!");
            System.exit(0);
        }
        
        int penggunaan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pemakaian : "));
        
        int biayaPenggunaan = 0;
        
        int totalBiaya;
        
        int biayaAdministrasi = 13000;
        
        switch (golongan){
            case 1:
                biayaPenggunaan = 1000*penggunaan;
                break;
            case 2:
                biayaPenggunaan = 1300*penggunaan;
                break;
            case 3:
                biayaPenggunaan = 1500*penggunaan;
        
        }
        
        
        if (golongan == 1) {
            biayaPenggunaan = 1000*penggunaan * penggunaan;

        } else if (golongan == 2) {
            biayaPenggunaan = 1300*penggunaan * penggunaan;
            
        } else if (golongan == 3) {
            biayaPenggunaan = 1500*penggunaan* penggunaan;
        
        } else {
           JOptionPane.showMessageDialog(null, "Bukan termasuk golongan!!");
 
        }
        
        
        if (biayaPenggunaan < 50000){
            biayaPenggunaan = 50000;
            totalBiaya = biayaPenggunaan + biayaAdministrasi;
        } else {
            totalBiaya = biayaPenggunaan + biayaAdministrasi;
        }
        
        JOptionPane.showMessageDialog(null, "Nama : "+nama+"\nAlamat : "+alamat+"\nGolongan : "+golongan+"\nBiaya Penggunaan : "+biayaPenggunaan
                + "\nTotal biaya : "+totalBiaya);
    }
    }
    

