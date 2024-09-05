public class Bomb {
    // Attributes
    private String gasType;
    private double lValue;
    private double gasQty;
    private double totalFueled;

    public Bomb(String gasType, double lValue, double gasQty) {
        this.gasType = gasType;
        this.lValue = lValue;
        this.gasQty = gasQty;
        this.totalFueled = 0;
    }

    // ---------------------------------------------------------------- //
    //                       Abastecer por valor                        //
    // ---------------------------------------------------------------- //
    public void fuelByValue(double value) {
        double liters = value / lValue;
        if (liters > gasQty) {
            System.out.println("Insufficient amount of fuel at the pump");
            return;
        }
        gasQty -= liters;
        totalFueled += value;
        System.out.printf("Fueled: %.2f liters.\n Remaining: %.2f liters.\n", liters, gasQty);
    }

    // ---------------------------------------------------------------- //
    //                       Abastecer por litro                        //
    // ---------------------------------------------------------------- //
    public void fuelByLiters(double liters) {
        if (liters > gasQty) {
            System.out.println("Insufficient amount of fuel at the pump");
            return;
        }
        double cost = liters * lValue;
        gasQty -= liters;
        totalFueled += cost;
        System.out.printf("The amount to be paid is: R$ %.2f. Remaining fuel: %.2f liters.\n", cost, gasQty);
    }

    // ---------------------------------------------------------------- //
    //                       Alterar o valor do litro                   //
    // ---------------------------------------------------------------- //
    public void switchLValue(double newLValue) {
        this.lValue = newLValue;
        System.out.printf("New price per liter: $%.2f\n", lValue);
    }

    // ---------------------------------------------------------------- //
    //                    Alterar o tipo de combustível                 //
    // ---------------------------------------------------------------- //
    public void switchLFuel(String newGasType) {
        this.gasType = newGasType;
        System.out.printf("New fuel type: %s\n", gasType);
    }

    // ---------------------------------------------------------------- //
    //             Alterar a quantidade de combustível restante         //
    // ---------------------------------------------------------------- //
    public void setGasQty(double newGasQty) {
        this.gasQty = newGasQty;
        System.out.printf("New fuel quantity in the tank: %.2f liters\n", gasQty);
    }

    // ---------------------------------------------------------------- //
    //                     Exibe o total abastecido                     //
    // ---------------------------------------------------------------- //
    public void showTotalFueled() {
        System.out.printf("Total fueled: $%.2f\n", totalFueled);
    }
}
