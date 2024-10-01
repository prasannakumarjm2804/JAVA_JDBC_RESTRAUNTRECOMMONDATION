package ex5;
import java.util.Scanner;
public class maincls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
        int choice;
        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add");
            System.out.println("2. Update");
            System.out.println("3. Remove");
            System.out.println("4. Search(ID)");
            System.out.println("5. Show");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
             switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter name of product: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter price of Product: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); 
                    product newProduct = new product(productId, productName, price);
                    inventory.addProduct(newProduct);
                    System.out.println("Succesfully added Product");
                    break;
                case 2:
                    System.out.print("index of product to update (0-" + (inventory.getProducts().size() - 1) + "): ");
                    int indexToUpdate = scanner.nextInt();

                    scanner.nextLine(); 

                    if (indexToUpdate >= 0 && indexToUpdate < inventory.getProducts().size()) {

                        System.out.print("Enter product name: ");

                        String updatedProductName = scanner.nextLine();

                        System.out.print("Enter new product price: ");

                        double updatedPrice = scanner.nextDouble();
                        scanner.nextLine(); 
                        product updatedProduct = new product(
                       inventory.getProducts().get(indexToUpdate).getProductId(),
                        updatedProductName,
                        updatedPrice
                        );
                        inventory.updateProduct(indexToUpdate, updatedProduct);
                        System.out.println("updated successfully.");
                    } else {
                        System.out.println("Invalid index. No product updated.");
                    }
                    break;
                case 3:
                    System.out.print("Enter index of product to remove (0-" + (inventory.getProducts().size() - 1) + "): ");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine();
                    inventory.removeProduct(indexToRemove);
                    break;
                case 4:
                    System.out.print("Enter product ID to search: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();
                    product foundProduct = inventory.findProductById(searchId);
                    if (foundProduct != null) {
                        System.out.println("Product found:");
                        System.out.println(foundProduct);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 5:
                    System.out.println("All products in inventory:");
                    inventory.showAllProducts();
                    break;
                case 6:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid .Please enter a number.");
            }
        } while (choice != 6);
        scanner.close();

    }

}