/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaporanKeuangan;

/**
 * Class untuk melacak arus kas (cash flow) dengan prinsip enkapsulasi.
 */
public class CashFlowTracker {
    // Atribut private (enkapsulasi)
    private double totalPemasukan;
    private double totalPengeluaran;
    private double saldo;
    private String namaPemilik;
    private String mataUang;
    private String keterangan;
    private String namaPemasukan;
    private double nominalPemasukan;
    private String namaPengeluaran;
    private double nominalPengeluaran;

    /**
     * Constructor utama untuk inisialisasi pemilik dan mata uang.
     * @param namaPemilik Nama pemilik rekening.
     * @param mataUang Jenis mata uang (contoh: "IDR").
     */
    public CashFlowTracker(String namaPemilik, String mataUang) {
        this.namaPemilik = namaPemilik;
        this.mataUang = mataUang;
        this.totalPemasukan = 0.0;
        this.totalPengeluaran = 0.0;
        this.saldo = 0.0;
    }

    /**
     * Constructor tambahan untuk mencatat transaksi dengan detail.
     * @param namaPemasukan Nama kategori pemasukan.
     * @param nominalPemasukan Nominal pemasukan.
     * @param namaPengeluaran Nama kategori pengeluaran.
     * @param nominalPengeluaran Nominal pengeluaran.
     * @param keterangan Keterangan transaksi.
     */
    public CashFlowTracker(String namaPemasukan, double nominalPemasukan,
                            String namaPengeluaran, double nominalPengeluaran,
                            String keterangan) {
        this(); // Panggil default jika ada (jika diperlukan)
        this.namaPemasukan = namaPemasukan;
        this.nominalPemasukan = nominalPemasukan;
        this.namaPengeluaran = namaPengeluaran;
        this.nominalPengeluaran = nominalPengeluaran;
        this.keterangan = keterangan;
    }

    // Default constructor (opsional)
    private CashFlowTracker() {
        // Inisialisasi default
        this.totalPemasukan = 0.0;
        this.totalPengeluaran = 0.0;
        this.saldo = 0.0;
    }

    /**
     * Tambah transaksi baru.
     * @param deskripsi Deskripsi/transaksi.
     * @param jumlah Nominal.
     * @param adalahPemasukan True jika pemasukan, false jika pengeluaran.
     */
    public void tambahTransaksi(String deskripsi, double jumlah, boolean adalahPemasukan) {
        if (adalahPemasukan) {
            totalPemasukan += jumlah;
            saldo += jumlah;
        } else {
            totalPengeluaran += jumlah;
            saldo -= jumlah;
        }
        // Simpan detail transaksi jika perlu
    }

    public void tampilkanTransaksi() {
        // Logika menampilkan daftar transaksi
        System.out.println("Menampilkan semua transaksi...");
    }

    public void cariTransaksi(String kataKunci) {
        // Logika pencarian
        System.out.println("Mencari transaksi: " + kataKunci);
    }

    public void hapusTransaksi(int indeks) {
        // Logika penghapusan
        System.out.println("Menghapus transaksi indeks: " + indeks);
    }

    public void dapatkanLaporan() {
        System.out.println("--- Laporan Arus Kas ---");
        System.out.println("Pemilik       : " + namaPemilik);
        System.out.println("Total Pemasukan : " + totalPemasukan + " " + mataUang);
        System.out.println("Total Pengeluaran: " + totalPengeluaran + " " + mataUang);
        System.out.println("Saldo           : " + saldo + " " + mataUang);
    }

    // ----- Getters dan Setters -----
    public double getTotalPemasukan() {
        return totalPemasukan;
    }

    public double getTotalPengeluaran() {
        return totalPengeluaran;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getMataUang() {
        return mataUang;
    }

    public void setMataUang(String mataUang) {
        this.mataUang = mataUang;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getNamaPemasukan() {
        return namaPemasukan;
    }

    public void setNamaPemasukan(String namaPemasukan) {
        this.namaPemasukan = namaPemasukan;
    }

    public double getNominalPemasukan() {
        return nominalPemasukan;
    }

    public void setNominalPemasukan(double nominalPemasukan) {
        this.nominalPemasukan = nominalPemasukan;
    }

    public String getNamaPengeluaran() {
        return namaPengeluaran;
    }

    public void setNamaPengeluaran(String namaPengeluaran) {
        this.namaPengeluaran = namaPengeluaran;
    }

    public double getNominalPengeluaran() {
        return nominalPengeluaran;
    }

    public void setNominalPengeluaran(double nominalPengeluaran) {
        this.nominalPengeluaran = nominalPengeluaran;
    }
}
