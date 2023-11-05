package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
  public static void main(String[] args) {

    // Instanciação 

    DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    // Data hora de agora
    LocalDate data01 = LocalDate.now();
    LocalDateTime data02 = LocalDateTime.now();
    Instant data03 = Instant.now();

    System.out.println("data01 = " + data01);
    System.out.println("data02 = " + data02);
    System.out.println("data03 = " + data03);

    // Texto ISO 8601
    LocalDate data04 = LocalDate.parse("2023-11-21");
    LocalDateTime data05 = LocalDateTime.parse("2023-11-21T01:30:26");
    Instant data06 = Instant.parse("2023-11-21T01:30:26Z");
    Instant data07 = Instant.parse("2023-11-21T01:30:26-04:00");

    System.out.println("data04 = " + data04);
    System.out.println("data05 = " + data05);
    System.out.println("data06 = " + data06);
    System.out.println("data07 = " + data07);

    // Texto no formato customizado
    
    LocalDate data08 = LocalDate.parse("20/11/2023", fmt01);
    LocalDateTime data09 = LocalDateTime.parse("20/11/2023 11:23", fmt02);
    LocalDate data10 = LocalDate.parse("21/12/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy")); // outra forma de fazer a instanciação
    LocalDate data11 = LocalDate.of(2023, 11, 05);

    System.out.println("data08 = " + data08);
    System.out.println("data09 = " + data09);
    System.out.println("data10 = " + data10);
    System.out.println("data11 = " + data11);

  }
}
