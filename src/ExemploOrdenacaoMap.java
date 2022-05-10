import java.util.*;

/*Dadas as seguintes informações sobre meus
livros favoritos, crie um dicionário e ordene-o, exibindo:
(Nome Autor - Nome Livro)
Azevedo, Álvares de - Noite na Taverna 86pg
King, Stephen - It, A Coisa 1213
Rowling, J.K. - Harry Potter e As Relíquias da Morte 684
Manson, Mark - A Sutil Arte de Ligar o F*da-se 204
Carlin, George - Brain Droppings 350
 */
public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Azevedo, Álvares de", new Livro("Noite na Taverna", 86));
            put("King, Stephen", new Livro("It, A Coisa", 1213));
            put("Rowling, J.K.", new Livro("Harry Potter e As Relíquias da Morte", 684));
            put("Manson, Mark", new Livro("A Sutil Arte de Ligar o F*da-se", 204));
            put("Carlin, George", new Livro("Brain Droppings", 350));
        }};
//1-Exibir em ordem aleatória:
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getTitulo());

//2-Exibir por ordem de inserção:
        Map<String, Livro> meusLivros1  = new LinkedHashMap<>(){{
            put("Azevedo, Álvares de", new Livro("Noite na Taverna", 86));
            put("King, Stephen", new Livro("It, A Coisa", 1213));
            put("Rowling, J.K.", new Livro("Harry Potter e As Relíquias da Morte", 684));
            put("Manson, Mark", new Livro("A Sutil Arte de Ligar o F*da-se", 204));
            put("Carlin, George", new Livro("Brain Droppings", 350));
        }};

        for (Map.Entry<String, Livro> livro: meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getTitulo());
//3-Exibir por ordem alfabética de autores:
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro: meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getTitulo());
//4-Exibir por ordem alfabética de títulos:
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorTitulo());
        meusLivros3.addAll(meusLivros.entrySet());
        System.out.println(meusLivros3);
//5-Exibir por ordem de número de páginas:
    }
}

class ComparatorTitulo implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getTitulo().compareToIgnoreCase(l2.getValue().getTitulo());
    }
}
