package edu.monmouth.problemset4;

import edu.monmouth.campusvehicle.*;
import java.util.Arrays;

public class ProblemSet4 {
	public static void main(String[] args) {
		
		
		
		// declare an array of references to CampusVehicles
		// allocate memory to store 10 references to CampusVehicles
		
		// verify the Color values used here match yours
		
		// Given vehicle objects from the assignment starter code
		CampusVehicle campusVehicle1 = new CampusVehicle("mu1001ub", "University Bluffs", true, Color.BLACK);
		
		CampusVehicle campusVehicle2 = new CampusVehicle("mu1001lib", "Library", true, Color.GREEN);
		
		CampusVehicle campusVehicle3 = new CampusVehicle("mu1001pl", "Parking Lot", true, Color.BLUE);
		
		CampusVehicle campusVehicle4 = new CampusVehicle("mu1001lh", "Laurel Hall", true, Color.WHITE);
		
		CampusVehicle campusVehicle5 = new CampusVehicle("mu1001sh", "Spruce Hall", true, Color.BLACK);
		
		CampusVehicle campusVehicle6 = new CampusVehicle("mu1002lib", "Library", true, Color.YELLOW);
		
		CampusVehicle campusVehicle7 = new CampusVehicle("mu1002pl", "Parking Lot", true, Color.BLACK);
		
		CampusVehicle campusVehicle8 = new CampusVehicle("mu1002sh", "Spruce Hall", true, Color.BLUE);
		
		CampusVehicle campusVehicle9 = new CampusVehicle("mu101", "University Bluffs", true, Color.BLACK);
		
		CampusVehicle campusVehicle10 = new CampusVehicle("mu1003pl", "Campus Police", true, Color.BLACK);
		
		// Steps 4 & 5: Declare array using a constant for size and populate it
        CampusVehicle[] vehicles = new CampusVehicle[CampusVehicleConstants.MAX_VEHICLES];
        
        vehicles[0] = campusVehicle1;
        vehicles[1] = campusVehicle2;
        vehicles[2] = campusVehicle3;
        vehicles[3] = campusVehicle4;
        vehicles[4] = campusVehicle5;
        vehicles[5] = campusVehicle6;
        vehicles[6] = campusVehicle7;
        vehicles[7] = campusVehicle8;
        vehicles[8] = campusVehicle9;
        vehicles[9] = campusVehicle10;
        
        // Step 6: Loop through the array and print each vehicle's attributes
        System.out.println("--- All Vehicles ---");
        
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
        
        // Step 7: Print vehicles located at "Library"
        System.out.println("\n--- Vehicles at Library ---");
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getLocation().equals("Library")) {
                System.out.println(vehicles[i]);
            }
        }
        
        // Step 8: Print available vehicles
        System.out.println("\n--- Available Vehicles ---");
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].isAvailable()) {
                System.out.println(vehicles[i]);
            }
        }
        
        // Step 9: Set any 4 vehicles' availability to false
        vehicles[0].setAvailable(false);
        vehicles[2].setAvailable(false);
        vehicles[4].setAvailable(false);
        vehicles[6].setAvailable(false);
        
        // Step 10: Print available vehicles after the update
        System.out.println("\n--- Available Vehicles After Update ---");
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].isAvailable()) {
                System.out.println(vehicles[i]);
            }
        }
        
        // Step 11: Count how many vehicles are at "University Bluffs"
        int ubCount = 0;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getLocation().equals("University Bluffs")) {
                ubCount++;
            }
        }
        
        // Step 12: Create another array sized to store just the University Bluffs vehicles
        CampusVehicle[] universityBluffsVehicles = new CampusVehicle[ubCount];
        
        // Step 13: Copy University Bluffs vehicles into the new array
        int index = 0;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getLocation().equals("University Bluffs")) {
                universityBluffsVehicles[index] = vehicles[i];
                index++;
            }
        }
        
        // Step 14: Print the number of elements using the array attribute (.length)
        System.out.println("\nNumber of elements in universityBluffsVehicles: " + universityBluffsVehicles.length);
        
        // Step 15: Loop through and print attributes of the new array
        System.out.println("\n--- University Bluffs Array Elements ---");
        for (int i = 0; i < universityBluffsVehicles.length; i++) {
            System.out.println(universityBluffsVehicles[i]);
        }
        
        // Step 16: Declare array of size 5 and populate using Arrays.fill()
        CampusVehicle[] initArray = new CampusVehicle[CampusVehicleConstants.INIT_ARRAY_SIZE];
        CampusVehicle initializeVehicle = new CampusVehicle();
        Arrays.fill(initArray, initializeVehicle);
        
        // Step 17: Loop through initArray and print attributes
        System.out.println("\n--- Init Array Elements ---");
        for (int i = 0; i < initArray.length; i++) {
            System.out.println(initArray[i]);
        }
	}

}
