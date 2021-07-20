package Exemplos.avancado.paralelia;

import java.util.Set;

public class ThreadExemplo {
    public static void main(String[] args) {
        GeradorPDF iniciarGeradorPdf = new GeradorPDF();
        BarraDeCarregamento iniciarBarraCarregar = new BarraDeCarregamento(iniciarGeradorPdf);

        iniciarGeradorPdf.start();
        iniciarBarraCarregar.start();
    }

}




class GeradorPDF extends Thread{


    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Gerar PDF");
    }
}



class BarraDeCarregamento extends Thread {

    private Thread iniciarGeradorPdf;

    public BarraDeCarregamento(Thread iniciarGeradorPdf) {
        this.iniciarGeradorPdf = iniciarGeradorPdf;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
                if (iniciarGeradorPdf.isAlive() == false){
                    break;
                }
                System.out.println("Loading....");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}

