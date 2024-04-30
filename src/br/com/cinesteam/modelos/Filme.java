package br.com.cinesteam.modelos;

import br.com.cinesteam.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private  String diretor;

    public Filme(String nome) {
        this.setNome(nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) retornaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
