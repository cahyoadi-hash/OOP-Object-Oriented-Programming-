/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author LENOVO
 */


public class main {
    public static void main(String[] args) {
        Kendaraan truck = new Kendaraan("hino dutro", 2020 ,"diesel");
        
        ////objcet dari class kendaraan
        System.out.println("OBJECT DARI CLASS KENDARAAN"); 
        System.out.println("");
        
        //menampilkan data trcuk sebelum diubah
        System.out.println("**Data Truck sebelum diubah");
         truck.tampilkan();
         
         //mengubah nama trcuk
         truck.setNama("volvo");
         System.out.println("");
         
         //menampilkan data truck setelah diubah
         System.out.println("**Data Truck Sesudah diubah");
         truck.tampilkan();
                  
         System.out.println("=====================================");
         System.out.println("");
         
         System.out.println("OBJECT DARI CLASS MOBIL");
         System.out.println("");
         Mobil honda = new Mobil("BMW", 1000, "mesin bensin",  2);
         honda.tampilkan2();
    }
    
    
}