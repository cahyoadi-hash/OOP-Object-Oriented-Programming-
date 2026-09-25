/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikumpbo6;

/**
 *
 * @author LENOVO
 */

//Overloading
//kelas hewan (induk)
class hewan {
    public void bersuara(){
        System.out.println("hewan bersuara");
    }
    
    //metode makan pertama (hanya menerima satu atribut)
    public void makan(String makanan){
        System.out.println("hewan makan " + makanan);
    }
    
     //metode makan pertama ( menerima dua atribut)
    public void makan(String makanan, int jumlah){
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
}

//Overriding
//kelas kucing (turunan)
class Kucing extends hewan{
    @Override//meng override untuk mengedit method berusara()
    public void bersuara(){
        System.out.println("Meow");
    }
}
    
//kelas Anjing (turunan)
class Anjing extends hewan{
    @Override//meng override untuk mengedit method berusara()
    public void bersuara(){
        System.out.println("woof");
    }
}



public class PraktikumPBO_6 {
    public static void main(String[] args) {
        hewan kucing = new hewan();
        System.out.println("==OVERLOADING==");
        System.out.println("");
        System.out.println("--==Objek hewan (induk)==--");
                
        kucing.bersuara();
        kucing.makan("ikan");//method makan pertama
        kucing.makan("ikan", 2);//method makan kedua
                
        //objek overriding
        System.out.println("");
        System.out.println("==OVERRIDING==");
        System.out.println("");
        
        System.out.println("--==Objek kucing=--");
        Kucing katty = new Kucing();
        katty.bersuara();//method bersuara() setelah dioverride di kelas kucing
        katty.makan("ikan");
        katty.makan("ikan", 2);
        
        System.out.println("");
        System.out.println("--==Objek Anjing==--");
        Anjing puffy = new Anjing();
        puffy.bersuara();//method bersuara() setelah dioverride di kelas anjing
        puffy.makan("tulang", 3);
        
    }
}
