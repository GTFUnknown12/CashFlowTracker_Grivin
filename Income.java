/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaporanKeuangan;

/**
 *
 * @author ASUS
 */
public class Income extends Transaction {
    private String source;

    public Income(String description, double amount, String source) {
        super(description, amount); // Memanggil constructor dari Transaction
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    @Override
    public void displayTransaction() {
        super.displayTransaction(); // Memanggil method dari Transaction
        System.out.println("Source: " + source);
    }
}
