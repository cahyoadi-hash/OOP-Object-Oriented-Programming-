/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_praktikum5;

/**
 *
 * @author LENOVO
 */


////KELOMPOK HEWAN
//kelas induk (hewan)
class Hewan {
    String nama;
    String jenis;
    
    public void info(){
        System.out.println("Nama hewan : " + nama);
        System.out.println("Jenis : " + jenis);
    }
    
}

//kelas turunan(kucing)
class Kucing extends Hewan{
    String suara = "meow";
    
    @Override
    public void info(){
        super.info();
        System.out.println("Suara khas : " + suara);
    }
}


//kelas turunan(anjing)
class Anjing extends Hewan{
    String suara = "gukguk";
    
    @Override
    public void info(){
        super.info();
        System.out.println("Suara khas : " + suara);
    }
    
    public void bersuara(){
        System.out.println(nama + "bersuara:" + suara);
    }
}







////KELOMPOKL KENDARAAN
//kelas induk pertanma (kendaraan)
class Kendaraan{
    String nama;
    int kecepatan;
    
    public void inpo(){
        System.out.println("Nama kendaraan : " + nama);
        System.out.println("Kecepatan maks : " + kecepatan);
    }
}


//kelas induk tingkat kedua (kendaraandarat)
class KendaraanDarat extends Kendaraan{
    int roda;
    
    @Override
    public void inpo(){
        super.inpo();
        System.out.println("Jumlah roda : " + roda);
    }
}
    
//kelas turuna mobil
class Mobil extends KendaraanDarat {
    int pintu;
    
    @Override
    public void inpo(){
        super.inpo();
        System.out.println("Jumlah pintu : " + pintu);
    }
}

//kelas turunan motor
class Motor extends KendaraanDarat{
    String mesin;
    
    @Override
    public void inpo(){
        super.inpo();
        System.out.println("Jenis mesin : " + mesin);
    }
}
    
    
    
    

////Kelas main
public class Main{
    public static void main(String[] args){
        System.out.println("--=KELOMPOK HEWAN=--");
        System.out.println("");
        
        System.out.println("=-Objek Kucing");
        Kucing kucing = new Kucing();
        kucing.nama = "oyen";
        kucing.jenis = "Anggora";
        kucing.info();
        
        System.out.println("");
        
        System.out.println("=-Objek Anjing");
        Anjing anjing = new Anjing();
        anjing.nama = "puffy";
        anjing.jenis = "buldog";
        anjing.info();
        System.out.println("");
        
        
        System.out.println("========================");
        System.out.println("");
        
        System.out.println("--=KELOMPOK KENDARAAN==-");
        System.out.println("");
        
        System.out.println("=-Objek mobil");
        Mobil mobil = new Mobil();
        mobil.nama = "Civic";
        mobil.kecepatan =200;
        mobil.pintu = 4;
        mobil.roda = 4;
        mobil.inpo();
        
        System.out.println("");
        
        System.out.println("=-Objek Motor");
        Motor motor = new Motor();
        motor.nama = "H2";
        motor.kecepatan = 200;
        motor.roda = 2;
        motor.mesin = "4 tak";
        motor.inpo();
    }
}