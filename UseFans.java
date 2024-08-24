//Kenneth Smith
//Module 2
//8-23-2024

public class UseFans {

    // Method to display details of an array of Fan objects
    public void displayFanArray(Fan[] fans) {
        for (int i = 0; i < fans.length; i++) {
            System.out.println("Fan #" + (i + 1) + " details:");
            displayFan(fans[i]);
            System.out.println(); //Create blank line for organization
            
        }
    }

    // Method to display single Fan details
    public void displayFan(Fan fan) {
        if (fan.fanStatus()) {
            System.out.println("Fan speed: " + fan.getSpeed() + ", color: " + fan.getColor() + ", radius: " + fan.getRadius());
        } else {
            System.out.println("Fan is off, color: " + fan.getColor() + ", radius: " + fan.getRadius());
        }
    }

    // Testing code
    public static void main(String[] args) {
        // Create an array of Fans
        Fan[] fans = new Fan[3];
        fans[0] = new Fan(Fan.FAST, true, 9, "black");
        fans[1] = new Fan(Fan.STOPPED, false, 2, "purple");
        fans[2] = new Fan(Fan.SLOW, true, 5, "white");

        // Create an instance of UseFans
        UseFans useFans = new UseFans();

        // Display the details of each Fan inside the array
        System.out.println("Fans:");
        System.out.println(); // Create blank line for organization
        useFans.displayFanArray(fans);
    }
}