public class Main {
    public static void main(String[] args) {
        // Criando jogadores
        Jogador jogador1 = new Jogador("Alice");
        Jogador jogador2 = new Jogador("Bob");

        // Adicionando jogadores à lista
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(jogador1);
        jogadores.add(jogador2);

        // Criando o jogo
        Jogo jogo = new Jogo(jogadores);
        jogo.exibirTabuleiro();

        // Simulação de algumas jogadas
        jogo.jogada(0, 0, 1, 1, jogador1);
        jogo.jogada(0, 1, 1, 0, jogador2);
        jogo.jogada(0, 0, 1, 0, jogador3);
        jogo.jogada(1, 1, 1, 0, jogador4);
    }
}
