import java.util.ArrayList;

public class Truck {

    Truck() {
    }

    void makeDelivery(double distanceTravelled) {

    }

    public static void main(String[] args) {

        DeliveryCompany company = new DeliveryCompany();
        OldTruck truck1 = new OldTruck();
        OldTruck truck2 = new OldTruck();
        OldTruck truck3 = new OldTruck();

        NewTruck Newtruck1 = new NewTruck();
        NewTruck Newtruck2 = new NewTruck();
        NewTruck Newtruck3 = new NewTruck();

        company.addTruck(truck1);
        company.addTruck(truck2);
        company.addTruck(truck3);
        company.addTruck(Newtruck1);
        company.addTruck(Newtruck2);
        company.addTruck(Newtruck3);

        company.makeDelivery(200);

    }

}

class OldTruck extends Truck {

    double fuelEfficiency;
    double fuelCapacity;

    OldTruck() {
        this.fuelEfficiency = 7.2;
        this.fuelCapacity = 80;

    }

    @Override
    void makeDelivery(double distanceTravelled) {
        double fuelConsumed = distanceTravelled / this.fuelEfficiency;
        this.fuelCapacity -= fuelConsumed;

        System.out.println("Fuel Consumed: " + fuelConsumed + "\n" + "Fuel Capacity: " + this.fuelCapacity);
    }
}

class NewTruck extends Truck {

    double fuelEfficiency;
    double fuelCapacity;

    NewTruck() {
        this.fuelEfficiency = 5.0;
        this.fuelCapacity = 120;

    }

    @Override
    void makeDelivery(double distanceTravelled) {
        double fuelConsumed = distanceTravelled / this.fuelEfficiency;
        this.fuelCapacity -= fuelConsumed;

        System.out.println("Fuel Consumed: " + fuelConsumed + "\n" + "Fuel Capacity: " + this.fuelCapacity);
    }
}

class DeliveryCompany extends Truck {
    private ArrayList<Truck> delivery;

    DeliveryCompany() {
        delivery = new ArrayList<>();
    }

    void addTruck(Truck truck) {
        this.delivery.add(truck);
    }

    void makeDelivery(double distanceTravelled) {
        for (Truck truck : delivery) {
            truck.makeDelivery(distanceTravelled);
        }
    }
}
