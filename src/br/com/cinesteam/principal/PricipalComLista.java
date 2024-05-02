package br.com.cinesteam.principal;

import br.com.cinesteam.modelos.Filme;
import br.com.cinesteam.modelos.Serie;
import br.com.cinesteam.modelos.Titulo;

import java.util.ArrayList;

public class PricipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme filmeDoKaio = new Filme("Bad Boys", 2003);
        Filme filmeDoMomento = new Filme("Civil War", 2024);
        Serie friends = new Serie("Friends", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
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
    }
}
