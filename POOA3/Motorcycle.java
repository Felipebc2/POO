public class Motorcycle extends Vehicle {
    public Motorcycle(double weight) {
        super("Motorcycle", weight);
    }

    @Override
    public double calcPriceHour() {
        double weight = getWeight();
        if (weight <= 100) {
            return 2.00;
        } else if (weight <= 299.9) {
            return 4.00;
        } else if (weight <= 400) {
            return 10.00;
        } else {
            return -1; // Cannot enter the parking lot
        }
    }
}
