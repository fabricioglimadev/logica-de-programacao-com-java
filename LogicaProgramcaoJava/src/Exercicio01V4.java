/*
* Fazer um algoritmo que:
- Leia um número indeterminado de linhas contendo cada uma a idade de um indivíduo.
A última linha que não entrará nos cálculos, contém o valor da idade igual a zero.
- Calcule e escreva a idade média deste grupo de indivíduos
* Fonte: Algoritmos Estruturados - Harry Farrer
* */


import java.util.Scanner;

public class Exercicio01V4 {

  public static void main(String[] args) {

    //Declaração de variáveis do tipo inteira e inicializando valor com zero
    int somaIdade = 0;
    int contadorDeIdade = 0;

    //Instanciando um variável do tipo Scanner que serve para fazer leitura do que é digitado pelo teclado
    Scanner scanner = new Scanner(System.in);

    int idade;

    System.out.println("Digite a idade");
    idade = scanner.nextInt();
    
    while (idade > 0){

      somaIdade += idade;
      contadorDeIdade += 1;

      System.out.println("Digite a idade");
      idade = scanner.nextInt();

    }

    double idadeMedia = 0.0;
    if (contadorDeIdade > 0){
      idadeMedia = (double) somaIdade / contadorDeIdade;
    }

    System.out.println("Idade média: " + idadeMedia);

    scanner.close();

  }

}
