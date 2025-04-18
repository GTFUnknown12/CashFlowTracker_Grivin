/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaporanKeuangan;

public class Income extends Transaction {
    // Atribut private (enkapsulasi)
    private String source;

    /**
     * Constructor untuk objek Income.
     * @param description Deskripsi pemasukan, diwarisi dari Transaction.
     * @param amount Jumlah pemasukan, diwarisi dari Transaction.
     * @param source Sumber pemasukan, tidak boleh null atau kosong.
     */
    public Income(String description, double amount, String source) {
        super(description, amount);
        setSource(source); // menggunakan setter untuk validasi
    }

    /**
     * Mendapatkan sumber pemasukan.
     * @return sumber pemasukan.
     */
    public String getSource() {
        return source;
    }

    /**
     * Mengatur sumber pemasukan.
     * @param source sumber pemasukan, tidak boleh kosong.
     */
    public void setSource(String source) {
        if (source == null || source.trim().isEmpty()) {
            throw new IllegalArgumentException("Sumber pemasukan tidak boleh kosong");
        }
        this.source = source;
    }

    /**
     * Menampilkan detail pemasukan ke konsol.
     */
    @Override
    public void displayTransaction() {
        super.displayTransaction();
        System.out.println("Source: " + source);
    }

    @Override
    public String toString() {
        return super.toString() + ", Source='" + source + "'";
    }
}


