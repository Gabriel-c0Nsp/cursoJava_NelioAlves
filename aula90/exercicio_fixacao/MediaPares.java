import java.util.Scanner;
import java.util.Locale;

public class MediaPares {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos elementos vai ter o vetor? ");
    int N = scanner.nextInt();

    int[] vetor = new int[N];

    int quantidadePares = 0;
    int somaPares = 0;
    double mediaPares = 0;

    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Digite um número: ");
      vetor[i] = scanner.nextInt();
      if (vetor[i] % 2 == 0) {
        quantidadePares++;
        somaPares += vetor[i];
      }
    }

    if (quantidadePares > 0) {
      mediaPares = somaPares / quantidadePares;
    }

    if (quantidadePares > 0) {
      System.out.printf("MÉDIA DOS PARES = %.1f%n", mediaPares);
    } else {
      System.out.println("NENHUM NÚMERO PAR");
    }

    scanner.close();

  }
}
