/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_praktikum9;

/**
 *
 * @author LENOVO
 */

abstract class Hewan{
    abstract void bersuara();
}

class Kucing extends Hewan{
    @Override
    void bersuara(){
        System.out.println("Meong");
    }
}

class Anjing extends Hewan{
    @Override
    void bersuara(){
        System.out.println("Guk Guk");
    }
}


public class TugasPraktikum9 {
        public static void main(String[] args) {
            Hewan kitty = new Kucing();
            Hewan puffy = new Anjing();
            
            
            System.out.println("Output Kucing(Kitty)");
            kitty.bersuara();
            System.out.println("");
            
            System.out.println("Output Anjing(Puffy)");
            puffy.bersuara();
    }
}
