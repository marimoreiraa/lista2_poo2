package br.com.marianadmoreira.questao2;

import br.com.marianadmoreira.questao2.Decorator.*;

public class Main {
    public static void main(String[] args) {
        Sentence sentence = new Sentence();

        sentence.addText(new Text("normal"));
        sentence.addText(new BoldDecorator(new Text("negrito")));
        sentence.addText(new ItalicDecorator(new Text("italico")));
        sentence.addText(new UnderlineDecorator(new Text("sublinhado")));

        sentence.addText(new BoldDecorator(new ItalicDecorator(new Text("negrito e italico"))));
        sentence.addText(new UnderlineDecorator(new ItalicDecorator(new Text("sublinhado e italico"))));
        sentence.addText(new BoldDecorator(new UnderlineDecorator(new Text("negrito e sublinhado"))));

        System.out.println(sentence.toString());

    }
}