public class Vehicle {
    int wheelSize;
    int tyreThickness;
    String name;

    public Vehicle(int wheelSize, int tyreThickness, String name) {
        this.wheelSize = wheelSize;
        this.tyreThickness = tyreThickness;
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Vehicle: " + name);
        System.out.println("Wheel Size: " + wheelSize);
        System.out.println("Tyre Thickness: " + tyreThickness);
    }
    
    public class Truck extends Vehicle {
        private int cargoCapacity;
    
        public Truck(int wheelSize, int tyreThickness, String name, int cargoCapacity) {
            super(wheelSize, tyreThickness, name); // Call the constructor of the Vehicle class
            this.cargoCapacity = cargoCapacity;
        }
    
        @Override
        public void showDetails() {
            super.showDetails();
            System.out.println("Cargo Capacity: " + cargoCapacity + "kg");
        }
    }
}