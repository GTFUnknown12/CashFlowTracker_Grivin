/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaporanKeuangan;

/**
 * Class untuk menyimpan detail transaksi dengan prinsip enkapsulasi.
 */
public class Transaction {
    // Atribut private (enkapsulasi)
    private String description;
    private double amount;

    /**
     * Constructor untuk Transaction.
     * @param description deskripsi transaksi, tidak boleh null atau kosong.
     * @param amount nilai transaksi, harus >= 0.
     */
    public Transaction(String description, double amount) {
        setDescription(description);
        setAmount(amount);
    }

    /**
     * Mendapatkan deskripsi transaksi.
     * @return deskripsi transaksi.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Mengatur deskripsi transaksi.
     * @param description deskripsi baru, tidak boleh null atau kosong.
     */
    public void setDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Deskripsi tidak boleh kosong");
        }
        this.description = description;
    }

    /**
     * Mendapatkan nilai transaksi.
     * @return jumlah transaksi.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Mengatur nilai transaksi.
     * @param amount nilai baru, harus >= 0.
     */
    public void setAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Jumlah transaksi tidak boleh negatif");
        }
        this.amount = amount;
    }

    /**
     * Menampilkan detail transaksi ke console.
     */
    public void displayTransaction() {
        System.out.println("Description: " + description + ", Amount: " + amount);
    }

    @Override
    public String toString() {
        return "Transaction{" +
               "description='" + description + '\'' +
               ", amount=" + amount +
               '}';
    }
}

