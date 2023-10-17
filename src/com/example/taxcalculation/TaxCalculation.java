package com.example.taxcalculation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculation {
    public static void main(String[] args) {
        double netPrice = 9.99;
        double VAT = 23;
        double netToGross = 1.0 + VAT * 0.01;
        double grossValue = netPrice * netToGross;
        double qty = 10_000;
        double grossIncome = qty * grossValue;
        double netIncome = grossIncome / netToGross;

        System.out.println("---------------------------------------------------");
        System.out.println("Using double type we implemented the following:");
        System.out.println("Product costs " + netPrice + " net");
        System.out.println("Its gross value is " + grossValue);
        System.out.println("(we assume VAT of " + VAT + "%");
        System.out.println("After we sold " + qty + " pcs of this product we got " + grossIncome + " of gross income");
        System.out.println("This value excluding VAT is " + netIncome);

        BigDecimal netPriceBD = BigDecimal.valueOf(9.99);
        BigDecimal VAT_BD = BigDecimal.valueOf(23);
        BigDecimal netToGrossBD = BigDecimal.valueOf(1.0).add(VAT_BD.multiply(BigDecimal.valueOf(0.01)));
        BigDecimal grossValueBD = netPriceBD.multiply(netToGrossBD);
        BigDecimal qtyBD = BigDecimal.valueOf(10_000);
        BigDecimal grossIncomeBD = qtyBD.multiply(grossValueBD);
        BigDecimal netIncomeBD = grossIncomeBD.divide(netToGrossBD, RoundingMode.DOWN);

        System.out.println("---------------------------------------------------");
        System.out.println("Using BigDecimal type we implemented the following:");
        System.out.println("Product costs " + netPriceBD + " net");
        System.out.println("Its gross value is " + grossValueBD);
        System.out.println("(we assume VAT of " + VAT_BD + "%");
        System.out.println("After we sold " + qtyBD + " pcs of this product we got " + grossIncomeBD + " of gross income");
        System.out.println("This value excluding VAT is " + netIncomeBD);
    }
}
