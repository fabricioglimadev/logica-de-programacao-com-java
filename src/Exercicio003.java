/*
Exercício 1.12.3.
A conversão de graus Farenheit para centígrados é obtida por
C = 5/9 * (F - 32)
Fazer um algoritmo que calcule e escreva uma tabela de centígrados em função de graus
Farenheit, que variam de 50 a 150 de 1 em 1.

Fonte: Livro Algoritmos Estruturados – Harry Farrer


*/

public class Exercicio003 {

  public static void main(String[] args) {

    System.out.println("Farenheit\tCentigrados");
    for(int farenheit = 50; farenheit <= 150; farenheit++){

      double centigrado = (double) (farenheit - 32) * 5 / 9;
      centigrado = Arredondamento.arredondar(centigrado,2);
      System.out.println(farenheit + "\t\t\t" + centigrado);

    }

  }

}

class Arredondamento{
  public static double arredondar(double valor, int casasDecimais){
    double potenciaDeDez = Math.pow(10,casasDecimais);
    return Math.round(valor * potenciaDeDez)/potenciaDeDez;
  }
}
