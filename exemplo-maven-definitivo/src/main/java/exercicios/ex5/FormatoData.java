package exercicios.ex5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatoData {
    public static void main(String[] args) {

        Date agora = new Date();
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/YYYY/HH/mm/ss/mmm");
        String dataformatada = formater.format(agora);


        System.out.println("Data: " + dataformatada);
    }
}
