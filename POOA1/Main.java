package POOA1;

public class Main {
    public static void main(String[] args) {
        OperacaoComercial operacaoProduto = new OperacaoComercial(1000.00);
        operacaoProduto.adicionarImposto(new ICMS());
        operacaoProduto.adicionarImposto(new IPI());
        operacaoProduto.detalharOperacao();

        OperacaoComercial operacaoServico = new OperacaoComercial(500.00);
        operacaoServico.adicionarImposto(new ISS());
        operacaoServico.adicionarImposto(new ICMS());
        operacaoServico.detalharOperacao();
    }
}