public class instance {
    // Instance variables
    // These variables are specific to each instance of the Car class.
    String brand;
    int year;
    boolean isElectric;

    // Constructor to initialize the instance variables
    public Car(String brand, int year, boolean isElectric) {
        this.brand = brand;
        this.year = year;
        this.isElectric = isElectric;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacture Year: " + year);
        System.out.println("Is Electric: " + isElectric);
    }

    public static void main(String[] args) {
        // Creating objects (instances) of the Car class
        Car car1 = new Car("Tesla", 2020, true);
        Car car2 = new Car("Toyota", 2015, false);

        // Each object has its own set of instance variables
        car1.displayInfo(); // Displays information about car1
        car2.displayInfo(); // Displays information about car2
    }
}