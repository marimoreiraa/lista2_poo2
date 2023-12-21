package br.com.marianadmoreira.questao2.Decorator;

public class BoldDecorator extends Decorator {
    public BoldDecorator(TextComponent textComponent){
        super(textComponent);
    }

    public String render(){
        return "<b>" + super.render() + "</b>";
    }

    
}
