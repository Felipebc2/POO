package POOA1;

public class ICMS implements Imposto {
    private static final double ALIQUOTA = 0.132;

    @Override
    public double calcular(double valor) {
        return valor * ALIQUOTA;
    }

    @Override
    public String getNome() {
        return "ICMS";
    }
}
