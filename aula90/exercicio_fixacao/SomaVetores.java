import java.util.Scanner;

public class SomaVetores {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos valores vai ter cada vetor? ");
    int N = scanner.nextInt();

    int[] A = new int[N];
    int[] B = new int[N];
    int[] C = new int[N];

    for (int i = 0; i < A.length; i++) {
      System.out.println("Digite os valores do vetor A:");
      A[i] = scanner.nextInt();
    }

    for (int i = 0; i < B.length; i++) {
      System.out.println("Digite os valores do vetor B:");
      B[i] = scanner.nextInt();
    }

    for (int i = 0; i < C.length; i++) {
      C[i] = A[i] + B[i];
    }

    System.out.println("VETOR RESULTANTE:");
    for (int x : C) {
      System.out.println(x);
    }

    scanner.close();

  }
}
