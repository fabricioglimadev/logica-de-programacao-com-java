/*
Exercício 1.12.5.
Supondo que a população de um país A seja da ordem de 90.000.000 de habitantes com
uma taxa anual de crescimento de 1,5% e que a população de um país B seja, aproximadamente, de
20.000.000 de habitantes com uma taxa anual de crescimento de 3%, fazer um algoritmo que
calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou
iguale a população do país B, mantidas essas taxas de crescimento.

Fonte: Livro Algoritmos Estruturados – Harry Farrer
 */
public class Exercicio005 {

  public static void main(String[] args) {

    double taxaA = 1.5;
    double taxaB = 3.0;

    double populacaoA = 90000000;
    double populacaoB = 20000000;

    int anos = 0;

    while (populacaoB <= populacaoA){
      populacaoA *= (1 + taxaA / 100.0);
      populacaoB *= (1 + taxaB / 100.0);
      anos++;
    }

    System.out.println("O número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B é de " + anos + " anos");
    System.out.println("População A: " + populacaoA);
    System.out.println("População B: " + populacaoB);

  }

}
