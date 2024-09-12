import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garage garage = new Garage();
        boolean running = true;

        while (running) {
            System.out.println("Do you want to add a new vehicle? (Y/N): ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("N")) {
                running = false;
            } else {
                System.out.println("Enter the type of vehicle (motorcycle, car, truck, van): ");
                String type = scanner.nextLine().toLowerCase();

                Vehicle vehicle = null;
                double weight;

                if (type.equals("motorcycle")) {
                    // For motorcycle, ask the weight in kilograms
                    System.out.println("Enter the motorcycle weight in kilograms (kg): ");
                    weight = scanner.nextDouble();
                    scanner.nextLine(); // Clear buffer after nextDouble()
                } else {
                    // For other vehicles, ask the weight in tons
                    System.out.println("Enter the vehicle weight in tons (ton): ");
                    weight = scanner.nextDouble();
                    scanner.nextLine(); // Clear buffer after nextDouble()
                }

                switch (type) {
                    case "van":
                        System.out.println("Is the van loaded? (Y/N): ");
                        String loadedVan = scanner.nextLine();
                        vehicle = new Van(weight, loadedVan.equalsIgnoreCase("Y"));
                        break;
                    case "truck":
                        System.out.println("Is the truck loaded? (Y/N): ");
                        String loadedTruck = scanner.nextLine();
                        vehicle = new Truck(weight, loadedTruck.equalsIgnoreCase("Y"));
                        break;
                    case "car":
                        // Cars with weight greater than 2 tons are classified as vans
                        vehicle = (weight > 2) ? new Van(weight, false) : new Car(weight);
                        break;
                    case "motorcycle":
                        vehicle = new Motorcycle(weight);
                        break;
                    default:
                        System.out.println("Invalid type of vehicle.");
                        continue;
                }

                garage.verifyVehicle(vehicle); // Process and verify the vehicle
            }
        }
        scanner.close(); // Close scanner at the end
    }
}
