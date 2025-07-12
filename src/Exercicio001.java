/*

Exercicio 1.12.1.
Fazer um algoritmo que:
- Leia um número indeterminado de linhas contendo cada uma a idade de um indivíduo.
A última linha que não entrará nos cálculos, contém o valor da idade igual a zero.
- Calcule e escreva a idade média deste grupo de indivíduos.

Fonte: Livro Algoritmos Estruturados – Harry Farrer

* */


import java.util.Scanner;

public class Exercicio001 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int somaIdade = 0;
    int contadorDeIdade = 0;

    while (true){

      System.out.println("Digite a idade");
      int idade = scanner.nextInt();

      if(idade == 0){
        break;
      }

      somaIdade += idade;
      contadorDeIdade++;

    }

    double media = 0;
    if(contadorDeIdade > 0){
      media = (double) somaIdade / contadorDeIdade;
    }

    System.out.println("Idade média: " + media);

    scanner.close();


  }


}
