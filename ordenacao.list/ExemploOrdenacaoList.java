package ordenacao.list;/*Dadas as seguintes informações sobre seus cachorros,
crie uma lista e ordene-a exibindo:
(nome-idade-cor);

ordenacao.list.Cachorro 1 = Amora, 5, amarela
ordenacao.list.Cachorro 2 = Luna, 2, caramelo
ordenacao.list.Cachorro 3 = Bidu, 13, caramelo
ordenacao.list.Cachorro 4  = Luna, 11, branca
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ExemploOrdenacaoList {
    public static void velhomain {

        //criação da lista e inserção de dados
        List<Cachorro> meusDogs = new ArrayList<>(){{
            add(new Cachorro("Amora",5,"amarela"));
            add(new Cachorro("Luna",1,"caramelo"));
            add(new Cachorro("Bidu",13,"caramelo"));
            add(new Cachorro("Luna",11,"branca"));
        }};

        //1-Exibir lista por ordem de inserção:
        System.out.println(meusDogs);

        //2-Exibir lista em ordem aleatória:
        Collections.shuffle(meusDogs);
        System.out.println(meusDogs);

        //3-Exibir lista por ordem natural (nome):
        Collections.sort(meusDogs);
        System.out.println(meusDogs);

        //4-Exibir lista por ordem de idade:
        Collections.sort(meusDogs, new ComparatorIdade());
        System.out.println(meusDogs);

        //5-Exibir lista por ordem de cor:
        meusDogs.sort(new ComparatorCor());
        System.out.println(meusDogs);

        //6-Exibir lista por nome-cor-idade:
        meusDogs.sort(new ComparatorNomeCorIdade());
        System.out.println(meusDogs);

    }
}

class Cachorro implements Comparable<Cachorro>{
    private String nome;
    private Integer idade;
    private String cor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Cachorro(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
//Para permitir a comparação de Strings
    @Override
    public int compareTo(Cachorro cachorro) {
        return this.getNome().compareToIgnoreCase(cachorro.getNome());
    }
}

class ComparatorIdade implements Comparator<Cachorro> {

    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        return Integer.compare(c1.getIdade(), c2.getIdade());
    }
}

class ComparatorCor implements Comparator<Cachorro> {

    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        return c1.getCor().compareToIgnoreCase(c2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Cachorro> {

    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        int nome = c1.getNome().compareToIgnoreCase(c2.getNome());
        if (nome != 0) return nome;

        int cor = c1.getCor().compareToIgnoreCase(c2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(c1.getIdade(), c2.getIdade());
    }
}