//imported java text class to use the decimal format to limit to two decimal places
import java.text.*;

public class Arithmetic {
    public static void main (String []args) { 
        //declaring all items and the price of each item, along with the sales tax %
        int socks = 3;
        double priceSocks = 2.58;
        int glasses = 6;
        double priceGlasses = 2.29;
        int envelopeBoxes = 1;
        double priceEnBoxes = 3.25;
        double tax = 0.06;
        //initializing decimal format, and setting it 2 decimal places with #.##
        DecimalFormat df = new DecimalFormat ("#.##");
        //printing out the item, the number of items being purchased, and the price per item
        System.out.println("Socks, 3 pairs, $2.58 per pair.");
        System.out.println("Drinking glasses, 6 glasses, $2.29 per glass.");
        System.out.println("Boxes of Envelopes, 1 box, $3.25 per box.");
        //Calculating and printing the tax on each sock
        double tSocks = tax * priceSocks;
        System.out.println("Tax on each sock: $" + df.format(tSocks));
        //Calculating and printing the tax on each glass
        double tGlass = tax * priceGlasses;
        System.out.println("Tax on each glass: $" + df.format(tGlass));
        //Calculating and printing the tax on each box of envelopes
        double tEn = tax * priceEnBoxes;
        System.out.println("Tax on each box of envelopes: $" + df.format(tEn));
        //Calculating and printing the total cost before tax of the socks, glasses, and envelopes
        double totalCost = (socks * priceSocks) + (glasses * priceGlasses) + (envelopeBoxes * priceEnBoxes);
        System.out.println("Total cost before tax: $" + df.format(totalCost));
        //Calculating and printing the total tax from the socks, glasses and envelopes
        double totalTax = (socks * tSocks) + (glasses * tGlass) + (envelopeBoxes * tEn);
        System.out.println("Total tax on purchase: $" + df.format(totalTax));
        //Calculating and printing the overall cost of the items plus the tax added to them 
        double Cost = totalTax + totalCost;
        System.out.println("Total cost plus tax: $" + df.format(Cost));
    }
}