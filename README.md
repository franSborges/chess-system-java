# Jogo de Xadrez em Java

Este é um projeto de jogo de xadrez em Java que foi desenvolvido como parte de um curso de programação. O jogo de xadrez é implementado seguindo as regras tradicionais do xadrez e permite que dois jogadores joguem em um único computador.

## Funcionalidades

- Tabuleiro de xadrez 8x8 com todas as peças tradicionais (rei, rainha, torre, bispo, cavalo e peão).
- Movimentos legais de todas as peças de acordo com as regras do xadrez.
- Verificação de xeque e xeque-mate.
- Promoção de peões para rainhas quando alcançam a oitava fileira do tabuleiro.
- Rastreamento de movimentos e histórico do jogo.
- Detecção de empate por afogamento e regra das três repetições.

## Como Jogar

1. Clone este repositório para o seu computador.

   ```
   git clone https://github.com/seu-usuario/seu-projeto-xadrez-java.git
   ```
   
2. Rode o projeto usando a IDE IntelliJ IDEA Community ou VS Code

   Ou
   
4. Compile e execute o jogo a partir da linha de comando.
   
   ```
   cd seu-projeto-xadrez-java
   javac Main.java
   java Main
   ```
   
5. Siga as instruções no console para jogar. Use as coordenadas no formato "linha-coluna" para fazer seus movimentos (por exemplo, "e2 e4" move um peão branco).

## Capturas de Tela

![Captura de Tela 1](https://github.com/franSborges/chess-system-java/blob/main/chess/Captura%20de%20tela%202023-10-06%20155528.png)

<p align = "center">
  <img min-width = "1000" height = "420" src = "">
</p>

## Estrutura do Projeto

- `Main.java`: O ponto de entrada do jogo.
- `ChessBoard.java`: A classe que representa o tabuleiro de xadrez e contém a lógica principal do jogo.
- `Piece.java`: A classe abstrata que representa uma peça de xadrez genérica.
- Outros arquivos: Outras classes e recursos necessários para o funcionamento do jogo.

## Contribuição

Sinta-se à vontade para contribuir para este projeto aberto. Você pode reportar problemas, propor melhorias e enviar solicitações de pull.
