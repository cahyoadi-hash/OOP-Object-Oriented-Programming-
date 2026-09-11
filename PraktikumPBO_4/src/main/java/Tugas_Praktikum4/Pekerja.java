/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum4;

/**
 *
 * @author LENOVO
 */
public class Pekerja extends Manusia{
    //atribut tambahan dari class pekerja
    private double gaji;
    
    //constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    
    //getter dan setter untuk atribut gaji
    ///getter
    public double getGaji(){
        return gaji;
    }
    ///setter
    public void setGaji(double gaji){
        this.gaji=gaji;
    }
    
    //override metode toString() untuk menampilkan seluruh informasi pekerja
    @Override
    public String toString(){
        return "=== Informasi Pekerja ===" +
               "\nNama      : " + getNama() + // Menggunakan getNama() karena nama bersifat private di Manusia
               "\nUsia      : " + usia +      // Bisa diakses langsung karena usia bersifat protected
               "\nPekerjaan : " + pekerjaan + // Bisa diakses langsung karena pekerjaan bersifat public
               "\nGaji      : Rp " + gaji;
    }
}
