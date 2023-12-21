package br.com.marianadmoreira.questao2.Decorator;

public class UnderlineDecorator extends Decorator {

    public UnderlineDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    public String render() {
        return "<u>" + super.render() + "</u>";
    }

    
}
