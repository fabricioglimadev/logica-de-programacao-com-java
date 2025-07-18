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

    System.out.println("Digita o valor da massa inicial em gramas");
    double massaInicial = scanner.nextDouble();
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

    Tempo t = new Tempo(tempo);

    System.out.println("Tempo em horas: " + t.getHoras());
    System.out.println("Tempo em minutos: " + t.getMinutos());
    System.out.println("Tempo em segundos: " + t.getSegundos());

    scanner.close();

  }

}

class Tempo{

  private int tempoEmSegundos;
  private int segundos;
  private int minutos;
  private int horas;

  public Tempo(int tempoEmSegundos){
    this.tempoEmSegundos = tempoEmSegundos;
    this.segundos = 0;
    this.minutos = 0;
    this.horas = 0;
    calcular();
  }

  public int getSegundos() {
    return segundos;
  }

  public int getMinutos() {
    return minutos;
  }

  public int getHoras() {
    return horas;
  }

  private void calcular(){

    segundos = tempoEmSegundos;

    if(tempoEmSegundos >= 3600){
      horas = tempoEmSegundos / 3600;
      minutos = tempoEmSegundos % 3600;
      if((tempoEmSegundos % 3600) >= 60){
        minutos = (tempoEmSegundos % 3600) / 60;
        segundos = (tempoEmSegundos % 3600) % 60;
      }
    } else if(tempoEmSegundos >= 60 && tempoEmSegundos < 3600){
      minutos = tempoEmSegundos / 60;
      segundos = tempoEmSegundos % 60;
    }

  }

}
