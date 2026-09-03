/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuugas_praktikum3;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[] args) {
        //menciptakan 2 objek
        mobil mobil1 = new mobil("toyota", "avanza", 2020, "hitam");
        mobil mobil2 = new mobil("honda", "civic", 2022, "merah");
        
        //menampilkan informasi dari method displayinfo
        System.out.println("==NFORMAASI AWAL MOBIL==");
        mobil1.displayinfo();
        mobil2.displayinfo();
    
    
    //method startengine
    System.out.println("==MENYALAKAN MESIN==");
    mobil1.startEngine();
    mobil2.startEngine();
    System.out.println();
    
    //Mrngubah warna
    System.out.println("==PROSES MENGUBAH WARNA==");
    System.out.println("Mengubah warna mobil 1 menjadi 'putih'...");
    mobil1.setWarna("Putih");
    System.out.println();
    
    //menampilkan informasi mobil terbaru
    System.out.println("==INFORMASI TERBARU SETELAH PERUBAHAN==");
    mobil1.displayinfo();
    }
}
