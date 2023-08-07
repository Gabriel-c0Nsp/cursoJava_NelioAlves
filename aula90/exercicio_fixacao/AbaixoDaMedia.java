import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos elementos vai ter o vetor? ");
    int N = scanner.nextInt();

    double[] vetor = new double[N];

    double soma = 0;
    double media = 0;

    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Digite um número: ");
      vetor[i] = scanner.nextDouble();
      soma += vetor[i];
    }

    media = soma / N;

    System.out.println("MÉDIA DO VETOR = " + media);

    System.out.println();
    System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");

    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] < media) {
        System.out.println(vetor[i]);
      }
    }

    scanner.close();

  }
}
