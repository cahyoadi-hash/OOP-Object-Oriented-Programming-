/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum10;

/**
 *
 * @author LENOVO
 */



// Interface Pembayaran
interface Pembayaran {
    double hitungPajak(double harga);
}

// Kelas Elektronik
class Elektronik implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.10;
    }
}

// Kelas Makanan
class Makanan implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.05;
    }
}

// Kelas Utama (Main)
public class TugasPraktikum9 {
    public static void main(String[] args) {
        // Objek Elektronik
        Pembayaran laptop = new Elektronik();
        double hargaLaptop = 5000000;
        System.out.println("==Harga barang elektronik : Laptop==");
        System.out.println("Harga Elektronik: Rp" + hargaLaptop);
        System.out.println("Pajak Elektronik (10%): Rp" + laptop.hitungPajak(hargaLaptop));
        System.out.println("Harga setelah diskon : " + (hargaLaptop - laptop.hitungPajak(hargaLaptop)));

        System.out.println();

        // Objek Makanan
        Pembayaran roti = new Makanan();
        double hargaRoti = 20000;
        System.out.println("==Harga barang makanan : Roti==");
        System.out.println("Harga Makanan: Rp" + hargaRoti);
        System.out.println("Pajak Makanan (5%): Rp" + roti.hitungPajak(hargaRoti));
        System.out.println("Harga setelah diskon : " + (hargaRoti - roti.hitungPajak(hargaRoti)));
    }
}

