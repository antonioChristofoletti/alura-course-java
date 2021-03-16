package learning_java_8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Exercises_04 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);

        int years = now.getYear() - olimpiadasRio.getYear();
        System.out.println(years);
        
        Period period = Period.between(now, olimpiadasRio);
        System.out.println(period.getDays());

        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatador.format(proximasOlimpiadas));

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(DateTimeFormatter.ofPattern("hh mm").format(intervalo));

        LocalDate test = LocalDate.of(2099, Month.JANUARY, 25);

        Period eba = Period.between( now, test);

        System.out.println(eba.getDays());
        System.out.println(eba.getYears());

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(myFormatter.format(test));
    }
}