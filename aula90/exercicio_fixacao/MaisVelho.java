import java.util.Scanner;

public class MaisVelho {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantas pessoas você vai digitar? ");
    int quantidadeNomes = scanner.nextInt();

    String[] nome = new String[quantidadeNomes];
    int[] idade = new int[quantidadeNomes];

    int maisVelho = Integer.MIN_VALUE;
    String nomeMaisVelho = "";

    for (int i = 0; i < quantidadeNomes; i++) {
      System.out.println("Dados da " + (i + 1) + "º pessoa");

      System.out.print("Nome: ");
      nome[i] = scanner.next();

      System.out.print("Idade: ");
      idade[i] = scanner.nextInt();

      if (idade[i] > maisVelho) {
        maisVelho = idade[i];
        nomeMaisVelho = nome[i];
      }
    }

    System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelho);

    scanner.close();

  }
}
