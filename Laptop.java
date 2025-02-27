//Laptop computer: adds screen size to other Computer info
// edited Feb 27 - Sydney Woods

// summary of changes made
// removed extends computer so laptop class no longer inherits --> use composition instead of inheritance
// added computer instance to laptop class
// initialized computer instance in constructors
// getCPU, getRAM, getDisk methods now delegate to computer instance
// update toString method to get Computer attributes from computer instance

public class Laptop {
    // Changed from inheritance to composition
    private final Computer computer; // Composition: Laptop contains a Computer instance
    private String screenSize;

    // No-arg constructor
    public Laptop() {
        this.computer = new Computer("", "", ""); // Initialize with empty values
        this.screenSize = null;
    }

    // Constructor that initializes all attributes
    public Laptop(String CPU, String RAM, String disk, String screenSize) {
        this.computer = new Computer(CPU, RAM, disk); // Initialize Computer instance
        this.screenSize = screenSize;
    }

    // Setter for screenSize
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    // Getter for screenSize
    public String getScreenSize() {
        return this.screenSize;
    }

    // Delegate getters to the Computer instance
    public String getCPU() {
        return this.computer.getCPU();
    }

    public String getRAM() {
        return this.computer.getRAM();
    }

    public String getDisk() {
        return this.computer.getDisk();
    }

    // Return formatted version of data
    public String toString() {
        return "Type:Laptop\tCPU:" + this.getCPU() + "\tRAM:" + this.getRAM() + "\tDisk:" + this.getDisk() + "\tScreen:" + this.screenSize;
    }
}