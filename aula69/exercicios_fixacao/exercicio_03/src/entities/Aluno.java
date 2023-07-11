package entities;

public class Aluno {

  public String nome;
  public double nota1;
  public double nota2;
  public double nota3;

  public double notaFinal() {
    double answer = nota1 + nota2 + nota3;
    return answer;
  }  

  public void vereditoFinal (double margemParaPassar) {
  if (notaFinal() >= 60) {
      System.out.println("Nota final: " + notaFinal());
      System.out.println("APROVADO");
    }
    else {
      System.out.println("Nota final: " + notaFinal());
      System.out.println("REPROVADO");
      margemParaPassar = 60 - notaFinal();
      System.out.println("Faltando: " + margemParaPassar);
    }
  }
}
