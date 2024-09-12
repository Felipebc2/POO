public class Car extends Vehicle {
    public Car(double weight) {
        super("Car", weight);
    }

    @Override
    public double calcPriceHour() {
        double weight = getWeight();
        if (weight <= 2) {
            return 13.00;
        } else {
            return -1; // Van Classified
        }
    }
}