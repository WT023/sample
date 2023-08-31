public class Hotel {
    private int roomNumber;
    private String bedType;
    private double price;

    public Hotel(int roomNumber, String bedType, double price) {
        this.roomNumber = roomNumber;
        this.bedType = bedType;
        this.price = price;
    }

    public int getRoomNumber() {
        return getRoomNumber();
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedType() {
        return getBedType();
    }

    public double getPrice() {
        return getPrice();
    }

    @Override
    public String toString() {
        return "Room: " + roomNumber + "\n" + "Bed Type: " + bedType + "\n" + "Price: " + price;
    }

    public static void main(String[] args) {
        Hotel standardroom = new StandardRoom(212, "Queen", 1000, true);
        System.out.println(standardroom);

        DeluxeRoom deluxeroom = new DeluxeRoom(313, "King", 10000, true, true);
        System.out.println(deluxeroom);
    }
}

class StandardRoom extends Hotel {
    private boolean hasBathtub;

    public StandardRoom(int roomNumber, String bedType, double price, boolean hasBathtub) {
        super(roomNumber, bedType, price);
        this.hasBathtub = hasBathtub;
    }

    public boolean isHasBathtub() {
        return hasBathtub;
    }

    public void setHasBathtub(boolean hasBathtub) {
        this.hasBathtub = hasBathtub;
    }

    public String toString() {
        return super.toString() + "\n" + "Has Bathtub: " + hasBathtub;
    }
}

class DeluxeRoom extends StandardRoom {
    private boolean hasBalcony;

    public DeluxeRoom(int roomNumber, String bedType, double price, boolean hasBathtub, boolean hasBalcony) {
        super(roomNumber, bedType, price, hasBathtub);
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public String toString() {
        return super.toString() + "\n" + "Has Balcony: " + hasBalcony;
    }
}
