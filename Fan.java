//Kenneth Smith
//Module 1 
//8-12-2024

public class Fan {

    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    //Private Fields
    private int speed;
    private boolean fanStatus;
    private int radius;
    private String color;

    
    //Create Setter and Getter Methods for mutable fields
    public int getSpeed() {
        return speed;

    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean fanStatus() {
        return fanStatus;
    }
        
    public void setfanStatus(boolean fanStatus) {
        this.fanStatus = fanStatus;
    }


    public int getRadius(){ 
        return radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Fan Default Values
    public Fan() {
        this.speed = STOPPED;
        this.fanStatus = false;
        this.radius = 6;
        this.color = "white";
    }

    //Constructor with arguments
    public Fan(int speed, boolean fanStatus, int radius, String color) {
        this.speed = speed;
        this.fanStatus = fanStatus;
        this.radius = radius;
        this.color = color;
    }

    //toString Method to describe fans state
    @Override
    public String toString() {
        if (fanStatus) {
            return  "The fan is on." + "\nThe fan speed is " + speed + ". " + "The fan radius is " +
                    radius + "." + "\nThe fan color is " + color + ".";
        } else {
            return "\nThe fan is not on "  + "\nThe Radius is " + radius + "\nThe fan is " + color;
        }
    }

    //Creating two instances of the fan class to test the methods
    public static void main(String[] args) {
        //Using the Default Constructor
        Fan livingRoomFan = new Fan();
        System.out.println("Living room Fan: " + livingRoomFan.toString());

        Fan officeFan = new Fan(Fan.FAST, true, 10, "Orange");
        System.out.println("Office Fan: " + officeFan.toString());

        livingRoomFan.setfanStatus(true);
        livingRoomFan.setSpeed(SLOW);
        livingRoomFan.setRadius(9);
        livingRoomFan.setColor("Yellow");

        System.out.println("Change Living Room Fan to: " + "\n" + livingRoomFan.toString());
    
    }
}
    






