/*

Exercicio 1.12.1.
Fazer um algoritmo que:
- Leia um número indeterminado de linhas contendo cada uma a idade de um indivíduo.
A última linha que não entrará nos cálculos, contém o valor da idade igual a zero.
- Calcule e escreva a idade média deste grupo de indivíduos.

Fonte: Livro Algoritmos Estruturados – Harry Farrer

* */


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio001 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {

      int somaIdade = 0;
      int contadorDeIdade = 0;

      while (true){
        System.out.println("Digite a idade");
        try{

          int idade = scanner.nextInt();

          if(idade == 0){
            break;
          }

          if(idade < 0){
            System.out.println("Idade não pode ser negativa");
            continue;
          }

          somaIdade += idade;
          contadorDeIdade++;

        } catch (InputMismatchException e){
          System.out.println("A idade deve ser um número inteiro");
          break;
        }


      }

      double media = 0;
      if(contadorDeIdade > 0){
        media = (double) somaIdade / contadorDeIdade;

        //Arredondamento com duas casas decimais
        media = Math.round(media * Math.pow(10,2))/Math.pow(10,2);
      }

      System.out.println("Idade média: " + media);


    } finally {
      scanner.close();
    }

  }


}
