/*
* Cálculo de Idade Média: Elabore um algoritmo que leia idades de indivíduos até que uma idade igual a zero seja inserida.
* O programa deve calcular e exibir a idade média do grupo.
* */


import java.util.Scanner;

public class Exercicio01V2 {

  public static void main(String[] args) {

    int soma = 0;
    int contador = 0;

    Scanner leitura = new Scanner(System.in);

    do {
      System.out.println("Digite a idade");

      int idade = leitura.nextInt();

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
      media = (double)soma/contador;
    }

    System.out.println("Idade média: " + media);

  }

}
