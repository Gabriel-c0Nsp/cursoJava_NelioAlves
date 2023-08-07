import java.util.Scanner;

public class NumerosPares {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos números você vai digitar? ");
    int N = scanner.nextInt();

    int[] pares = new int[N];
    int quantidadePares = 0;

    for (int i = 0; i < N; i++) {
      System.out.print("Digite um número: ");
      pares[i] = scanner.nextInt();

      if (pares[i] % 2 == 0) {
        quantidadePares++;
      }
    }

    System.out.println("NÚMEROS PARES:");
    for (int i = 0; i < N; i++) {
      if (pares[i] % 2 == 0) {
        System.out.print(pares[i] + " ");
      }
    }

    System.out.println();

    System.out.println("QUANTIDADE DE PARES = " + quantidadePares);

    scanner.close();

  }
}
