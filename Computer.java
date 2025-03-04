/**
 * The Computer class represents a computer system with specific CPU, RAM, and disk configurations.
 * This class is designed to be immutable, meaning once an instance is created, its attributes
 * cannot be modified. This ensures thread safety and consistency in the object's state.
 *
 * Changes made:
 * 1. Marked attributes as final to enforce immutability.
 * 2. Removed the no-argument constructor to ensure all attributes are initialized during object creation.
 * 3. Removed setter methods to prevent modification of attributes after object creation.
 * 4. Added getter methods to provide read-only access to the attributes.
 *
 * @author Sydney Woods (Role 2: COnvert Desktop and laptop to use composition)
 * @author Grimm-mmirG (Role 8: Updating documentation for readability)
 * @version 1.0
 * @since March 04, 2025
 */

public class Computer {

    // Attributes marked as final to enforce immutability
    private final String CPU;
    private final String RAM;
    private final String disk;

     /**
     * Constructs a new Computer instance with the specified CPU, RAM, and disk configurations.
     *
     * @param CPU  The CPU configuration of the computer.
     * @param RAM  The RAM configuration of the computer.
     * @param disk The disk configuration of the computer.
     */
    public Computer(String CPU, String RAM, String disk) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.disk = disk;
    }

    /**
     * Returns the CPU configuration of the computer.
     *
     * @return The CPU configuration as a String.
     */
    public String getCPU() {
        return this.CPU;
    }

    /**
     * Returns the RAM configuration of the computer.
     *
     * @return The RAM configuration as a String.
     */
    public String getRAM() {
        return this.RAM;
    }

    /**
     * Returns the disk configuration of the computer.
     *
     * @return The disk configuration as a String.
     */
    public String getDisk() {
        return this.disk;
    }
}

    // The following code is the Removed setters 
    // public void setCPU(String CPU) {
    //     this.CPU = CPU;
    // }

    // public void setRAM(String RAM) {
    //     this.RAM = RAM;
    // }

    // public void setDisk(String disk) {
    //     this.disk = disk;
    // }