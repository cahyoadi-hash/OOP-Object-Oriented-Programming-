/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author LENOVO
 */
public class hewan {
    private String nama;
    private int umur;
    
    public hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    
    void suara() {
        System.out.println("Hewan bersuara");
        System.out.println("------------------------------");
        System.out.println();
    }
    
//    void info() {
//        System.out.println("INI METHOD INFO (BUKAN INPO)");
//        System.out.println("nama :"+ nama);
//        System.out.println("umur :"+ umur);
//        System.out.println("------------------------------");
//        System.out.println();
//        
//    }
    
    void inpo() {
        System.out.println("INI METHOD INPOO (BUKAN INFO)");
        System.out.println("Nama: " + getNama() + ", Umur: " + getUmur());
        System.out.println("------------------------------");
        System.out.println();
    }
    
    void berlari() {
        System.out.println("Hewan sedang berlari");
        System.out.println();
    }
}
