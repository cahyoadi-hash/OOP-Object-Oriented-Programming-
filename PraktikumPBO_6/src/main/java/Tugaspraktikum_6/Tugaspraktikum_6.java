/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspraktikum_6;

/**
 *
 * @author LENOVO
 */

//impor beberapa modul
import java.util.ArrayList;
import java.util.List;

//Kelas induk
class Produk{
    //atribut
    protected String nama;
    protected double harga;
    
    //konstruktor
    public Produk(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    //getter untuk nama
    public String getNama(){
         return nama;
    }
    
    //getter untuk harga
    public double getharga(){
        return harga;
    }
    
    //method diskon defaut
    public double diskon(){
        return 0.0;
    }
    
    //method untuk menentukan harga setelah diskon
    public double after_diskon(){
        return harga - diskon();
    }
}

//kelas turunan buku
class Buku extends Produk{
    public Buku(String nama, double harga){
        super(nama, harga);
    }
    
    //mengoverride metode diskon()
    @Override
    public double diskon(){
        return harga * 0.10;
    }
}

//kelas turunan elektronik
class Elektronik extends Produk{
    public Elektronik(String nama, double harga){
        super (nama, harga);
    }
    
    //mengoveride method diskon()
    @Override
    public double diskon(){
        return harga * 0.50;
    }
}

//kelas turunan pakaian
class Pakaian extends Produk{
    public Pakaian(String nama, double harga){
        super(nama, harga);
    }
    
    //mengoverride metode diskon()
    @Override
    public double diskon(){
        return harga * 0.40;
    }
}

//kelas keranjang (pengelola)
class Keranjang{
    //Deklarasi list
    private List<Produk> list;
    
    //konstruktor
    public Keranjang(){
        list = new ArrayList<>();
    }
    
    //metode menambahkan produk ke list
    public void tambah(Produk produk){
        list.add(produk);
    }
    
    //menghitung harga setelah diskon
    public double harga_after_diskon(){
        double total = 0;
        for (Produk produk :list){
            total += produk.after_diskon();
        }
        return total;
    }
    
    public void tampilkan(){
    System.out.println("--==Rincian Keranjang Belanja==--");
    
    for (Produk produk : list){
        System.out.println("Nama produk : "+ produk.getNama());
        System.out.println("Kategori : "+ produk.getClass().getSimpleName());
        System.out.println("Harga awal : "+ String.format("%,.2f", produk.getharga()));
        System.out.println("Diskon : "+ String.format("%,.2f",produk.diskon()));
        System.out.println("Harga akhir : "+ String.format("%,.2f", produk.after_diskon()));
        System.out.println("==============================");
       
    }
    System.out.println("TOTAL PEMBAYARAN : Rp " + String.format("%,.2f", harga_after_diskon()));
}

}

public class Tugaspraktikum_6 {
    public static void main(String[]args){
        Keranjang keranjang = new Keranjang();
        
        Produk buku1 = new Buku("buku gacor", 100000);
        Produk laptop = new Elektronik("laptop gacor", 15000000);
        Produk kemeja = new Pakaian("baju gacor", 200000);
        
        keranjang.tambah(buku1);
        keranjang.tambah(laptop);
        keranjang.tambah(kemeja);

        // Menampilkan hasil
        keranjang.tampilkan();
    }
}
