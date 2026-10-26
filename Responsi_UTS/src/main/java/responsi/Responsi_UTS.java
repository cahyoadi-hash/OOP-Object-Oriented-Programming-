/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package responsi;

/**
 *
 * @author LENOVO
 */

//kelas induk produk
class produk{
    //enskapsulasi
    private String namaProduk;
    private int harga;
    
    //getter dan setter untuk produk
    public String getnama() {
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk) { 
        this.namaProduk = namaProduk; 
    }
    
    //getter dan setter untuk harga
    public int getharga(){
        return harga;
    }
    public void setHarga(int harga) { 
        this.harga = harga; 
    }
    
    //metode tampilkaninfo
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}

//kelas elektronik (turunan dari produk)
class Elektronik extends produk{
    //atribut tambahan dalam tahun
    private int garansi;
    
    //getter dan setter untuk garansi
    public int getGaransi() { 
        return garansi; 
    }
    public void setGaransi(int garansi) {
        this.garansi = garansi; 
    }
    
    //mengoverride metode tampilkaninfo
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " tahun");
    }
}

//Kelas Makanan (Turunan dari Produk)
class Makanan extends produk {
    //menambahakn atribut tambahan
    private String tanggalKadaluarsa;

    //getter dan setter untuk tanggalKadaluarsa
    public String getKadaluarsa() { 
        return tanggalKadaluarsa; 
    }
    public void setKadaluarsa(String tanggalKadaluarsa) { 
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    //mengoverride metode tampilkaninfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}


//Kelas Induk produk
class Pegawai {
    //Enkapsulasi
    private String namaPegawai;
    private int gaji;

    //Getter dan Setter untuk namaPegawai
    public String getNamaPegawai() { 
        return namaPegawai; 
    }
    public void setNamaPegawai(String namaPegawai) { 
        this.namaPegawai = namaPegawai; 
    }

    //getter dan setter untuk gaji
    public int getGaji() { 
        return gaji; 
    }
    public void setGaji(int gaji) {
        this.gaji = gaji; 
    }

    //Metode tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + gaji);
    }
}

//Kelas Turunan PegawaiTetap (turunan dari pegawai)
class PegawaiTetap extends Pegawai {
    //Atribut tambahan 
    private int tunjangan;

    //getter dan setter untuk tunjangan
    public int getTunjangan() {
        return tunjangan; 
    }
    public void setTunjangan(int tunjangan) { 
        this.tunjangan = tunjangan; 
    }

    //Mengoverride metode tampilkaninfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
}

//Kelas Turunan Pegawai: PegawaiKontrak
class PegawaiKontrak extends Pegawai {
    //Atribut tambahan
    private int lamaKontrak;

    //getter dan setter untuk lamaKontrak
    public int getLamaKontrak() {
        return lamaKontrak; 
    }
    public void setLamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }

    //Mengoverride metode tampilkaninfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    }
}



public class Responsi_UTS {

    public static void main(String[] args) {
        //membuat objek dari kelas elektronik
        System.out.println("--===Output Produk==--");
        Elektronik laptop = new Elektronik();
        laptop.setNamaProduk("Laptop");
        laptop.setHarga(15000000);
        laptop.setGaransi(2);
        
        // Menggunakan referensi kelas induk produk
        produk refProduk1 = laptop; 
        refProduk1.tampilkanInfo();
        System.out.println();

        
        
        System.out.println("--==Output Pegawai==--");
        //Membuat objek dari kelas peagawaitetap
        PegawaiTetap pegawaiTetap = new PegawaiTetap();
        pegawaiTetap.setNamaPegawai("Cahyo"); 
        pegawaiTetap.setGaji(5000000);
        pegawaiTetap.setTunjangan(1000000);
        
        // Menggunakan referensi kelas induk pegawai
        Pegawai refPegawai1 = pegawaiTetap; 
        refPegawai1.tampilkanInfo();
        System.out.println();

        
        
        
        System.out.println("--==Output Polimorfisme==--");
        //Membuat objek dari kelas makanan
        Makanan snack = new Makanan();
        snack.setNamaProduk("Snack");
        snack.setHarga(15000);
        snack.setKadaluarsa("2023-12-30");
        // Menggunakan referensi kelas induk produk
        produk refProduk2 = snack;
        refProduk2.tampilkanInfo();
        
        System.out.println();
        //Membuat objek dari kelas pegawaikontrak
        PegawaiKontrak pegawaiKontrak = new PegawaiKontrak();
        pegawaiKontrak.setNamaPegawai("Andi");
        pegawaiKontrak.setGaji(3000000);
        pegawaiKontrak.setLamaKontrak(12);
        
        // Menggunakan referensi kelas induk pegawai
        Pegawai refPegawai2 = pegawaiKontrak;
        refPegawai2.tampilkanInfo();
    }
}
