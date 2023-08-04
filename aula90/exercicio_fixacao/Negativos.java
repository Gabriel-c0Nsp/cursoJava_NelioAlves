import java.util.Scanner;

public class Negativos {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos números você vai digitar? ");
    int N = scanner.nextInt();

    boolean valorValido = false;

    if (N > 10) {
      valorValido = false;
    } else {
      valorValido = true;
    }

    int[] array = new int[N];
    int contador = N;

    while (valorValido == true) {
      for (int i = 0; i < array.length; i++) {
        System.out.print("Digite um número: ");
        array[i] = scanner.nextInt();
        contador--;
        if (contador == 0) {
          valorValido = false;
        }
      }
    }

    System.out.println("NÚMEROS NEGATIVOS:");

    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        System.out.println(array[i]);
      } else {
        continue;
      }
    }

    scanner.close();

  }
}
