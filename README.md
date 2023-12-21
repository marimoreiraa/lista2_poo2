# Lista 2 - Programação Orientada a Objetos 2


Leia a seguinte descricao de um sistema e faca o Ex. 1 e Ex. 2: 
Um texto é constituıdo por palavras. Quando o texto é apresentado, atraves do metodo render, cada palavra pode aparecer sem qualquer modificacao de aspecto (utiliza-se o metodo render correspondente). E ainda é possivel modificar dinamicamente o aspecto das palavras, permitindo que sejam apresentadas em negrito, italico, sublinhado, ou em combinacoes variadas (e.g. negrito e italico ou italico sublinhado, etc.). No entanto, a apresentacao é sempre realizada da mesma forma (sempre atraves do metodo render). Alem de apresentavel graficamente, um texto pode ser convertido numa cadeia de caracteres, contendo a sua informac¸ao textual (String). Esta operacao é realizada atraves do metodo text (invocado sobre cada um dos elementos designados acima). 

• Questao 1 – Qual o padrao de projeto é mais adequado para ser usado no desenvolvimento deste sistema? 
• Questao 2 - Implemente as classes que permitem representar o texto completo, as palavras, respectivas modificacoes graficas. Implemente uma aplicacao que ilustre o comportamento, representando as caracterısticas graficas, da seguinte forma: 
´´´
normal <span>normal </span> 
negrito <b>negrito </b>
italico <i > italico </ i > 
sublinhado <u>sublinhado </u>

´´´

Exercicio 3 - Faça a implementaçao de um jogo com um poder basico e mais tres poderes que melhoram este poder basico. 

• No game em desenvolvimento, deseja-se adicionar poderes dinamicamente ao ataque do personagem, em tempo de execuçao. 
• Alem disto, deseja-se ter a flexibilidade de extensao desta aplicacao sem modificacao do codigo existente. 
• Use o padrao xxxx para implementar este requisito, de forma que poderes podem melhorar o ataque em tempo  de execução
• Para isto e preciso que a estrategia que implementa um ataque (produto original) seja melhorada com poderes adicionais (xxx).
• Crie 3 poderes (xxx) para o ataque.
• Crie uma classe principal com um metodo main() para simular a execucao do jogo, decorando o ataque de um jogador em tempo de execução.


Dicas:
• Lembre-se que a abstracao do padrao e o componente a possuem o mesmo supertipo.
• Neste caso, necessariamente a abstraçao do padrao (interface ou classe abstrata) devera implementar a interface Component.
• Os poderes concretos (xxx) deverao implementar a abstracao do padrao. 
• É importante modelar o diagrama, pois agora estamos acoplando varios padroes, e é importante que se tenha claro o ponto de uniao entre eles. (OPCIONAL) 