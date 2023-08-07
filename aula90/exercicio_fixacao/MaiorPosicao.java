import java.util.Scanner;

public class MaiorPosicao {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos números você vai digitar? ");
    int N = scanner.nextInt();

    double maiorValor = Integer.MIN_VALUE;
    int posicaoMaiorValor = 0;

    double[] array = new double[N];

    for (int i = 0; i < array.length; i++) {
      System.out.print("Digite um número: ");
      array[i] = scanner.nextDouble();

      if (array[i] > maiorValor) {
        maiorValor = array[i];
        posicaoMaiorValor = i + 1;
      }
    }

    System.out.println("MAIOR VALOR = " + maiorValor);
    System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoMaiorValor);

    scanner.close();

  }
}
