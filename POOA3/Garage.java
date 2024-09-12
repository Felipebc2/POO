public class Garage {
    public void verifyVehicle(Vehicle vehicle) {
        double price = vehicle.calcPriceHour();
        if (price == -1) {
            System.out.println("Vehicle cannot be accepted in parking lot.");
        } else {
            System.out.println("Vehicle can be accepted in the parking lot.");
            System.out.println("The Vehicle " + vehicle.getType() + " will be charged in R$" + price + " per hour.");
        }
    }
}
