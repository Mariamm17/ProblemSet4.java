package edu.monmouth.campusvehicle;

// A vehicle on campus.
public class CampusVehicle {

    // Fields
    private String id;
    private String location;
    private boolean available;
    private Color color;

    // Default constructor: uses the default values from the constants class.
    public CampusVehicle() {
        this.id = CampusVehicleConstants.DEFAULT_ID;
        this.location = CampusVehicleConstants.UNKNOWN_LOCATION;
        this.available = CampusVehicleConstants.DEFAULT_AVAILABLE;
        this.color = CampusVehicleConstants.DEFAULT_COLOR;
    }

    // Constructor with values. The location is checked by setLocation().
    public CampusVehicle(String id, String location, boolean available, Color color) {
        this.id = id;
        setLocation(location);
        this.available = available;
        this.color = color;
    }

    // Only saves the location if it is in the valid list.
    // If it is not in the list, the location becomes "UNKNOWN".
    public void setLocation(String location) {
        // Start by assuming the location is not valid.
        boolean isValid = false;

        // Look through the valid locations.
        for (int i = 0; i < CampusVehicleConstants.VALID_LOCATIONS.length; i++) {
            if (CampusVehicleConstants.VALID_LOCATIONS[i].equals(location)) {
                isValid = true;   // found a match
                break;            // stop looking
            }
        }

        // Save the location if it is valid. If not, use "UNKNOWN".
        if (isValid) {
            this.location = location;
        } else {
            this.location = CampusVehicleConstants.UNKNOWN_LOCATION;
        }
    }

 // Getters (return vehicle details).
    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public boolean isAvailable() {
        return available;
    }

    public Color getColor() {
        return color;
    }


    // Setters (update vehicle details).
    public void setId(String id) {
        this.id = id;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    // Formats the text shown when printing a vehicle.
    public String toString() {
        return "CampusVehicle [id=" + id
                + ", location=" + location
                + ", available=" + available
                + ", color=" + color + "]";
    }

}
