/*
* Fazer um algoritmo que:
- Leia um número indeterminado de linhas contendo cada uma a idade de um indivíduo.
A última linha que não entrará nos cálculos, contém o valor da idade igual a zero.
- Calcule e escreva a idade média deste grupo de indivíduos
* Fonte: Algoritmos Estruturados - Harry Farrer
* */



import java.util.Scanner;

public class Exercicio01V2 {

  public static void main(String[] args) {

    int soma = 0;
    int contador = 0;

    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("Digite a idade");

      int idade = scanner.nextInt();

      if (idade == 0){
        break;
      }

      if (idade < 0){
        continue;
      }

      soma += idade;
      contador += 1;

    } while (true);

    double media = 0.0;
    if (contador > 0){
      media = (double) soma / contador;
    }

    System.out.println("Idade média: " + media);

    scanner.close();

  }

}
