package br.com.marianadmoreira.questao3.Decorator;

public class FirePowerDecorator extends Decorator{

    public FirePowerDecorator(Attack attack) {
        super(attack);
    }

    public void execute(){
        super.execute();
        System.out.println("Acionando Poder de Fogo!");
    }
    
}
