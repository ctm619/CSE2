//Caleb Mandile
//CSE2 Lab 2
//9-3-15



public class Cyclometer {
    public static void main (String[]args) {
       
        //declaring and assigning a value to each variable
        int time1 =  480;
        int rotations1 = 1561;
        int time2 = 3220;
        int rotations2 = 9037;
        double inchesDiameter = 27.0;
        
        // Output the time in minutes and the number of rotations for each trip.
        System.out.println("Trip 1 took " + (time1 / 60.0) + " minutes and had " + rotations1 + " counts.");
        System.out.println("Trip 2 took " + (time2 / 60.0) + " minutes and had " + rotations2 + " counts.");
        
        // distance of trip = roations times perimeter (pi * d) 
        // the result is in inches, so then convert to feet, and then to miles
        double distanceTrip1 = (1561*3.14159*inchesDiameter) / (12*5280);
        double distanceTrip2 = (9037*3.14159*inchesDiameter) / (12*5280);
        
        //Output distance for each trip in miles.
        System.out.println("Distance of trip 1: " + distanceTrip1 + " miles.");
        System.out.println("Distance of trip 2: " + distanceTrip2 + " miles.");
        
        System.out.println("Total distance of both trips combined: " + (distanceTrip2 + distanceTrip1) + " miles.");
        
        
        
        
        
        
        
        
    }
}