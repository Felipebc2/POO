public class CadastroPessoas {
    protected Pessoa[] pessoas;
    protected int qtdAtual;

    public CadastroPessoas(int tam) {
        pessoas = new Pessoa[tam];
        qtdAtual = 0;
    }

    public void cadastraPessoa(Pessoa p) {
        if (qtdAtual < pessoas.length) {
            pessoas[qtdAtual] = p;
            qtdAtual++;
        } else {
            System.out.println("Cadastro cheio!");
        }
    }

    public void imprimeCadastro() {
        for (int i = 0; i < qtdAtual; i++) {
            pessoas[i].imprimeDados();
        }
    }

    public void imprimePessoa(int index) {
        try {
            if (index < 0 || index >= qtdAtual) {
                throw new ArrayIndexOutOfBoundsException("Índice fora dos limites: " + index);
            }
            pessoas[index].imprimeDados();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

}