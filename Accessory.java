public class Accessory extends Item {
    private String compatibleWith;
    public Accessory(int id, String name, double price, String compatibleWith) {
        super(id, name, price);
        this.compatibleWith = compatibleWith;
    }
    public String getCompatibleWith() {
        return compatibleWith;
    }
    public void setCompatibleWith(String compatibleWith) {
        this.compatibleWith = compatibleWith;
    }
    public void displayDetails() {
        System.out.println("Type: Accessory");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: ₹" + getPrice());
        System.out.println("Compatible With: " + compatibleWith);
    }
}
