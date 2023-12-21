package br.com.marianadmoreira.questao3.Decorator;

public class SpeedPowerDecorator extends Decorator{

    public SpeedPowerDecorator(Attack attack) {
        super(attack);
    }

    public void execute(){
        super.execute();
        System.out.println("Acionando super velocidade!");
    }

    
}
