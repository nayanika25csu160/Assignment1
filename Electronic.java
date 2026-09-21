public class Electronic extends Item {
    private int warrantyYears;
    public Electronic(int id, String name, double price, int warrantyYears) {
        super(id, name, price);
        this.warrantyYears = warrantyYears;
    }
    public int getWarrantyYears() {
        return warrantyYears;
    }
    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }
    public void displayDetails() {
        System.out.println("Type: Electronic");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: ₹" + getPrice());
        System.out.println("Warranty: " + warrantyYears + " years");
    }
}
