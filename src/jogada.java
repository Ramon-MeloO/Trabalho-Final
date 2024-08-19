public class jogada {
    public boolean jogada(int linha1, int coluna1, int linha2, int coluna2, Jogador jogador) {
        if (tabuleiro[linha1][coluna1].equals(tabuleiro[linha2][coluna2])) {
            jogador.adicionarPontos(1);
            System.out.println(jogador.getNome() + " encontrou um par! Pontos: " + jogador.getPontos());
            return true;
        } else {
            System.out.println(jogador.getNome() + " não encontrou um par.");
            return false;
        }

}
