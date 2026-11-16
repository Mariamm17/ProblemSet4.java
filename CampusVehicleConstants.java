package edu.monmouth.campusvehicle;

// This class keeps all the constant values in one place.
public class CampusVehicleConstants {

    // Private constructor so nobody can make an object of this class.
    private CampusVehicleConstants() {
    	
    }

    // The number of valid locations.
    public static final int NUM_LOCATIONS = 6;
    
    // The list of locations that are allowed.
    public final static String[] VALID_LOCATIONS = {
        "University Bluffs",
        "Library",
        "Parking Lot",
        "Laurel Hall",
        "Spruce Hall",
        "Campus Police"
    };

    // Used when the location is not in the list above.
    public final static String UNKNOWN_LOCATION = "UNKNOWN";

    // Default values for the default constructor.
    public final static String DEFAULT_ID = "unknown";
    public final static boolean DEFAULT_AVAILABLE = true;
    public final static Color DEFAULT_COLOR = Color.BLACK;

    // Array sizes.
    public final static int MAX_VEHICLES = 10;
    public final static int INIT_ARRAY_SIZE = 5;
}
