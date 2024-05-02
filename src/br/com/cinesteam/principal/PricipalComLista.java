package br.com.cinesteam.principal;

import br.com.cinesteam.modelos.Filme;
import br.com.cinesteam.modelos.Serie;
import br.com.cinesteam.modelos.Titulo;

import java.util.*;

public class PricipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme filmeDoKaio = new Filme("Bad Boys", 2003);
        Filme filmeDoMomento = new Filme("Civil War", 2024);
        Serie friends = new Serie("Friends", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoKaio);
        filmeDoKaio.avalia(10);
        lista.add(meuFilme);
        meuFilme.avalia(6);
        lista.add(filmeDoMomento);
        filmeDoMomento.avalia(10);
        lista.add(friends);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscarPorArtistas = new ArrayList<>();
        buscarPorArtistas.add("Adam Sandler");
        buscarPorArtistas.add("Paul Walker");
        buscarPorArtistas.add("Jhon");

        Collections.sort(buscarPorArtistas);
        System.out.println("Depois da Ordenação");
        System.out.println(buscarPorArtistas);

        Collections.sort(buscarPorArtistas);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
