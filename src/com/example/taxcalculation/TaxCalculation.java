package com.example.taxcalculation;

public class TaxCalculation {
    public static void main(String[] args) {
        double netPrice = 9.99;
        double VAT = 23;
        double netToGross = 1.0 + VAT * 0.01;
        double grossValue = netPrice * netToGross;
        double qty = 10_000;
        double grossIncome = qty * grossValue;
        double netIncome = grossIncome / netToGross;

        System.out.println("Using double type we implemented the following:");
        System.out.println("Product costs " + netPrice + " net");
        System.out.println("Its gross value is " + grossValue);
        System.out.println("(we assume VAT of " + VAT + "%");
        System.out.println("After we sold " + qty + " pcs of this product we got " + grossIncome + " of gross income");
        System.out.println("This value excluding VAT is " + netIncome);
    }
}
