/*

Exercício 1.12.6.
Um determinado material radioativo perde metade de sua massa a cada 50 segundos.
Dada a massa inicial, em gramas, fazer um algoritmo que determine o tempo necessário para que
essa massa se torne menor do que 0,5 grama. Escreva a massa inicial, a massa final e o tempo
calculado em horas, minutos e segundos.

Fonte: Livro Algoritmos Estruturados – Harry Farrer

*/

import java.util.Scanner;

public class Exercicio006 {

  public static void main(String[] args) {

    int tempoEmSegundos = 50;

    Scanner scanner = new Scanner(System.in);

    double massaInicial = 10000000000000000000000f;//Em gramas
    double massaFinal = massaInicial;
    int tempo = 0;
    while(true){

      massaFinal = massaFinal - 0.5 * massaFinal;
      tempo = tempo + tempoEmSegundos;

      if(massaFinal < 0.5){
        break;
      }

    }

    System.out.println("Massa inicial: " + massaInicial);
    System.out.println("Massa final: " + massaFinal);
    System.out.println("Tempo total em segundos: " + tempo);


    int horas = 0;
    int minutos = 0;
    int segundos = 0;

    if(tempo >= 3600){
      horas = tempo / 3600;
      minutos = tempo % 3600;
      if(minutos >= 60){
        minutos = minutos / 60;
        segundos = minutos % 60;
      }
    } else if(tempo >= 60 && tempo < 3600){
      minutos = tempo / 60;
      segundos = tempo % 60;
    } else {
      segundos = tempo;
    }

    System.out.println("Tempo em horas: " + horas);
    System.out.println("Tempo em minutos: " + minutos);
    System.out.println("Tempo em segundos: " + segundos);

    scanner.close();

  }

}
