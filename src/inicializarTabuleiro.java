public class inicializarTabuleiro {
    // Criando pares de cartas
    List<String> cartas = new ArrayList<>();
        for (int i = 0; i < (tamanhoTabuleiro * tamanhoTabuleiro) / 2; i++) {
        String carta = "Carta" + (i + 1);
        cartas.add(carta);
        cartas.add(carta);
    }

    // Embaralhando as cartas
        Collections.shuffle(cartas);

    // Preenchendo o tabuleiro com as cartas embaralhadas
    int index = 0;
        for (int i = 0; i < tamanhoTabuleiro; i++) {
        for (int j = 0; j < tamanhoTabuleiro; j++) {
            tabuleiro[i][j] = cartas.get(index);
            index++;
        }
    }
}
