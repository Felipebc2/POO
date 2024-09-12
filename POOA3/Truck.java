public class Truck extends Vehicle {
    private boolean loaded;

    public Truck(double weight, boolean loaded) {
        super("Truck", weight);
        this.loaded = loaded;
    }

    @Override
    public double calcPriceHour() {
        double weight = getWeight();
        if (loaded) {
            return (weight > 6) ? -1 : 50.00; // Above 6 tons cannot enter
        } else {
            return (weight <= 3) ? 25.00 : 50.00; // Difference between loaded and not loaded
        }
    }
}