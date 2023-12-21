package br.com.marianadmoreira.questao2.Decorator;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private List<TextComponent> texts;

    public Sentence(){
        this.texts = new ArrayList<>();
    }

    public void addText(TextComponent text){
        texts.add(text);
    }

    public String toString(){
        StringBuilder saida = new StringBuilder();

        for(TextComponent text: texts){
            saida.append(text.render()).append("\n");
        }

        return saida.toString();
    }
    
}
