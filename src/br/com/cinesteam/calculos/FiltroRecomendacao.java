package br.com.cinesteam.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Filme entre os preferidos no momento");
        } else if (classificavel.getClassificacao() >= 2 ) {
            System.out.println("Muito bem avaliado no moemento!");
        } else {
            System.out.println("Assista depois");
        }
    }
}
