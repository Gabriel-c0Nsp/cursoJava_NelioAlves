import java.util.Scanner;

public class SomaVetor {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantos números você quer digitar?");
    int n = scanner.nextInt();

    double[] array = new double[n];
    double soma = 0;
    double media = 0;

    for (int i = 0; i < array.length; i++) {
      System.out.print("Digite um valor: ");
      array[i] = scanner.nextInt();
      soma += array[i];

    }

    media = soma / n;

    System.out.print("Valores = ");

    for (double x : array) {
      System.out.print(x + " ");
    }
    System.out.print("\n");

    System.out.println("soma = " + soma);
    System.out.println("MEDIA = " + media);

    scanner.close();

  }
}
