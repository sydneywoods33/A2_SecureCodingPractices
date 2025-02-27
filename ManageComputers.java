//Manage Computers program: maintains an ArrayList of Computer objects, 
//can be either Laptop or Desktop, but never just Computer-type objects themselves
// edited Feb 27 - Sydney Woods

//Role 5 implement whitelist-style input validation for desktop attributes
//the only acceptable inputs for CPU type are i5 and i7, RAM size are 16 and 32, disk size are 512 and 1024, 
//and GPU type are Nvidia and AMD
//Edited Feb 27 - Nguyen Ngoc Tam

//Role 6 implement whitelist-style input validation for laptop attributes
//the only acceptable inputs for CPU type are i5 and i7, RAM size are 16 and 32, disk size are 512 and 1024,
//and screen size are 13 and 14
//Edited Feb 28 - Maxwell Souchereau

// summary of changes made
// changed arraylist type to store object instead of computer to accommodate laptop and desktop
// changed the addComputer method to directly create laptop and desktop objects
// changed the showComputers method to call the overridden toString method for each object
// changed the editComputer method to replace the old object with a new one

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageComputers {

    public static void main(String args[]) {

        // Changed ArrayList type to store Laptop and Desktop instead of Computer
        ArrayList<Object> computers = new ArrayList<>(); // Use Object since Laptop & Desktop are no longer Computer

        

        Scanner s = new Scanner(System.in);
        String menuOption="";

        do { //Start of main program loop

            //Show computer data in ArrayList<Object>
            showComputers(computers); 

            //Display menu and return menu option selected by the user
            menuOption = getMenuSelection(s);

            switch(menuOption) {
                //Add new computer
                case "a": 

                    addComputer(computers,s);

                    break;

                //Delete a computer    
                case "d": 

                    deleteComputer(computers,s);

                    break;

                //Edit a computer    
                case "e": 

                    editComputer(computers, s);

                    break;

            }

        } while ( ! menuOption.equals("x") ); //Stop when "x" is entered

        s.close(); //Close keyboard scanner

    } //End of main

    //-----------------------------
    //Display menu and get user selection, return it
    private static String getMenuSelection(Scanner s) {
        String menuOption="";

        //Display menu options on-screen
        System.out.println("----------");
        System.out.println("A) Add Computer");
        System.out.println("D) Delete Computer");
        System.out.println("E) Edit Computer");
        System.out.println("X) eXit");
        System.out.println("----------");

        //Get menu selection from keyboard
        System.out.print("Enter menu selection:");
        menuOption = s.nextLine();

        menuOption = menuOption.toLowerCase(); //Make lower case for comparison purposes

        return menuOption;
    } //End of getMenuSelection

    //-----------------------------
    //Show data for all laptops and desktops stored in ArrayList<Object> created in main() method
    private static void showComputers(ArrayList<Object> computers) {
        int computerListNumber=0; //This variable is used to hold the "list number" for each computer, starting at 1.

        System.out.println("=========");

        System.out.println("LIST OF COMPUTERS:-");

        for (Object c: computers) {

            computerListNumber++; //Increment list number for each computer

            //Call overridden toString() method for current object to get and display its data
            System.out.println(computerListNumber + ": " + c.toString());
        }

        System.out.println("=========");

    } //End of showComputers

    //-----------------------------
    //Add a new Laptop or Desktop computer to the ArrayList<Object>
    private static void addComputer(ArrayList<Object> computers, Scanner s) {
        String computerType="";

        System.out.println("ADDING COMPUTER:-");

        System.out.println("Enter type of computer to add ('L' for Laptop, 'D' for Desktop):");
        computerType=s.nextLine();
        computerType=computerType.toLowerCase(); //Convert to lower case for comparison purposes

        //Role 5 - implement whitelist-style input validation for desktop attributes
        ArrayList<String> validCPU= new ArrayList<>();
        validCPU.add("i5");
        validCPU.add("i7");
        ArrayList<String> validRAM= new ArrayList<>();
        validRAM.add("16");
        validRAM.add("32");
        ArrayList<String> validDisk= new ArrayList<>();
        validDisk.add("512");
        validDisk.add("1024");
        ArrayList<String> validGPU= new ArrayList<>();
        validGPU.add("Nvidia");
        validGPU.add("AMD");
        
        //Role 6 - implement whitelist-style input validation for laptop attributes
        ArrayList<String> validScreenSize = new ArrayList<>();
        validScreenSize.add("13");
        validScreenSize.add("14");
        
        System.out.print("Enter CPU (i5/i7): ");
        String CPU = s.nextLine();
        while(!validCPU.contains(CPU)){
            System.out.println("Invalid CPU entered!");
            System.out.print("Enter CPU (i5/i7): ");
            CPU = s.nextLine();
        }
        
        System.out.print("Enter RAM (16/32): ");
        String RAM = s.nextLine();
        while(!validRAM.contains(RAM)){
            System.out.println("Invalid RAM entered!");
            System.out.print("Enter RAM (16/32): ");
            RAM = s.nextLine();
        }

        System.out.print("Enter Disk (512/1024): ");
        String disk = s.nextLine();
        while(!validDisk.contains(disk)){
            System.out.println("Invalid disk entered!");
            System.out.print("Enter disk (512/1024): ");
            disk = s.nextLine();
        }

        switch(computerType) {

            //Add a laptop
            case "l": 
                System.out.print("Enter screen size (13/14): ");
                String screenSize = s.nextLine();
                while(!validScreenSize.contains(screenSize)){
                    System.out.println("Invalid screen size entered!");
                    System.out.print("Enter screen size (13/14): ");
                    screenSize = s.nextLine();
                }
                computers.add(new Laptop(CPU, RAM, disk, screenSize)); // Directly create Laptop object
                break;
            
            //Add a desktop    
            case "d": 
                System.out.print("Enter GPU (Nvidia/AMD): ");
                String GPUType = s.nextLine();
                while(!validGPU.contains(GPUType)){
                    System.out.println("Invalid GPU entered!");
                    System.out.print("Enter GPU(Nvidia/AMD): ");
                    GPUType = s.nextLine();
                }
                computers.add(new Desktop(CPU, RAM, disk, GPUType)); // Directly create Desktop object
                break;

            //Invalid computer type to add entered
            default:
                System.out.println("Invalid computer type entered!");

        }
    } //End of addComputer

    //-----------------------------
    //Delete a specified computer from the ArrayList
    private static void deleteComputer(ArrayList<Object> computers, Scanner s) {
        int computerListNumberToDelete=0;

        System.out.println("DELETE COMPUTER:-");

        System.out.print("Enter number of computer to delete:");
        computerListNumberToDelete = Integer.parseInt(s.nextLine());

        //Check if computer list number is valid before deleting computer from list
        if (computerListNumberToDelete>=1 && computerListNumberToDelete<=computers.size()) {
            //Subtract 1 to get ArrayList index from on-screen list number to create correct index in ArrayList to delete
            computers.remove(computerListNumberToDelete-1); 
        }   
        else {
            System.out.println("Invalid computer number entered!");
        }

    } //End of deleteComputer

    //-----------------------------
    //Edit a computer. Since Laptop and Desktop are immutable classes/objects, get new data values and replace old
    //objects with new ones
    private static void editComputer(ArrayList<Object> computers, Scanner s) {
        int computerListNumberToEdit=0;

        System.out.println("EDIT COMPUTER:-");

        System.out.print("Enter number of computer to edit:");
        computerListNumberToEdit = Integer.parseInt(s.nextLine()) - 1;

        //Check that computerListNumberToEdit is valid first
        if (computerListNumberToEdit >= 0 && computerListNumberToEdit < computers.size()) {
            Object comp = computers.get(computerListNumberToEdit);
            if (comp instanceof Laptop) {
                System.out.println("Editing a Laptop:");
                System.out.print("Enter new screen size (13/14): ");
                String screenSize = s.nextLine();
                ArrayList<String> validScreenSize = new ArrayList<>();
                validScreenSize.add("13");
                validScreenSize.add("14");
                while(!validScreenSize.contains(screenSize)){
                    System.out.println("Invalid screen size entered!");
                    System.out.print("Enter screen size (13/14): ");
                    screenSize = s.nextLine();
                }
                computers.set(computerListNumberToEdit, new Laptop(((Laptop) comp).getCPU(), ((Laptop) comp).getRAM(), ((Laptop) comp).getDisk(), screenSize)); // Replace with new Laptop object
            } else if (comp instanceof Desktop) {
                System.out.println("Editing a Desktop:");
                System.out.print("Enter new GPU (Nvidia/AMD): ");
                String GPUType = s.nextLine();
                ArrayList<String> validGPU= new ArrayList<>();
                validGPU.add("Nvidia");
                validGPU.add("AMD");
                while(!validGPU.contains(GPUType)){
                    System.out.println("Invalid GPU entered!");
                    System.out.print("Enter GPU(Nvidia/AMD): ");
                    GPUType = s.nextLine();
                }
                computers.set(computerListNumberToEdit, new Desktop(((Desktop) comp).getCPU(), ((Desktop) comp).getRAM(), ((Desktop) comp).getDisk(), GPUType)); // Replace with new Desktop object
            }
        } else {
            System.out.println("Invalid computer number entered!");
        }
    } //End of editComputer

} //End of ManageComputer class