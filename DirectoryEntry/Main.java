package DirectoryEntry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DirectoryManager directoryManager = new DirectoryManager();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Print directory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Unique ID No.: ");
                    String uniqueId = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Telephone Number (with STD code if available): ");
                    String telephone = scanner.nextLine();
                    System.out.print("Enter Mobile Number: ");
                    String mobile = scanner.nextLine();
                    System.out.print("Enter Head of Family: ");
                    String headOfFamily = scanner.nextLine();
                    directoryManager.createEntry(uniqueId, name, address, telephone, mobile, headOfFamily);
                    break;
                    
                case 2:
                    System.out.print("Enter Unique ID No. of the entry you want to edit: ");
                    String idToEdit = scanner.nextLine();
                    System.out.print("Enter new Name (press Enter to keep existing value): ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new Address (press Enter to keep existing value): ");
                    String newAddress = scanner.nextLine();
                    System.out.print("Enter new Telephone Number (press Enter to keep existing value): ");
                    String newTelephone = scanner.nextLine();
                    System.out.print("Enter new Mobile Number (press Enter to keep existing value): ");
                    String newMobile = scanner.nextLine();
                    System.out.print("Enter new Head of Family (press Enter to keep existing value): ");
                    String newHeadOfFamily = scanner.nextLine();
                    directoryManager.editEntry(idToEdit, newName, newAddress, newTelephone, newMobile, newHeadOfFamily);
                    break;
                    
                case 3:
                    directoryManager.printDirectory();
                    break;
                    
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
