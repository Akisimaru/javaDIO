package Exemplos.avancado.a5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InferenciaExemplo {


    public static void main(String[] args) throws IOException {
    //    var url = new URL("https://www.youtube.com/watch?v=wjOj_6cMGEY");
    //    var urlConnection = url.openConnection();
    //    var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

    //    System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">",">\n"));

        testar("Amogus", "Sussus");
    }

    public static void testar(String nome, String sobrenome){
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }
}
