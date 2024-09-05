# Bomba de Combustível
### Atividades da matéria de POO (Programação Orientada a Objetos) da faculdade IDP
#### Escreva um programa em Java, utilizando orientação a objetos, para controlar a operação de uma bomba de combustível.

## Atributos:
~~~java
private String gasType;
private double lValue;
private double gasQty;
private double totalFueled;
~~~

## Métodos
~~~java
// é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo;
public void fuelByValue(double value) {
        // code here
}

// é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente;
public void fuelByLiters(double liters) {
        // *********
        // code here
        // *********
}

// altera o valor do litro do combustível;
public void switchLValue(double newLvalue) {
        // *********
        // code here
        // *********
}

// altera o tipo do combustível;
public void switchLFuel(String newGasType) {
        // *********
        // code here
        // *********
}

// altera a quantidade de combustível restante na bomba.
public void setGasQty(double newGasQty) {
        // *********
        // code here
        // *********
}

public void showTotalFueled() {
        // *********
        // code here
        // *********
}
~~~

_Obs: Sempre que acontecer um abastecimento é necessário atualizar a quantidade de combustível total na bomba._

Adaptado de https://wiki.python.org.br/ExerciciosClasses

## O programa deve:
- ter uma classe BombaCombustivel;
- alguma classe para o programa com o método public static void main(String[] args). Essa classe deve ser separada da classe de controle da bomba de combustível e essa classe deve instanciar uma bomba;
- permitir que o usuário escolha a forma e o valor do abastecimento;
- informar o valor total que já foi abastecido na bomba.
_Dica: utilize a classe Scanner para receber a entrada de dados. Para saber sobre a classe Scanner, veja https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-pacote-java-io#uma-maneira-mais-facil-scanner-e-printstream_

**A entrega deve ser realizada pelo Github, cujo link deve ser informado nesta tarefa.**
