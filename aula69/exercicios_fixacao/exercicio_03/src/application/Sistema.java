package application;

import java.util.Scanner;

import entities.Aluno;

public class Sistema {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Aluno aluno = new Aluno();

    double margemParaPassar = 0;

    System.out.print("Insira o nome do aluno: ");
    aluno.nome = scanner.nextLine();

    System.out.println();
    System.out.println("Agora insira as 3 notas do aluno!");
    System.out.println("Primeira nota: ");
    aluno.nota1 = scanner.nextDouble();

    System.out.println("Segunda nota: ");
    aluno.nota2 = scanner.nextDouble();

    System.out.println("Terceira nota: ");
    aluno.nota3 = scanner.nextDouble();

    aluno.vereditoFinal(margemParaPassar);
    
    scanner.close();

  }
}
