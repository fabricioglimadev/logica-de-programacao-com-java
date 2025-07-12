/*
Exercício 1.12.3.
A conversão de graus Farenheit para centígrados é obtida por
C = 5/9 * (F - 32)
Fazer um algoritmo que calcule e escreva uma

Fonte: Livro Algoritmos Estruturados – Harry Farrer


*/

public class Exercicio003 {

  public static void main(String[] args) {

    System.out.println("Farenheit\tCentigrados");
    for(int farenheit = 50; farenheit <= 150; farenheit++){

      double centigrado = (double) (farenheit - 32) * 5 / 9;
      System.out.println(farenheit + "\t\t\t" + centigrado);

    }

  }

}
