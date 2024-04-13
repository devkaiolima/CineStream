package br.com.cinesteam.calculos;

import br.com.cinesteam.modelos.Filme;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }
}
