import java.util.Locale;
import java.util.Scanner;

public class Alturas {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantas pessoas serão digitadas? ");
    int N = scanner.nextInt();

    String[] nome = new String[N];
    int[] idade = new int[N];
    double[] altura = new double[N];

    double soma = 0;
    double alturaMedia = soma / N;

    int pessoasMenores16 = 0;
    double porcentagemMenores16 = 0;

    for (int i = 0; i < N; i++) {
      System.out.println("Dados da " + (i + 1) + "º pessoa");
      System.out.print("Nome: ");
      nome[i] = scanner.next();
      System.out.print("Idade: ");
      idade[i] = scanner.nextInt();
      System.out.print("Altura: ");
      altura[i] = scanner.nextDouble();

      if (idade[i] < 16) {
        pessoasMenores16++;
      }

      soma += altura[i];
    }

    alturaMedia = soma / N;
    porcentagemMenores16 = (pessoasMenores16 * 100) / N;

    System.out.printf("Altura média: %.2f%n", alturaMedia);
    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenores16);

    System.out.println();

    for (int i = 0; i < N; i++) {
      if (idade[i] < 16) {
        System.out.println(nome[i]);
      }
    }

    scanner.close();

  }
}
