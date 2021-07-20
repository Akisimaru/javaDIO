package exercicios.ex6;

import java.time.LocalDateTime;
import java.util.Calendar;

public class FuturoDoPassado {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.of(2010,5,15,10,0);
        LocalDateTime depois = agora.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println("Data: " + agora);
        System.out.println("Data: " + depois);
    }
}
