/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuugas_praktikum3;

public class mobil {
    //1. membuat class mobil (private untuk enkapsulasi)
    private String merk;
    private String model;
    private int tahun;
    private String warna; // Atribut tambahan baru
    
    //2. constructor
    public mobil(String merk, String model, int tahun, String warna) {
            this.merk = merk;
            this.model=model;
            this.tahun=tahun;
            this.warna=warna;
    }
    
    //3. getter dan setter
    //-merk
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk=merk;
    }
    
    //-model
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model=model;
    }
    
    //-Tahun
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun=tahun;
    }
    
    //-warna
    public String getWarna() {
        return warna;
    }
     public void setWarna(String warna) {
        this.warna=warna;
    }
     
     //method StarteEngine
    public void startEngine(){
        System.out.println("Mesin mobil" + "menyala");  
    }
    //method displayinfo
    public void displayinfo(){
        System.out.println("Merk : " + merk);
        System.out.println("model : " + model);
        System.out.println("tahun : " + tahun);
        System.out.println("warna : " + warna);
        System.out.println("=================================");
    }
}
