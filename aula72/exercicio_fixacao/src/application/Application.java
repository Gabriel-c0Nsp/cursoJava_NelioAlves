package application;

import java.util.Scanner;
import java.util.Locale;

import util.CurrencyConverter;

public class Application {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    double cotacao = 0;
    double pretencaoDeCompra = 0;

    System.out.println("Qual a cotação atual do dólar?");
    cotacao = scanner.nextDouble();

    System.out.println("Quantos dólares você pretende comprar?");
    pretencaoDeCompra = scanner.nextDouble();

    double resultado = CurrencyConverter.calculadoraDolar(cotacao, pretencaoDeCompra);
    System.out.printf("Valor a ser pago em reais: R$ %.2f%n", resultado);

    scanner.close();

  }
}
