package exercicios.ex1;

public class Carro {

    private Integer passageiros = 2;


    public Integer getPassageiros(){ return passageiros; }

    public Integer setPassageiros(Integer passageiros) {
        this.passageiros = passageiros;
        return passageiros;
    }

    public Integer colocarNovoPassageiro(){ return setPassageiros(passageiros + 1);}

    public Integer tirarPassageiro(){ return setPassageiros(passageiros - 1);}

}
