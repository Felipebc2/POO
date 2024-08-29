package POOA1;

public class IPI implements Imposto {
    private static final double ALIQUOTA = 0.219;

    @Override
    public double calcular(double valor) {
        return valor * ALIQUOTA;
    }

    @Override
    public String getNome() {
        return "IPI";
    }
}
