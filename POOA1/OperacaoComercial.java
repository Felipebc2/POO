package POOA1;

import java.util.ArrayList;
import java.util.List;

public class OperacaoComercial {
    private double valorItem;
    private List<Imposto> impostos;

    public OperacaoComercial(double valorItem) {
        this.valorItem = valorItem;
        this.impostos = new ArrayList<>();
    }

    public void adicionarImposto(Imposto imposto) {
        this.impostos.add(imposto);
    }

    public double calcularValorTotal() {
        double totalImpostos = 0;
        for (Imposto imposto : impostos) {
            totalImpostos += imposto.calcular(valorItem);
        }
        return valorItem + totalImpostos;
    }

    public void detalharOperacao() {
        System.out.println("Valor original do item: " + valorItem);
        for (Imposto imposto : impostos) {
            double valorImposto = imposto.calcular(valorItem);
            System.out.println(imposto.getNome() + ": " + valorImposto);
        }
        System.out.println("Valor total com impostos: " + calcularValorTotal());
    }
}
