# [Atividade 03] Edifício garagem
Escreva um programa em Java, utilizando orientação a objetos, para controlar a utilização e a bilhetagem de uma edifício estacionamento.

O edifício pode ser utilizado por vários tipos de veículos como automóveis de dimensões mais convencionais como veículos hatchbacks e sedans. Estes automóveis são chamados carros de passeio. Também são aceitas caminhonetes e furgões, sendo que as caminhonetes não podem ter mais que 6 ton de PBT (peso total bruto) e os furgões não podem exceder 6 ton de PBT, assim como possuírem no máximo 18 m3 de volume. Motocicletas e bicicletas possuem espaço para serem estacionadas. Somente motocicletas de até 400 kg podem utilizar a garagem.

As tarifas cobradas para estacionar são determinadas de acordo com o tipo o peso do veículo, conforme descreve a tabela a seguir:

![](https://i.pinimg.com/736x/2b/40/63/2b4063a1af3222a4adff1637c1e5e8c1.jpg)

Caso o carro de passeio possua mais que 2 toneladas (ton) de peso, ele deve ser classificado como furgão de acordo com o peso que ele apresentar.

Crie uma estrutura de classes, utilizando herança, para classificar os veículos e informar o valor que deverá ser cobrado por hora estacionada. O programa também deve verificar se o veículo pode ser aceito no estacionamento.

Sobre o fluxo de utilização do sistema, não é necessário criar um fluxo mais elaborado de opções ao usuário. Basta que o sistema pergunte ao usuário se deseja informar um novo veículo ou sair. Caso deseje informar o novo veículo, o sistema deve receber os dados deste novo veículo via entrada do usuário. Após a conclusão da entrada dos dados, o sistema deve processar os dados e classificar o automóvel para, em seguida, informar o valor da hora estacionada.

O programa deve:
- possuir estrutura de classes utilizando herança;
- alguma classe para classificar o veículo de acordo com os seus dados;
- alguma classe para o programa com o método public static void main(String[] args). Essa classe deve ser separada da classe de controle da garagem.

**Dica**: utilize a classe Scanner para receber a entrada de dados. Para saber sobre a classe Scanner, veja: https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-pacote-java-io#uma-maneira-mais-facil-scanner-e-printstream

Observação: o trabalho é individual.

A entrega deve ser realizada pelo Github, cujo link deve ser informado nesta tarefa.
