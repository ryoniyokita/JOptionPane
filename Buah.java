/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buah;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Buah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[]buah = new String[4];
        
        buah[0] = JOptionPane.showInputDialog("Masukan Nama buah :");
        buah[1] = JOptionPane.showInputDialog("Masukan Nama buah :");
        buah[2] = JOptionPane.showInputDialog("Masukan Nama buah :");
        buah[3] = JOptionPane.showInputDialog("Masukan Nama buah :");
        
        System.out.println("Menampilkan Nama Buah  : ");
        System.out.println(buah[0]);
        System.out.println(buah[1]);
        System.out.println(buah[2]);
        System.out.println(buah[3]);
        
    }
    
}
