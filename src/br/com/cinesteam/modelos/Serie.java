package br.com.cinesteam.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private boolean ativa;
    private int espisodiosPorTemporada;
    private int minutosPorEspisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEspisodiosPorTemporada() {
        return espisodiosPorTemporada;
    }

    public void setEspisodiosPorTemporada(int espisodiosPorTemporada) {
        this.espisodiosPorTemporada = espisodiosPorTemporada;
    }

    public int getMinutosPorEspisodio() {
        return minutosPorEspisodio;
    }

    public void setMinutosPorEspisodio(int minutosPorEspisodio) {
        this.minutosPorEspisodio = minutosPorEspisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * espisodiosPorTemporada * minutosPorEspisodio;
    }
}
