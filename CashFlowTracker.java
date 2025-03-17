/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaporanKeuangan;

/**
 *
 * @author ASUS
 */
public class CashFlowTracker {
    // Attributes
    private double TotalPemasukan;
    private double saldo;
    private double TotalPengeluaran;
    private String NamaPemilik;
    private String MataUang;
    private String Keterangan; //atribut baru
    private String namaPemasukan; //atribut baru
    private String namaPengeluaran; // atribut baru
    private double nominalPemasukan; // atribut baru
    private double nominalPengeluaran; //atribut baru

    // Constructor
    public CashFlowTracker(String namaPemilik, String mataUang) {
        this.NamaPemilik = namaPemilik;
        this.MataUang = mataUang;
        this.TotalPemasukan = 0.0;
        this.TotalPengeluaran = 0.0;
        this.saldo = 0.0;
    }
    //Konstruktor baru
    public CashFlowTracker(String namaPemasukan, String namaPengeluaran, String Keterangan) {
        this.namaPemasukan = namaPemasukan;
        this.namaPengeluaran = namaPengeluaran;
        this.nominalPemasukan = 0.0;
        this.nominalPengeluaran = 0.0;
        this.Keterangan = Keterangan;
    }

    // Method to add a transaction
    public void tambahTransaksi(String deskripsi, double jumlah, boolean adalahPemasukan) {
        if (adalahPemasukan) {
            TotalPemasukan += jumlah;
            saldo += jumlah;
        } else {
            TotalPengeluaran += jumlah;
            saldo -= jumlah;
        }
        // Logic to store transaction details can be added here
    }

    // Method to display transactions
    public void tampilkanTransaksi() {
        // Logic to display transactions can be added here
        System.out.println("Menampilkan transaksi...");
    }

    // Method to search for a transaction
    public void cariTransaksi(String kataKunci) {
        // Logic to search for a transaction can be added here
        System.out.println("Mencari transaksi dengan kata kunci: " + kataKunci);
    }

    // Method to delete a transaction
    public void hapusTransaksi(int indek) {
        // Logic to delete a transaction can be added here
        System.out.println("Menghapus transaksi pada indeks: " + indek);
    }

    // Method to get a report
    public void dapatkanLaporan() {
        // Logic to generate a report can be added here
        System.out.println("Mendapatkan laporan...");
        System.out.println("Total Pemasukan: " + TotalPemasukan + " " + MataUang);
        System.out.println("Total Pengeluaran: " + TotalPengeluaran + " " + MataUang);
        System.out.println("Saldo: " + saldo + " " + MataUang);
    }
}

