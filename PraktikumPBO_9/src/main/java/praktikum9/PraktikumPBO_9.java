/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum9;

/**
 *
 * @author LENOVO
 */



//deifinisi kelas abstrak

abstract class Kendaraan{
    //metode abstrak
    abstract void berjalan();
    
    //metode dengan implementasi 
    void info(){
        System.out.println("Ini adalah kendaraan");
    }
}

class Mobil extends Kendaraan{
    @Override
    void berjalan(){
        System.out.println("Mobil sedang berjalan dengan cepat");
    }
}

class Sepeda extends Kendaraan{
    @Override
    void berjalan(){
        System.out.println("Sepeda sedang berjalan dengan pelan");
    }
}








public class PraktikumPBO_9 {
   

    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
        
        //Kendaraan k = new Kendaraan();
    }
}
