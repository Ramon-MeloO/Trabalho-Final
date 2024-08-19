public class Jogador {
    private String nome;
    private int pontos;

    // Construtor
    public Jogador(String nome) {
        this.nome = nome;
        this.pontos = 0;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    // Método para adicionar pontos
    public void adicionarPontos(int pontos) {

        this.pontos += pontos;
    }
}
