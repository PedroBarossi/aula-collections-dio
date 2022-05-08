/*Dadas as seguintes informações sobre minhas séries
favoritas

Agents Of S.H.I.E.L.D. ficção 40
Supernatural terror/comédia 50
Scrubs comédia/drama 20
 */

/*
import java.util.*;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Agents of S.H.I.E.L.D.", "ficção", 40));
            add(new Serie("Supernatural", "terror/comédia", 50));
            add(new Serie("Scrubs", "comédia/drama", 20));
        }};


//1-Exibir em ordem aleatória:
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

//2-Exibir em ordem de inserção:
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("Agents of S.H.I.E.L.D.", "ficção", 40));
            add(new Serie("Supernatural", "terror/comédia", 50));
            add(new Serie("Scrubs", "comédia/drama", 20));
        }};

        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

//3-Exibir em ordem natural (tempo de episódio):
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


//4-Exibir em ordem natural (nome - gênero - tempo):
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie: minhasSeries4) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        

//5-Exibir em ordem natural (gênero):
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorGenero());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie: minhasSeries5) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

//6-Exibir em ordem natural (nome):
        Set<Serie> minhasSeries6 = new TreeSet<>(new ComparatorNome());
        minhasSeries6.addAll(minhasSeries);
        for (Serie serie: minhasSeries6) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

    }
}

class ComparatorNomeGeneroTempo implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}

class ComparatorGenero implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getGenero().compareToIgnoreCase(s2.getGenero());
    }
}

class ComparatorNome implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getNome().compareToIgnoreCase(s2.getNome());
    }
}

*/