/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaporanKeuangan;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek CashFlowTracker
        CashFlowTracker tracker = new CashFlowTracker("John Doe", "IDR");

        // Menambahkan beberapa transaksi
        tracker.tambahTransaksi("Gaji Bulan Ini", 5000, true);
        tracker.tambahTransaksi("Belanja Bulanan", 1500, false);
        tracker.tambahTransaksi("Bonus Proyek", 2000, true);
        tracker.tambahTransaksi("Tagihan Listrik", 300, false);

        // Menampilkan semua transaksi
        tracker.tampilkanTransaksi();

        // Mendapatkan laporan
        tracker.dapatkanLaporan();

        // Mencari transaksi
        tracker.cariTransaksi("Gaji");

        // Menghapus transaksi
        tracker.hapusTransaksi(1); // Menghapus transaksi kedua
        System.out.println("Setelah menghapus transaksi:");
        tracker.tampilkanTransaksi(); // Menampilkan transaksi setelah penghapusan
    }
}
