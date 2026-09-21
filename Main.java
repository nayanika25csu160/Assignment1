import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();
        store.addItem(new Electronic(101, "Laptop", 65000, 2));
        store.addItem(new Electronic(102, "Smartphone", 30000, 1));
        store.addItem(new Accessory(103, "Wireless Mouse", 1200, "Laptop"));
        store.addItem(new Accessory(104, "USB Cable", 500, "Laptop and Smartphone"));
        int choice;
        do {
            System.out.println("\n===== TECHSTORE INVENTORY =====");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. List Items");
            System.out.println("4. Search Item by ID");
            System.out.println("5. Search Item by Name");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        addNewItem(scanner, store);
                        break;
                    case 2:
                        System.out.print("Enter item ID to remove: ");
                        int removeId = scanner.nextInt();
                        scanner.nextLine();
                        store.removeItem(removeId);
                        break;
                    case 3:
                        store.listItems();
                        break;
                    case 4:
                        System.out.print("Enter item ID to search: ");
                        int searchId = scanner.nextInt();
                        scanner.nextLine();
                        store.searchById(searchId);
                        break;
                    case 5:
                        System.out.print("Enter item name to search: ");
                        String searchName = scanner.nextLine();
                        store.searchByName(searchName);
                        break;
                    case 6:
                        System.out.println("Thank you for using TechStore!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter the correct value.");
                scanner.nextLine();
                choice = 0;
            }
        } while (choice != 6);
        scanner.close();
    }
    public static void addNewItem(Scanner scanner, Store store) {
        try {
            System.out.print("Enter item ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter item name: ");
            String name = scanner.nextLine();

            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            System.out.println("\nChoose item type:");
            System.out.println("1. Electronic");
            System.out.println("2. Accessory");
            System.out.print("Enter choice: ");

            int type = scanner.nextInt();
            scanner.nextLine();

            if (type == 1) {

                System.out.print("Enter warranty years: ");
                int warranty = scanner.nextInt();
                scanner.nextLine();

                Electronic electronic =
                        new Electronic(id, name, price, warranty);

                store.addItem(electronic);

            } else if (type == 2) {

                System.out.print("Compatible with: ");
                String compatibleWith = scanner.nextLine();

                Accessory accessory =
                        new Accessory(id, name, price, compatibleWith);

                store.addItem(accessory);

            } else {

                System.out.println("Invalid item type.");
            }

        } catch (Exception e) {

            System.out.println("Invalid input. Item was not added.");
            scanner.nextLine();
        }
    }
}
