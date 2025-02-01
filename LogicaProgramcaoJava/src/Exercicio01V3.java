/*
* Fazer um algoritmo que:
- Leia um número indeterminado de linhas contendo cada uma a idade de um indivíduo.
A última linha que não entrará nos cálculos, contém o valor da idade igual a zero.
- Calcule e escreva a idade média deste grupo de indivíduos
* Fonte: Algoritmos Estruturados - Harry Farrer
* */



import java.util.Scanner;

public class Exercicio01V3 {

  public static void main(String[] args) {

    int somaIdade = 0;
    int contadorDeIdade = 0;

    Scanner scanner = new Scanner(System.in);

    int idade;

    do {
      System.out.println("Digite a idade");

      idade = scanner.nextInt();

      somaIdade += idade;
      contadorDeIdade += 1;

    } while (idade > 0);

    contadorDeIdade -= 1;

    double idadeMedia = 0.0;
    if (contadorDeIdade > 0){
      idadeMedia = (double) somaIdade / contadorDeIdade;
    }

    System.out.println("Idade média: " + idadeMedia);

    scanner.close();

  }

}
