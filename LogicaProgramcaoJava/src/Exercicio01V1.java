/*
* Cálculo de Idade Média: Elabore um algoritmo que leia idades de indivíduos até que uma idade igual a zero seja inserida.
* O programa deve calcular e exibir a idade média do grupo.
* */


import java.util.Scanner;

public class Exercicio01V1 {

  public static void main(String[] args) {

    //Declaração de variáveis do tipo inteira e inicializando valor com zero
    int soma = 0;
    int contador = 0;

    //Instanciando um variável do tipo Scanner que serve para fazer leitura do que é digitado pelo teclado
    Scanner leitura = new Scanner(System.in);

    
    while (true){
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

    }

    double media = 0.0;
    if (contador > 0){
      media = (double)soma/contador;
    }

    System.out.println("Idade média: " + media);

  }

}
