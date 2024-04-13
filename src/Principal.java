import br.com.cinesteam.calculos.CalculadoraDeTempo;
import br.com.cinesteam.modelos.Filme;
import br.com.cinesteam.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O podereso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avalizações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.retornaMedia());

        Serie friends = new Serie();
        friends.setNome("Friends");
        friends.setAnoDeLancamento(2000);
        friends.exibeFichaTecnica();
        friends.setTemporadas(10);
        friends.setEspisodiosPorTemporada(10);
        friends.setMinutosPorEspisodio(50);
        System.out.println("Duração para assitir: " + friends.getDuracaoEmMinutos());
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());
    }
}