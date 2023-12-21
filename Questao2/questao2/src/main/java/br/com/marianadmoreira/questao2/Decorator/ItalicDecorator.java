package br.com.marianadmoreira.questao2.Decorator;

public class ItalicDecorator extends Decorator{

    public ItalicDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    public String render() {
        return "<i>" + super.render() + "</i>";
    }

    
}
