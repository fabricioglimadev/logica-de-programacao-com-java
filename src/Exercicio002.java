/*

Exercício 1.12.2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 50
pessoas. Fazer um algoritmo que calcule e escreva:
- a maior e a menor altura do grupo;
- a média de altura das mulheres;
- o número de homens;
Fonte: Livro Algoritmos Estruturados – Harry Farrer

* */


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercicio002 {



  public static void main(String[] args) {

    Pessoas pessoas = new Pessoas();
    List<Pessoa> listaDePessoas = pessoas.listar();

    double menor = 5.0;//Menor altura em metros
    double maior = 0.0;//Maior altura em metros

    double somaAlturaFeminino = 0.0;
    int contaAlturaFeminino = 0;
    double mediaAlturaMulheres = 0.0;

    int numeroDeHomens = 0;

    for (Pessoa pessoa : listaDePessoas){

      double altura = pessoa.altura();
      if(altura < menor){
        menor = altura;
      }
      if(altura > maior){
        maior = altura;
      }

      if(pessoa.sexo().equals(Sexo.FEMININO)){
        somaAlturaFeminino += altura;
        contaAlturaFeminino++;
        mediaAlturaMulheres = (double) somaAlturaFeminino / contaAlturaFeminino;
      }

      if(pessoa.sexo().equals(Sexo.MASCULINO)){
        numeroDeHomens++;
      }

    }

    System.out.println("Maior altura do grupo: " + maior);
    System.out.println("Menor altura do grupo: " + menor);
    System.out.println("A média de altuara das mulheres: " + mediaAlturaMulheres);
    System.out.println("Número de homens: " + numeroDeHomens);

  }

}

enum Sexo {
  MASCULINO,
  FEMININO
}

//Uso de record para representar uma pessoa com os dados de altura e sexo
record Pessoa(double altura, Sexo sexo) {}

//A classe Pessoa irá conter uma lista de 50 pessoas com as informações de altura e sexo
class Pessoas{

  public List<Pessoa> listar(){
    List<Pessoa> pessoas = new ArrayList<>();

    pessoas.add(new Pessoa(1.74, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.74, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.74, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.74, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.74, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.74, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.60, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.84, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.84, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.84, Sexo.MASCULINO));

    pessoas.add(new Pessoa(1.84, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.84, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.84, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));

    pessoas.add(new Pessoa(1.74, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.74, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.74, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.74, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.74, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.74, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.60, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.84, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.84, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.84, Sexo.MASCULINO));

    pessoas.add(new Pessoa(1.84, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.84, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.84, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));

    pessoas.add(new Pessoa(1.84, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.84, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.84, Sexo.MASCULINO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));
    pessoas.add(new Pessoa(1.55, Sexo.FEMININO));

    return pessoas;
  }
}
