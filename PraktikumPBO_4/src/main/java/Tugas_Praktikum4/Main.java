/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum4;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args){
        //membuat object dari kelas pekerja
        Pekerja karyawan = new Pekerja("Andi", 30, "Network Enginering", 12000000);
        
        //menampilkan data pekerja dengan toString
        System.out.println(karyawan.toString());
        System.out.println();
        
        //mengubah nama pekerja menggunakan setter
        karyawan.setNama("Andi, S.Kom.");
        System.out.println("Setelah nama diubah :");
        System.out.println(karyawan.toString());
        System.out.println();
        
        //percobaan akses langsung
        
        //1. akses atribut pekerjaan(public)
        System.out.println("Akses langsung pekerjaan (public):" + karyawan.pekerjaan);
        
        //2. akses atribut usia (protected)
        System.out.println("Akses langsung pekerjaan (public):" + karyawan.usia);
        
        //3. akses atribut nama dan gaji (private)
        System.out.println("Akses langsung nama(private):" + karyawan.getNama());
        System.out.println("Akses langsung gaji(private):" + karyawan.getGaji());
        
    }
}
