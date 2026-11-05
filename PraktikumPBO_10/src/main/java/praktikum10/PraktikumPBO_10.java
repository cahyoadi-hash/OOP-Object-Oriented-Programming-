/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author LENOVO
 */

// Interface
interface OperasiHitung{
    int hitung(int a, int b);
}

//Kelas Penjumlahan
class Penjumlahan implements OperasiHitung{
    @Override 
    public int hitung(int a, int b){
        return a + b;
    }
}

//Kelas pengurangan 
class Pengurangan implements OperasiHitung{
    @Override
    public int hitung(int a, int b){
        return a - b;
    }
}

public class PraktikumPBO_10 {

    public static void main(String[] args) {
        //Objek penjumlahan
        OperasiHitung jumlah = new Penjumlahan();
        System.out.println("Penjumlahan: : " + jumlah.hitung(10, 5));
        
        //Objek Pengurangan
        OperasiHitung kurang = new Pengurangan();
        System.out.println("Pengurangan :" + kurang.hitung(10, 5));
    }
}