package util;

public class CurrencyConverter {

  public static final double IOF = 0.06; 

  public static double calculadoraDolar(double cotacao, double pretencaoDeCompra) {
    double answer = cotacao * pretencaoDeCompra * (1 + IOF);
    return answer;
  }
}
