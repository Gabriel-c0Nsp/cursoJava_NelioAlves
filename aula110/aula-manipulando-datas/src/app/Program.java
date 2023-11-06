package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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

    // Formatando datas
    LocalDate data12 = LocalDate.parse("2023-11-21");

    DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt04 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt05 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
    DateTimeFormatter fmt06 = DateTimeFormatter.ISO_DATE_TIME;
    DateTimeFormatter fmt07 = DateTimeFormatter.ISO_INSTANT;

    System.out.println("data12 = " + data12.format(fmt03));
    System.out.println("data12 = " + fmt03.format(data12)); // outra forma de chamar
    System.out.println("data12 = " + data12.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // outra forma de chamar

    System.out.println("data05 = " + data05.format(fmt03));
    System.out.println("data05 = " + data05.format(fmt04));

    System.out.println("data06 = " + fmt05.format(data06));
    System.out.println("data05 = " + data05.format(fmt06));
    System.out.println("data06 = " + fmt07.format(data06));

    // Converter data global para local
    LocalDate resultado01 = LocalDate.ofInstant(data06, ZoneId.systemDefault()); // convertendo um instante para uma data local considerando 
                                                                                 // o padrão do máquina que está sendo usada  
    LocalDate resultado02 = LocalDate.ofInstant(data06, ZoneId.of("Portugal"));
    LocalDateTime resultado03 = LocalDateTime.ofInstant(data06, ZoneId.systemDefault());
    LocalDateTime resultado04 = LocalDateTime.ofInstant(data06, ZoneId.of("Portugal"));

    System.out.println("Resultado 1 = " + resultado01);
    System.out.println("Resultado 2 = " + resultado02);
    System.out.println("Resultado 3 = " + resultado03);
    System.out.println("Resultado 4 = " + resultado04);
    

    // Obter dados de uma data-hora local
    System.out.println("data04 = " + data04.getDayOfMonth());
    System.out.println("data04 = " + data04.getMonthValue());
    System.out.println("data04 = " + data04.getYear());

    System.out.println("data05 = " + data05.getHour());
    System.out.println("data05 = " + data05.getMinute());

    // Cálculos com data-hora
    LocalDate pastWeekLocalDate = data04.minusDays(7);
    LocalDate nextWeekLocalDate = data04.plusDays(7);

    System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
    System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

    LocalDateTime pastWeekLocalDateTime = data05.minusDays(7);
    LocalDateTime nextWeekLocalDateTime = data05.plusDays(7);
    LocalDateTime nextWeekLocalDateTimeHours = data05.plusHours(7);

    System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
    System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
    System.out.println("nextWeekLocalDateTimeHours = " + nextWeekLocalDateTimeHours);

    Instant pastWeekInstant = data06.minus(7, ChronoUnit.DAYS);
    Instant pastNextInstant = data06.plus(7, ChronoUnit.DAYS);

    System.out.println("pastWeekInstant = " + pastWeekInstant);
    System.out.println("pastNextInstant = " + pastNextInstant);

    Duration time01 = Duration.between(pastWeekLocalDate.atTime(0, 0), data04.atTime(0, 0)); // convertendo para localDateTime pois LocalDate
                                                                                             // não suporta segundos
                                                                                              
    // Duration time01 = Duration.between(pastWeekLocalDate.atStartOfDay(), data04.atStartOfDay()); // outra forma de fazer a conversão
    Duration time02 = Duration.between(pastWeekLocalDateTime, data05);
    Duration time03 = Duration.between(pastWeekInstant, data06);

    System.out.println("time01 dias = " + time01.toDays());
    System.out.println("time02 dias = " + time02.toDays());
    System.out.println("time03 dias = " + time03.toDays());

  }
}
