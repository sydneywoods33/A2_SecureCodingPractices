//Computer class: manages computer CPU, RAM and Disk information
// edited Feb 27 - Sydney Woods


// summary of changes made
//marked attributes as final to make the class immutable
//removed the no-arg constructor to ensure all attributes are initialized
//removed setters to prevent modification of attributes after object creation
//added getters to access the attributes 


public class Computer {
    // Marked attributes as final to make the class immutable
    private final String CPU;
    private final String RAM;
    private final String disk;

    // Removed the no-arg constructor to ensure all attributes are initialized
    // public Computer() {} //No-arg constructor

    // Constructor that initializes all attributes
    public Computer(String CPU, String RAM, String disk) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.disk = disk;
    }

    // Removed setters to prevent modification of attributes after object creation
    // public void setCPU(String CPU) {
    //     this.CPU = CPU;
    // }

    // public void setRAM(String RAM) {
    //     this.RAM = RAM;
    // }

    // public void setDisk(String disk) {
    //     this.disk = disk;
    // }

    // Getters to access the attributes
    public String getCPU() {
        return this.CPU;
    }

    public String getRAM() {
        return this.RAM;
    }

    public String getDisk() {
        return this.disk;
    }
}