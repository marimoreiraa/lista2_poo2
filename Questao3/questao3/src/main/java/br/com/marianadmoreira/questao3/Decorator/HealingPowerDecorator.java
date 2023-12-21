package br.com.marianadmoreira.questao3.Decorator;

public class HealingPowerDecorator extends Decorator{

    public HealingPowerDecorator(Attack attack) {
        super(attack);
    }

    public void execute(){
        super.execute();
        System.out.println("Acionando o poder de Cura!");
    }
    
}
