public class Jogo {
    private String[][] tabuleiro;
    private List<Jogador> jogadores;
    private int tamanhoTabuleiro = 4;

    // Construtor
    public Jogo(List<Jogador> jogadores) {
        this.jogadores = jogadores;
        this.tabuleiro = new String[tamanhoTabuleiro][tamanhoTabuleiro];
        inicializarTabuleiro();
}
