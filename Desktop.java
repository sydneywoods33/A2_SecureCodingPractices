/**
 * The Desktop class represents a desktop computer system, which includes a GPU type
 * in addition to CPU, RAM, and disk configurations. This class uses
 * composition instead of inheritance to include a Computer instance, which allows for
 * better design practices and flexibility.
 *
 * Changes made:
 * 1. Removed inheritance from the Computer class and replaced it with composition.
 * 2. Added a private Computer instance to represent the core computer components.
 * 3. Initialized the Computer instance in constructors.
 * 4. Delegated getCPU, getRAM, and getDisk methods to the Computer instance.
 *
 * @author Sydney Woods (Role 2: COnvert Desktop and laptop to use composition)
 * @author Grimm-mmirG (Role 8: Updating documentation for readability)
 * @version 1.0
 * @since March 04, 2025
 */

public class Desktop {
    // Composition: Desktop contains a Computer instance
    private final Computer computer; 

    // GPU type for the desktop computer
    private final String GPUType;

    /**
     * No-argument constructor that initializes the Desktop with default values.
     * The Computer instance is initialized with empty strings for CPU, RAM, and disk,
     * and the GPUType is set to null.
     */
    public Desktop() {
        this.computer = new Computer("", "", ""); // Initialize with empty values
        this.GPUType = null;
    }

    /**
     * Constructor that initializes the Desktop with specified CPU, RAM, disk, and GPUType.
     *
     * @param CPU     The CPU configuration of the desktop computer.
     * @param RAM     The RAM configuration of the desktop computer.
     * @param disk    The disk configuration of the desktop computer.
     * @param GPUType The GPU type of the desktop computer.
     */
    public Desktop(String CPU, String RAM, String disk, String GPUType) {
        this.computer = new Computer(CPU, RAM, disk); // Initialize Computer instance
        this.GPUType = GPUType;
    }

    /**
     * Returns the GPU type of the desktop computer.
     *
     * @return The GPU type as a String.
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * Returns the CPU configuration of the desktop computer by delegating to the Computer instance.
     *
     * @return The CPU configuration as a String.
     */
    public String getCPU() {
        return this.computer.getCPU();
    }

    /**
     * Returns the RAM configuration of the desktop computer by delegating to the Computer instance.
     *
     * @return The RAM configuration as a String.
     */
    public String getRAM() {
        return this.computer.getRAM();
    }

    /**
     * Returns the disk configuration of the desktop computer by delegating to the Computer instance.
     *
     * @return The disk configuration as a String.
     */
    public String getDisk() {
        return this.computer.getDisk();
    }

    /**
     * Returns a string representation of the Desktop object.
     * This includes the CPU, RAM, disk, and GPUType configurations.
     *
     * @return A formatted string representation of the Desktop object.
     */
    public String toString() {
        return "Type:Desktop\tCPU:" + this.getCPU() + "\tRAM:" + this.getRAM() + "\tDisk:" + this.getDisk() + "\tGPU:" + this.GPUType;
    }
}