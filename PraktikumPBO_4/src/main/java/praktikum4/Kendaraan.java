/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author LENOVO
 */
public class Kendaraan {
    //Atribut dengan akses modifier berbeda
    private String nama; //hanya bisa diakses dikelas ini
    protected int kecepatan; //bisa diakses di package yang sama dan subclass
    public String mesin; //bisa diakses dari mana saja
    
//constructor
    public Kendaraan(String nama, int kecepatan, String mesin){
        this.nama = nama;
        this.kecepatan = kecepatan;
        this.mesin = mesin;
    }
    
    //getter and setter for nama
    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    
    //method public untuk menampilkan informasi kendaraan
    public void tampilkan(){
        System.out.println("Nama kendaraan: " + nama);
        System.out.println("kecepatan kendaraan: " + kecepatan);
        System.out.println("Nama mesin : " + mesin);
    }
    
}