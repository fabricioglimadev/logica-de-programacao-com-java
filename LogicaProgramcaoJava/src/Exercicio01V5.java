/*
* Fazer um algoritmo que:
- Leia um número indeterminado de linhas contendo cada uma a idade de um indivíduo.
A última linha que não entrará nos cálculos, contém o valor da idade igual a zero.
- Calcule e escreva a idade média deste grupo de indivíduos
* Fonte: Algoritmos Estruturados - Harry Farrer
* */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercicio01V5 {

  public static void main(String[] args) {


    AtomicInteger somaIdade = new AtomicInteger();


    Scanner scanner = new Scanner(System.in);

    List<Integer> idades = new ArrayList<>();

    
    while (true){
      System.out.println("Digite a idade");

      int idade = scanner.nextInt();

      if (idade == 0){
        break;
      }

      if (idade < 0){
        continue;
      }

      idades.add(idade);

    }

    for (int idade : idades){
      somaIdade += idade;
    }

    double idadeMedia = 0.0;
    if (!idades.isEmpty()){
      idadeMedia = (double) somaIdade / idades.size();
    }

    System.out.println("Idade média: " + idadeMedia);

    scanner.close();

  }

}
