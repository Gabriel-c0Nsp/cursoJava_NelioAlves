import java.util.Scanner;
import java.util.Locale;

public class DadosPessoas {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantas pessoas serão digitadas? ");
    int quantidadePessoas = scanner.nextInt();

    double[] altura = new double[quantidadePessoas];
    char[] genero = new char[quantidadePessoas];

    double maiorAltura = Integer.MIN_VALUE;
    double menorAltura = Integer.MAX_VALUE;

    double soma = 0;
    double mediaAlturaMulheres = 0;

    int numeroHomens = 0;
    int numeroMulheres = 0;

    for (int i = 0; i < quantidadePessoas; i++) {
      System.out.print("Altura da " + (i + 1) + "º pessoa: ");
      altura[i] = scanner.nextDouble();
      genero[i] = scanner.next().charAt(0);

      if (altura[i] > maiorAltura) {
        maiorAltura = altura[i];
      }
      if (altura[i] < menorAltura) {
        menorAltura = altura[i];
      }

      if (genero[i] == 'M') {
        numeroHomens++;
      }

      if (genero[i] == 'F') {
        numeroMulheres++;
        soma += altura[i];
      }
    }

    mediaAlturaMulheres = soma / numeroMulheres;

    System.out.println("Menor altura = " + menorAltura);
    System.out.println("Maior altura = " + maiorAltura);

    System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAlturaMulheres);

    System.out.println("Número de homens = " + numeroHomens);

    scanner.close();

  }
}
