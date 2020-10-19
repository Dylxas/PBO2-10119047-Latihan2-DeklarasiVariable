/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan2.deklarasivariabel;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MEMASUKKAN VARIABLE
 */
public class PBOIF210119047Latihan2DeklarasiVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // deklarasi variabel
        int nilaiInt;
        final double PHI = 3.14; //Konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
       
        //menampilkan variabel
        System.out.println();
        System.out.println("Isi variable nilai = " + nilaiInt);
        System.out.println("Isi variable PHI = " + PHI);
        System.out.println("Isi variable Logika = " + nilaiLogika);
        System.out.println("Isi variable Karakter = " + nilaiKarakter);
    }
    
}
