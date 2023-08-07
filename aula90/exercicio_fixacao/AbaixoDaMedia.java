import java.util.Scanner;
import java.util.Locale;

public class AbaixoDaMedia {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
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

    System.out.printf("MÉDIA DO VETOR = %.3f%n", media);

    System.out.println();
    System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");

    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] < media) {
        System.out.printf("%.1f%n", vetor[i]);
      }
    }

    scanner.close();

  }
}
