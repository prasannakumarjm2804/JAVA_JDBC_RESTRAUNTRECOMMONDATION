package com.prasana;

import java.util.Scanner;

public class mainmobile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        inventory inventory = new inventory();
        
        int choice;
        do {
            System.out.println("Welcome to Pk Mobiles");
            System.out.println("Login Details");
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            if ("Prasana".equals(username) && "2323".equals(password)) {
      
                handleAdminOperations(scanner, inventory);
            } else {
            
                handleClientOperations(inventory);
            }

            System.out.println("Would you like to log in again? (yes/no)");
            String response = scanner.nextLine();
            if (!"yes".equalsIgnoreCase(response)) {
                System.out.println("Exiting...");
                System.exit(0);
            }
        } while (true);
    }

    private static void handleAdminOperations(Scanner scanner, inventory inventory) {
        int choice;
        do {
            System.out.println("SUCCESSFULLY LOGGED IN TO ADMIN SERVER");
            System.out.println("OPTION:");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Show");
            System.out.println("6. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                	mobile cs=new mobile();
                	System.out.print("Enter brand : ");
                	cs.setBrand(scanner.nextLine());

                	scanner.nextLine();

                	System.out.print("Enter name: ");

                	cs.setModel(scanner.nextLine());

                	System.out.print("Enter price: ");

                	cs.setPrice(scanner.nextInt());

                	scanner.nextLine();

                	System.out.print("Enter milage: ");

                	cs.setMilage(scanner.nextInt());

                	scanner.nextLine();

                	inventory.add(cs);
                    break;
                case 2:
                    /*System.out.print("Enter the ID of mobile to remove: ");
                    String removeId = scanner.nextLine();
                    inventory.remove(removeId);*/
                	
                    break;
                case 3:
                    System.out.print("Enter the ID of mobile to update: ");
                    String updateId = scanner.nextLine();
                    inventory.update(updateId);
                    break;
                case 4:
                    System.out.print("Enter the ID of mobile to search: ");
                    String searchId = scanner.nextLine();
                    inventory.search(searchId);
                    break;
                case 5:
                    inventory.show();
                    break;
                case 6:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (true);
    }

    private static void handleClientOperations(inventory inventory) {
        inventory.show();
    }
}
