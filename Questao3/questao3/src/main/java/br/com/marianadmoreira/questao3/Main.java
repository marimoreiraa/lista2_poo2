package br.com.marianadmoreira.questao3;

import br.com.marianadmoreira.questao3.Decorator.Attack;
import br.com.marianadmoreira.questao3.Decorator.Basic;
import br.com.marianadmoreira.questao3.Decorator.FirePowerDecorator;
import br.com.marianadmoreira.questao3.Decorator.HealingPowerDecorator;
import br.com.marianadmoreira.questao3.Decorator.SpeedPowerDecorator;

public class Main {
    public static void main(String[] args) {
        Attack basiAttack = new Basic();

        Attack newAttacks = new FirePowerDecorator(new SpeedPowerDecorator(new HealingPowerDecorator(basiAttack)));

        newAttacks.execute();
    }
}