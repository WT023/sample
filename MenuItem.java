import java.util.ArrayList;

public class MenuItem {
    private String name;
    private String category;
    private double price;

    public MenuItem(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double price() {
        return price;
    }

    public void setName(String NewName) {
        this.name = NewName;
        // call this method when u wan to change the name
    }

    @Override
    public String toString() {
        return "\n    Category: " + category + "  " + "Name: " + name + "  " + "Price: " + price + "\n";
    }

    public static void main(String[] args) {
        MenuItem BeefBurger = new BeefMenuItem();
        System.out.println(BeefBurger);

        MenuItem ChickenBurger = new ChickenMenuItem();
        ChickenBurger.setName("yummy burger");
        System.out.println(ChickenBurger);

        Order orders = new Order();
        orders.addItem(new ChickenMenuItem());
        orders.addItem(new BeefMenuItem());
        System.out.println(orders);
    }
}

class BeefMenuItem extends MenuItem {

    public BeefMenuItem() {
        super("Beef Burger", "Main Course", 10.99);
    }
}

class ChickenMenuItem extends MenuItem {

    public ChickenMenuItem() {
        super("Chicken Nuggets", "Side Dish", 6.99);
    }

}

class Order {
    private ArrayList<MenuItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    void addItem(MenuItem item) {
        items.add(item);
    }

    @Override
    public String toString() {
        String s = "Your order ------------\n";
        for (MenuItem item : items) {
            s += "    Ordered item: " + "\n" + item + "\n";
        }
        return s;

    }
}
