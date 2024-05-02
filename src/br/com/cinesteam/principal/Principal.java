package br.com.cinesteam.principal;

import br.com.cinesteam.calculos.CalculadoraDeTempo;
import br.com.cinesteam.calculos.FiltroRecomendacao;
import br.com.cinesteam.modelos.Episodio;
import br.com.cinesteam.modelos.Filme;
import br.com.cinesteam.modelos.Serie;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avalizações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.retornaMedia());

        Serie friends = new Serie("Friends", 2000);
        friends.exibeFichaTecnica();
        friends.setTemporadas(10);
        friends.setEspisodiosPorTemporada(10);
        friends.setMinutosPorEspisodio(50);
        System.out.println("Duração para assitir: " + friends.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(friends);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(friends);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoKaio = new Filme("Bad Boys", 2003);
        filmeDoKaio.setDuracaoEmMinutos(200);
        filmeDoKaio.avalia(10);

        Filme filmeDoMomento = new Filme("Civil War", 2024);
        filmeDoMomento.setDuracaoEmMinutos(200);



        ArrayList<Filme> listaDeFimes = new ArrayList<>();
        listaDeFimes.add(filmeDoKaio);
        listaDeFimes.add(meuFilme);
        listaDeFimes.add(filmeDoMomento);
        System.out.println("Tamanho da lista " + listaDeFimes.size());
        System.out.println("Primeiro filme " + listaDeFimes.get(0).getNome());
        System.out.println(listaDeFimes);


    }
}