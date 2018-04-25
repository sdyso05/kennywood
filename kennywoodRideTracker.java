/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1B_scope;
import java.util.Random;

/**
 *
 * @author sdyso05
 */

public class kennywoodRideTracker {
   
    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;
    
    // these are final variables to store height thresholds
    
    private static int MIN_HEIGHT_THEMERIDES = 36;
    private static int MIN_HEIGHT_THRILL_RIDES = 52;
    
    public static void rideBlackWidow (int riders, int avgHeight){
    if (avgHeight >= MIN_HEIGHT_THRILL_RIDES){
        System.out.println("Riding Black Widow!");
        System.out.println("I LOVE SPIDERS!!!");
        totalRiders = totalRiders + riders;
        Random rand = new Random();
        int numSickRiders = rand.nextInt(riders);
        totalSickRiders = totalSickRiders + numSickRiders;
    } else {
   System.out.println(riders + " were turned away for being too short");
   totalFailedRideAttempts = totalFailedRideAttempts + riders;
   
    } //end if/else
   } // close method

public static void rideMerryGoRound (int riders, int avgHeight) {
if (avgHeight >= MIN_HEIGHT_THEMERIDES){
        System.out.println("Riding Merry Go Round!");
        totalRiders = totalRiders + riders;
        Random rand = new Random();
        int numSickRiders = rand.nextInt(riders);
        totalSickRiders = totalSickRiders + numSickRiders;
    } else {
   System.out.println(riders + " were turned away for being too short");
   totalFailedRideAttempts = totalFailedRideAttempts + riders;   
   
    }// close if/else
} //close method

public static void main(String[] args){
    System.out.println("Beginning Ride Simulation");
    printRideStats();
    
    rideBlackWidow(16, 58);
    printRideStats();
    
    rideMerryGoRound(19, 51);
    printRideStats();
}

public static void printRideStats(){
    
    System.out.println("***RIDER STATS***");
    System.out.println("Total Riders: " + totalRiders);
    System.out.println("Total Riders Turned Away: " + totalFailedRideAttempts);
    System.out.println("Total Sick Riders: "+ totalSickRiders);
    System.out.println("*********************");
    
}
}