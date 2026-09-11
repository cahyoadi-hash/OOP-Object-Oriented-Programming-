/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author LENOVO
 */
public class Mobil extends Kendaraan {
    private final int pintu; //atribut tambahan khusus untuk jumlah pintu
    
    //constructor
    public Mobil(String nama, int kecepatan, String mesin, int pintu){
        super(nama, kecepatan, mesin);//memanggil constructor dari kelas induk
        this.pintu = pintu;
    }
    
    //method untuk menampilkan infomasi mobil
    public void tampilkan2(){
        // Menggunakan getNama() karena 'nama' bersifat private di kelas induk
        System.out.println("nama : " + getNama());
        
        //dapat mengakses kecepatan tanpa getter karena protected
        System.out.println("Kecepatan : " + kecepatan );
        //pintu dapat diakses tanpa gatter sebab atribut ini diakses didalam kelasnya yaitu 'mobil,
        System.out.println("jumlah pintu: " + pintu);
        System.out.println("jenis mesin: " + mesin);
    }
    
    
    
    
}   


