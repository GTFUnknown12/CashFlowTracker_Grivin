/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaporanKeuangan;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

public class CashFlowTracker {
    // Attributes
    private double totalPemasukan;
    private double saldo;
    private double totalPengeluaran;
    private String namaPemilik;
    private String mataUang;
    private List<Transaction> transactions; // Menyimpan daftar transaksi

    // Constructor
    public CashFlowTracker(String namaPemilik, String mataUang) {
        this.namaPemilik = namaPemilik;
        this.mataUang = mataUang;
        this.totalPemasukan = 0.0;
        this.totalPengeluaran = 0.0;
        this.saldo = 0.0;
        this.transactions = new ArrayList<>(); // Inisialisasi daftar transaksi
    }

    // Method to add a transaction
    public void tambahTransaksi(String deskripsi, double jumlah, boolean adalahPemasukan) {
        Transaction transaction;
        if (adalahPemasukan) {
            transaction = new Income(deskripsi, jumlah, "Sumber Pemasukan"); // Anda bisa menambahkan sumber yang sesuai
            totalPemasukan += jumlah;
            saldo += jumlah;
        } else {
            transaction = new Transaction(deskripsi, -jumlah); // Pengeluaran dianggap negatif
            totalPengeluaran += jumlah;
            saldo -= jumlah;
        }
        transactions.add(transaction); // Menyimpan transaksi
    }

    // Method to display transactions
    public void tampilkanTransaksi() {
        System.out.println("Daftar Transaksi:");
        for (Transaction transaction : transactions) {
            transaction.displayTransaction();
        }
    }

    // Method to search for a transaction
    public void cariTransaksi(String kataKunci) {
        System.out.println("Mencari transaksi dengan kata kunci: " + kataKunci);
        for (Transaction transaction : transactions) {
            if (transaction.getDescription().contains(kataKunci)) {
                transaction.displayTransaction();
            }
        }
    }

    // Method to delete a transaction
    public void hapusTransaksi(int indeks) {
        if (indeks >= 0 && indeks < transactions.size()) {
            transactions.remove(indeks);
            System.out.println("Transaksi pada indeks " + indeks + " telah dihapus.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    // Method to get a report
    public void dapatkanLaporan() {
        System.out.println("Mendapatkan laporan...");
        System.out.println("Total Pemasukan: " + totalPemasukan + " " + mataUang);
        System.out.println("Total Pengeluaran: " + totalPengeluaran + " " + mataUang);
        System.out.println("Saldo: " + saldo + " " + mataUang);
    }

    public static void main(String[] args) {
        CashFlowTracker tracker = new CashFlowTracker("John Doe", "IDR");

        // Menambahkan beberapa transaksi
        tracker.tambahTransaksi("Gaji Bulan Ini", 5000, true);
        tracker.tambahTransaksi("Belanja Bulanan", 1500, false);
        tracker.tambahTransaksi("Bonus Proyek", 2000, true);

        // Menampilkan semua transaksi
        tracker.tampilkanTransaksi();

        // Mendapatkan laporan
        tracker.dapatkanLaporan();

        // Mencari transaksi
        tracker.cariTransaksi("Gaji");

        // Menghapus transaksi
        tracker.hapusTransaksi(1); // Menghapus transaksi kedua
        tracker.tampilkanTransaksi(); // Menampilkan transaksi setelah penghapusan
    }
}
