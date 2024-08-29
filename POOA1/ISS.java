package POOA1;

public class ISS implements Imposto {
    private static final double ALIQUOTA = 0.073;

    @Override
    public double calcular(double valor) {
        return valor * ALIQUOTA;
    }

    @Override
    public String getNome() {
        return "ISS";
    }
}