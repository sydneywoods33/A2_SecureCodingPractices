//Desktop computer: adds GPU type
// edited Feb 27 - Sydney Woods

// summary of changes made
// removed extends computer so desktop class no longer inherits --> use composition instead of inheritance
// added private computer instance to desktop class
// initialized computer instance in constructors
// getCPU, getRAM, getDisk methods now delegate to computer instance

public class Desktop {
    // Changed from inheritance to composition
    private final Computer computer; // Composition: Desktop contains a Computer instance
    private String GPUType;

    // No-arg constructor
    public Desktop() {
        this.computer = new Computer("", "", ""); // Initialize with empty values
        this.GPUType = null;
    }

    // Constructor that initializes all attributes
    public Desktop(String CPU, String RAM, String disk, String GPUType) {
        this.computer = new Computer(CPU, RAM, disk); // Initialize Computer instance
        this.GPUType = GPUType;
    }

    // Setter for GPUType
    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    // Getter for GPUType
    public String getGPUType() {
        return this.GPUType;
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
        return "Type:Desktop\tCPU:" + this.getCPU() + "\tRAM:" + this.getRAM() + "\tDisk:" + this.getDisk() + "\tGPU:" + this.GPUType;
    }
}