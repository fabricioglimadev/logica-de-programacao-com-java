/*

Exercício 1.12.4.
Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele
comercializa. Para isto, mandou digitar uma linha para cada mercadoria com nome, preço de
compra e preço de venda das mesmas. Fazer um algoritmo que:determine e escreva quantas
mercadorias proporcionam:
lucro < 10%
10% <= lucro <= 20%
lucro > 20%
determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o
lucro total.
Observação: o aluno deve adotar um flag.

*/

import java.util.Scanner;

public class Exercicio004 {

  public static void main(String[] args) {

    int contMenorDez = 0;
    int contMaiorVinte = 0;
    int contOutros = 0;

    double valorTotalCompra = 0.0;
    double valorTotalVenda = 0.0;
    double lucroTotal = 0.0;

    Scanner scanner = new Scanner(System.in);
    try{

      while (true) {

        System.out.println("Digite o nome da mercadoria");
        String nome = scanner.next();

        if (nome.equalsIgnoreCase("FIM")) {
          break;
        }

        System.out.println("Digite o preço de compra da mercadoria");
        double precoCompra = scanner.nextDouble();
        System.out.println("Digite o preço de venda da mercadoria");
        double precoVenda = scanner.nextDouble();

        Mercadoria mercadoria = new Mercadoria(nome, precoCompra, precoVenda);

        if (mercadoria.getPercentualLucro() < 10.0) {
          contMenorDez++;
        } else if (mercadoria.getPercentualLucro() > 20.0) {
          contMaiorVinte++;
        } else {
          contOutros++;
        }

        valorTotalCompra += mercadoria.getPrecoCompra();
        valorTotalVenda  += mercadoria.getPrecoVenda();
        lucroTotal       += mercadoria.getValorLucro();

      }

      System.out.println("Total de mercadorias com lucro menor de 10%: " + contMenorDez);
      System.out.println("Total de mercadorias com lucro entre 10% e 20%: " + contOutros);
      System.out.println("Total de mercadorias com lucro maior de 20%: " + contMaiorVinte);

      System.out.println("Valor total compra: " + valorTotalCompra);
      System.out.println("Valor total venda: " + valorTotalVenda);
      System.out.println("Lucro total: " + lucroTotal);

    } finally {
      scanner.close();
    }

  }

}

class Mercadoria {

  private String nome;
  private double precoCompra;
  private double precoVenda;

  public Mercadoria(String nome, double precoCompra, double precoVenda) {
    this.nome = nome;
    this.precoCompra = precoCompra;
    this.precoVenda = precoVenda;
  }

  public String getNome() {
    return nome;
  }

  public double getPrecoCompra() {
    return precoCompra;
  }

  public double getPrecoVenda() {
    return precoVenda;
  }

  public double getValorLucro() {
    return precoVenda - precoCompra;
  }

  public double getPercentualLucro() {
    return (getValorLucro() / precoCompra) * 100.0;
  }

}


