/**
 * The Laptop class represents a laptop computer system, which includes a screen size
 * in addition to the standard CPU, RAM, and disk configurations. This class uses
 * composition instead of inheritance to include a Computer instance, promoting better
 * design practices and flexibility.
 *
 * Changes made:
 * 1. Removed inheritance from the Computer class and replaced it with composition.
 * 2. Added a private Computer instance to represent the core computer components.
 * 3. Initialized the Computer instance in constructors.
 * 4. Delegated getCPU, getRAM, and getDisk methods to the Computer instance.
 * 5. Updated the toString method to include Computer attributes from the Computer instance.
 *
 * @author Sydney Woods (Role 2: COnvert Desktop and laptop to use composition)
 * @author Grimm-mmirG (Role 8: Updating documentation for readability)
 * @version 1.0
 * @since March 04, 2025
 */

public class Laptop {
    
    // Composition: Laptop contains a Computer instance
    private final Computer computer; 

    // Screen size of the laptop
    private String screenSize;

    /**
    * No-argument constructor that initializes the Laptop with default values.
    * The Computer instance is initialized with empty strings for CPU, RAM, and disk,
    * and the screenSize is set to null.
    */
    public Laptop() {
        this.computer = new Computer("", "", ""); // Initialize with empty values
        this.screenSize = null;
    }

    /**
    * Constructor that initializes the Laptop with specified CPU, RAM, disk, and screenSize.
    *
    * @param CPU       The CPU configuration of the laptop.
    * @param RAM       The RAM configuration of the laptop.
    * @param disk      The disk configuration of the laptop.
    * @param screenSize The screen size of the laptop.
    */
    public Laptop(String CPU, String RAM, String disk, String screenSize) {
        this.computer = new Computer(CPU, RAM, disk); // Initialize Computer instance
        this.screenSize = screenSize;
    }

    /**
    * Sets the screen size of the laptop.
    *
    * @param screenSize The screen size to set.
    */
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    /**
    * Returns the screen size of the laptop.
    *
    * @return The screen size as a String.
    */
    public String getScreenSize() {
        return this.screenSize;
    }

    /**
    * Returns the CPU configuration of the laptop by delegating to the Computer instance.
    *
    * @return The CPU configuration as a String.
    */
    public String getCPU() {
        return this.computer.getCPU();
    }

    /**
    * Returns the RAM configuration of the laptop by delegating to the Computer instance.
    *
    * @return The RAM configuration as a String.
    */
    public String getRAM() {
        return this.computer.getRAM();
    }

    /**
    * Returns the disk configuration of the laptop by delegating to the Computer instance.
    *
    * @return The disk configuration as a String.
    */
    public String getDisk() {
        return this.computer.getDisk();
    }

    /**
    * Returns a string representation of the Laptop object.
    * This includes the CPU, RAM, disk, and screenSize configurations.
    *
    * @return A formatted string representation of the Laptop object.
    */
    public String toString() {
        return "Type:Laptop\tCPU:" + this.getCPU() + "\tRAM:" + this.getRAM() + "\tDisk:" + this.getDisk() + "\tScreen:" + this.screenSize;
    }
}