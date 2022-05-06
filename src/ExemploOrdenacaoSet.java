/*Dadas as seguintes informações sobre minhas séries
favoritas

Agents Of S.H.I.E.L.D. ficção 40
Supernatural terror/comédia 50
Scrubs comédia/drama 20
 */


import java.util.HashSet;
import java.util.Set;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Agents of S.H.I.E.L.D.", "ficção", 40));
            add(new Serie("Supernatural", "terror/comédia", 50));
            add(new Serie("Scrubs", "comédia/drama", 20));
        }};
        System.out.println(minhasSeries);

//1-Exibir em ordem aleatória:

    }
}

