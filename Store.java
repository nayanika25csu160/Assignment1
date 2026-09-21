import java.util.ArrayList;
public class Store {
  private ArrayList<Item> items;
  public Store() {
        items = new ArrayList<>();
    }
    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added successfully!");
    }
    public void removeItem(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                items.remove(item);
                System.out.println("Item removed successfully!");
                return;
            }
        }
        System.out.println("Item with ID " + id + " not found.");
    }
    public void listItems() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("\n----- TechStore Inventory -----");
        for (Item item : items) {
            item.displayDetails();
            System.out.println("------------------------------");
        }
    }
    public void searchById(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                System.out.println("\nItem found:");
                item.displayDetails();
                return;
            }
        }
        System.out.println("Item not found.");
    }
    public void searchByName(String name) {
        boolean found = false;
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                item.displayDetails();
                System.out.println("------------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }
}
