import java.util.Scanner;

public class TestaCadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroPessoas cadastro = new CadastroPessoas(10);
        boolean continuar = true;

        // Cadastro pre feito para visualização da exec.
        cadastro.cadastraPessoa(new Cliente("Ana", new Data(12, 5, 1985), 123));
        cadastro.cadastraPessoa(new Funcionario("Carlos", new Data(20, 7, 1990), 2500f));
        cadastro.cadastraPessoa(new Gerente("Marcos", new Data(10, 9, 1980), 5000f, "TI"));


        while (continuar) {
            System.out.println("\nMENU DE CADASTRO");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Funcionário");
            System.out.println("3. Cadastrar Gerente");
            System.out.println("4. Mostrar Cadastro");
            System.out.println("5. Acessar Pessoa por Índice");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // Cadastrar Cliente
                    System.out.print("Nome do Cliente: ");
                    sc.nextLine(); // Consumir o newline
                    String nomeCliente = sc.nextLine();
                    System.out.print("Dia do Nascimento: ");
                    int diaCli = sc.nextInt();
                    System.out.print("Mes do Nascimento: ");
                    int mesCli = sc.nextInt();
                    System.out.print("Ano do Nascimento: ");
                    int anoCli = sc.nextInt();
                    System.out.print("Código do Cliente: ");
                    int codigo = sc.nextInt();

                    Cliente cliente = new Cliente(nomeCliente, new Data(diaCli, mesCli, anoCli), codigo);
                    cadastro.cadastraPessoa(cliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    // Cadastrar Funcionário
                    System.out.print("Nome do Funcionário: ");
                    sc.nextLine(); // Consumir o newline
                    String nomeFuncionario = sc.nextLine();
                    System.out.print("Dia do Nascimento: ");
                    int diaFunc = sc.nextInt();
                    System.out.print("Mes do Nascimento: ");
                    int mesFunc = sc.nextInt();
                    System.out.print("Ano do Nascimento: ");
                    int anoFunc = sc.nextInt();
                    System.out.print("Salário do Funcionário em R$: ");
                    float salarioFunc = sc.nextFloat();

                    Funcionario funcionario = new Funcionario(nomeFuncionario, new Data(diaFunc, mesFunc, anoFunc), salarioFunc);
                    cadastro.cadastraPessoa(funcionario);
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;

                case 3:
                    // Cadastrar Gerente
                    System.out.print("Nome do Gerente: ");
                    sc.nextLine(); // Consumir o newline
                    String nomeGerente = sc.nextLine();
                    System.out.print("Dia do Nascimento: ");
                    int diaGer = sc.nextInt();
                    System.out.print("Mes do Nascimento: ");
                    int mesGer = sc.nextInt();
                    System.out.print("Ano do Nascimento: ");
                    int anoGer = sc.nextInt();
                    System.out.print("Salário do Gerente em R$: ");
                    float salarioGer = sc.nextFloat();
                    System.out.print("Área do Gerente: ");
                    sc.nextLine(); // Consumir o newline
                    String area = sc.nextLine();

                    Gerente gerente = new Gerente(nomeGerente, new Data(diaGer, mesGer, anoGer), salarioGer, area);
                    cadastro.cadastraPessoa(gerente);
                    System.out.println("Gerente cadastrado com sucesso!");
                    break;

                case 4:
                    // Mostrar cadastro
                    System.out.println("\nCadastro Atual:");
                    cadastro.imprimeCadastro();
                    break;

                case 5:
                    // Acessar pessoa por índice
                    System.out.print("Digite o índice da pessoa que deseja acessar (0 a " + (cadastro.getQtdAtual() - 1) + "): ");
                    int index = sc.nextInt();
                    cadastro.imprimePessoa(index);
                    break;

                case 6:
                    // Sair
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }

        sc.close();
    }
}