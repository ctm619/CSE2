import java.text.*;

public class Arithmetic {
    public static void main (String []args) { 
        int socks = 3;
        double priceSocks = 2.58;
        int glasses = 6;
        double priceGlasses = 2.29;
        int envelopeBoxes = 1;
        double priceEnBoxes = 3.25;
        double tax = 0.06;
        
        DecimalFormat df = new DecimalFormat ("#.##");
        
        System.out.println("Socks, 3 pairs, $2.58 per pair.");
        System.out.println("Drinking glasses, 6, $2.29 per glass.");
        System.out.println("Boxes of Envelopes, 1 box, $3.25 per box.");
        double tSocks = tax * priceSocks;
        System.out.println("Tax on each sock: $" + df.format(tSocks));
        double tGlass = tax * priceGlasses;
        System.out.println("Tax on each glass: $" + df.format(tGlass));
        double tEn = tax * priceEnBoxes;
        System.out.println("Tax on each box of envelopes: $" + df.format(tEn));
        double totalCost = (socks * priceSocks) + (glasses * priceGlasses) + (envelopeBoxes * priceEnBoxes);
        System.out.println("Total cost before tax: $" + df.format(totalCost));
        double totalTax = (socks * tSocks) + (glasses * tGlass) + (envelopeBoxes * tEn);
        System.out.println("Total tax on purchase: $" + df.format(totalTax));
        double Cost = totalTax + totalCost;
        System.out.println("Total cost plus tax: $" + df.format(Cost));
    }
}