package br.com.marianadmoreira.questao2.Decorator;

public class Text implements TextComponent {
    private String content;

    public Text(String content){
        this.content = content;
    }

    public String render(){
        return content;
    }

}
