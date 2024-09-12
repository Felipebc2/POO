public abstract class Vehicle {
    private String type;
    private double weight;

    public Vehicle(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public abstract double calcPriceHour();
    public String getType() { return type; }
    public double getWeight() { return weight; }
}
