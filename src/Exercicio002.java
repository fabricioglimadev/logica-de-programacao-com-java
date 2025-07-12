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

      if(pessoa.sexo().equals("Feminino")){
        somaAlturaFeminino += altura;
        contaAlturaFeminino++;
        mediaAlturaMulheres = (double) somaAlturaFeminino / contaAlturaFeminino;
      }

      if(pessoa.sexo().equals("Masculino")){
        numeroDeHomens++;
      }

    }

    System.out.println("Maior altura do grupo: " + maior);
    System.out.println("Menor altura do grupo: " + menor);
    System.out.println("A média de altuara das mulheres: " + mediaAlturaMulheres);
    System.out.println("Número de homens: " + numeroDeHomens);

  }

}

record Pessoa(double altura, String sexo) {}

class Pessoas{
  public List<Pessoa> listar(){
    List<Pessoa> pessoas = new ArrayList<>();

    pessoas.add(new Pessoa(1.74, "Masculino"));
    pessoas.add(new Pessoa(1.74, "Masculino"));
    pessoas.add(new Pessoa(1.74, "Masculino"));
    pessoas.add(new Pessoa(1.74, "Masculino"));
    pessoas.add(new Pessoa(1.74, "Masculino"));
    pessoas.add(new Pessoa(1.74, "Masculino"));
    pessoas.add(new Pessoa(1.60, "Feminino"));
    pessoas.add(new Pessoa(1.84, "Masculino"));
    pessoas.add(new Pessoa(1.84, "Masculino"));
    pessoas.add(new Pessoa(1.84, "Masculino"));

    pessoas.add(new Pessoa(1.84, "Masculino"));
    pessoas.add(new Pessoa(1.84, "Masculino"));
    pessoas.add(new Pessoa(1.84, "Masculino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));

    pessoas.add(new Pessoa(1.74, "Masculino"));
    pessoas.add(new Pessoa(1.74, "Masculino"));
    pessoas.add(new Pessoa(1.74, "Masculino"));
    pessoas.add(new Pessoa(1.74, "Masculino"));
    pessoas.add(new Pessoa(1.74, "Masculino"));
    pessoas.add(new Pessoa(1.74, "Masculino"));
    pessoas.add(new Pessoa(1.60, "Feminino"));
    pessoas.add(new Pessoa(1.84, "Masculino"));
    pessoas.add(new Pessoa(1.84, "Masculino"));
    pessoas.add(new Pessoa(1.84, "Masculino"));

    pessoas.add(new Pessoa(1.84, "Masculino"));
    pessoas.add(new Pessoa(1.84, "Masculino"));
    pessoas.add(new Pessoa(1.84, "Masculino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));

    pessoas.add(new Pessoa(1.84, "Masculino"));
    pessoas.add(new Pessoa(1.84, "Masculino"));
    pessoas.add(new Pessoa(1.84, "Masculino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));
    pessoas.add(new Pessoa(1.55, "Feminino"));

    return pessoas;
  }
}
