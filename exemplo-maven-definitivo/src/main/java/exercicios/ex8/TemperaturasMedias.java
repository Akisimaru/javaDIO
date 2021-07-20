package exercicios.ex8;



import java.util.*;

public class TemperaturasMedias {

        public static void main(String[] args){
            List<exercicios.ex8.TempSemestrais> temperaturas = new ArrayList<>(){{
                add(new TempSemestrais("Janeiro", 18d));
                add(new TempSemestrais("Fevereiro", 34.5));
                add(new TempSemestrais("Marco", 12.6));
                add(new TempSemestrais("Abril", 25.3));
                add(new TempSemestrais("Maio", 40.9));
                add(new TempSemestrais("Junho", 9.7));

            }};

            Iterator<TempSemestrais> iterator = temperaturas.iterator();

            double mediaSemestral = 0d;

            while (iterator.hasNext()){
                TempSemestrais next = iterator.next();
                mediaSemestral += next.getTemperatura();

            }
            mediaSemestral = mediaSemestral / temperaturas.size();

            System.out.println(temperaturas);
            System.out.println(mediaSemestral);

            Iterator<TempSemestrais> iterator2 = temperaturas.iterator();
            while (iterator2.hasNext()){
                TempSemestrais temperaturaAtual = iterator2.next();
                if (temperaturaAtual.getTemperatura() > mediaSemestral){
                    System.out.println ("O mes - " + temperaturaAtual.getMes() + " - esta acima da media   ( " + temperaturaAtual.getTemperatura() + " | " + mediaSemestral + " )");
                }

            }

        }


    }

    class TempSemestrais{
        private String mes;
        private double temperatura;

        public TempSemestrais (String mes, double temperatura){
            this.mes = mes;
            this.temperatura = temperatura;

        }

        public String getMes() {
            return mes;
        }

        public double getTemperatura() {
            return temperatura;
        }

        @Override
        public String toString() {
            return "TempSemestrais{" +
                    "mes='" + mes + '\'' +
                    ", temperatura=" + temperatura +
                    '}' + '\n';
        }
    }





