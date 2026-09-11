/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum4;

/**
 *
 * @author LENOVO
 */
public class Manusia {
    //atribut class manusia
    private String nama;
    protected int usia;
    public String pekerjaan;
    
    //constructor 
    public Manusia(String nama, int usia, String pekerjaan){
    this.nama = nama;
    this.usia = usia;
    this.pekerjaan = pekerjaan;
}
    
    //getter dan setter untuk atribut nama
    ///getter
    public String getNama(){
        return nama;
    }
    ///setter
    public void setNama(String nama){
        this.nama=nama;
    }
    
}
