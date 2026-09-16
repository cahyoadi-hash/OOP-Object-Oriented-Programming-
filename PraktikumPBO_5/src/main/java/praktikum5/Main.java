/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum5;

/**
 *
 * @author LENOVO
 */
//kelas induk
class Kendaraan {
    String nama;
    int kecepatan;
    
    public void info(){
        System.out.println("Nama kendaraan : " + nama);
        System.out.println("Kecepatan : " + kecepatan + "km/jam");
    }
}

//kelas turunan mobil
class Mobil extends Kendaraan {
    int pintu;
    
    @Override
    public void info(){
        super.info();
        System.out.println("Jumlah pintu : " + pintu);
    }
}

//kelas turunan motor
class Motor extends Kendaraan{
    String mesin;
    
    @Override
    public void info(){
        super.info();
        System.out.println("Jenis mesin : " + mesin);
    }
}


//kelas main
public class Main{
    public static void main(String[] args){
        //membuat objek dari kelas mobil
        System.out.println("==MOBIL==");
        Mobil mobil = new Mobil();
        mobil.nama = "toyota";
        mobil.kecepatan = 180;
        mobil.pintu = 4;
        mobil.info();
        System.out.println("");
        
        
        //membuat objek dari kelas mootor
        System.out.println("==MOTOR==");
        Motor motor = new Motor();
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.mesin = "2-tak";
        motor.info();
        
    }
}
