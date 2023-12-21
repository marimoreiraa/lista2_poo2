package br.com.marianadmoreira.questao2.Decorator;

public abstract class Decorator implements TextComponent{
    private TextComponent textComponent;

    public Decorator(TextComponent textComponent){
        this.textComponent= textComponent;
    }

    public String render(){
        return textComponent.render();
    }
}
