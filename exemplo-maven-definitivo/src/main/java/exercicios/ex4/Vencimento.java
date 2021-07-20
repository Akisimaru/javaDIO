package exercicios.ex4;

import java.util.Calendar;
import java.util.Date;

public class Vencimento {

    public static void main(String[] args) {

        Calendar dataCobranca = Calendar.getInstance();
        dataCobranca.add(Calendar.DATE, 4);
        Calendar dataVencimento = Calendar.getInstance();
        dataVencimento.add(Calendar.DATE, 14);



        System.out.println("Dia da semana: " + dataCobranca.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia da semana: " + dataVencimento.get(Calendar.DAY_OF_WEEK));



        System.out.println("Cobranca: " + dataCobranca.getTime());


        if (dataVencimento.get(Calendar.DAY_OF_WEEK) == 1) {
            dataVencimento.add(Calendar.DATE, 1);

        } else if (dataVencimento.get(Calendar.DAY_OF_WEEK) == 7) {
            dataVencimento.add(Calendar.DATE, 2);
        }

        System.out.println("Vencimento: " + dataVencimento.getTime());

        System.out.println("Data: " + dataVencimento.getTime());
    }
}