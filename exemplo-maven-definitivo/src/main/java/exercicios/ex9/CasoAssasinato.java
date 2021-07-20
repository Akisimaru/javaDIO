package exercicios.ex9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CasoAssasinato {

    public static void main(String[] args){
        List<Boolean> respostas = new ArrayList<>();

        System.out.println("1 - Telefonou para a vitima?");
        respostas.add(false);

        System.out.println("2 - Esteve no local do crime?");
        respostas.add(false);

        System.out.println("3 - Mora perto da vitima?");
        respostas.add(false);

        System.out.println("4 - Devia para a vitima?");
        respostas.add(false);

        System.out.println("5 - Ja trabahou com a vitima?");
        respostas.add(true);


        Iterator<Boolean> iterator = respostas.iterator();

        int contador = 0;
        while (iterator.hasNext()){
            if (iterator.next() == true){
                    contador ++;
            }
        }

        if (contador == 5){
            System.out.println("Assasino");
        }
        else if (contador >= 3){
            System.out.println("Cumplice");
        }
        else if (contador >= 2){
            System.out.println("Suspeita");
        }
        else{
            System.out.println("Inocente");
        }



    }
}
