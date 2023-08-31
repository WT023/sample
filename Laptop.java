public class Laptop {
    protected String name;
    protected int ScreenSize;

    public Laptop(String name, int ScreenSize) {
        this.name = name;
        this.ScreenSize = ScreenSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(int ScreenSize) {
        this.ScreenSize = ScreenSize;
    }

    @Override
    public String toString() {
        return "Laptop: " + name + "\n" + "Screen Size: " + ScreenSize;
    }

    public static void main(String[] args) {
        Laptop macbookAir = new MacbookAir(28, 2017);
        System.out.println(macbookAir);
    }
}

class MacbookAir extends Laptop {
    private boolean hasTouchID;

    public MacbookAir(int ScreenSize, int YearOfModel) {
        super("Macbook Air", ScreenSize);
        this.hasTouchID = YearOfModel >= 2018;
    }

    public boolean isHasTouchID() {
        return hasTouchID;
    }

    public void setHasTouchID(boolean hasTouchID) {
        this.hasTouchID = hasTouchID;
    }

    @Override
    public String toString() {
        return name + "\n" + "Screen Size: " + ScreenSize + "\n" + "Has Touch ID: " + hasTouchID;
    }

}
