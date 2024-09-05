import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bomb bomb = new Bomb("Gasoline", 5.0, 100.0);
        int option;
        do {
            System.out.println("\n   _____                 _        _   _             ");
            System.out.println("  / ____|               | |      | | (_)            ");
            System.out.println(" | |  __  __ _ ___   ___| |_ __ _| |_ _  ___  _ __  ");
            System.out.println(" | | |_ |/ _` / __| / __| __/ _` | __| |/ _ \\| '_ \\ ");
            System.out.println(" | |__| | (_| \\__ \\ \\__ \\ || (_| | |_| | (_) | | | |");
            System.out.println("  \\_____|\\__,_|___/ |___/\\__\\__,_|\\__|_|\\___/|_| |_|\n");
            System.out.println("Choose an option:");
            System.out.println("1. Fuel by value");
            System.out.println("2. Fuel by liters");
            System.out.println("3. Change price per liter");
            System.out.println("4. Change fuel type");
            System.out.println("5. Change fuel quantity");
            System.out.println("6. Show total fueled");
            System.out.println("0. Exit");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the amount to fuel: $ ");
                    double value = scanner.nextDouble();
                    bomb.fuelByValue(value);
                    break;
                case 2:
                    System.out.print("Enter the number of liters to fuel: ");
                    double liters = scanner.nextDouble();
                    bomb.fuelByLiters(liters);
                    break;
                case 3:
                    System.out.print("Enter the new price per liter: $ ");
                    double newLValue = scanner.nextDouble();
                    bomb.switchLValue(newLValue);
                    break;
                case 4:
                    System.out.print("Enter the new fuel type: ");
                    scanner.nextLine(); // Consumir a quebra de linha
                    String newGasType = scanner.nextLine();
                    bomb.switchLFuel(newGasType);
                    break;
                case 5:
                    System.out.print("Enter the new fuel quantity (in liters): ");
                    double newGasQty = scanner.nextDouble();
                    bomb.setGasQty(newGasQty);
                    break;
                case 6:
                    bomb.showTotalFueled();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 0);
        scanner.close();
    }
}