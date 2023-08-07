import java.util.Scanner;

public class Aprovados {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos alunos serão digitados? ");
    int quantidadeAlunos = scanner.nextInt();

    String[] nome = new String[quantidadeAlunos];
    double[] notaPrimeiroSemestre = new double[quantidadeAlunos];
    double[] notaSegundoSemestre = new double[quantidadeAlunos];
    double[] mediaAluno = new double[quantidadeAlunos];

    String[] alunosAprovados = new String[quantidadeAlunos];

    double soma = 0;
    double media = 0;

    for (int i = 0; i < quantidadeAlunos; i++) {
      System.out.println("Digite o nome, primeira e segunda nota do " + (i + 1) + "º aluno:");
      scanner.nextLine();
      nome[i] = scanner.nextLine();
      notaPrimeiroSemestre[i] = scanner.nextDouble();
      notaSegundoSemestre[i] = scanner.nextDouble();

      soma += notaPrimeiroSemestre[i] + notaSegundoSemestre[i];
      media = soma / 2;
      mediaAluno[i] = media;

      if (mediaAluno[i] >= 6) {
        alunosAprovados[i] = nome[i];
      }

    }

    System.out.println("Alunos aprovados:");

    for (int i = 0; i < quantidadeAlunos; i++) {
      System.out.println(alunosAprovados[i]);
    }

    scanner.close();

  }
}
