package br.com.marianadmoreira.questao3.Decorator;

public abstract class Decorator implements Attack{
    private Attack attack;

    public Decorator(Attack attack){
        this.attack = attack;
    }

    public void execute(){
        attack.execute();
    }
}
