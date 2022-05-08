/*Criar uma classe LinguagemFavorita que possua os atributos nome, ano de criação, e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
A: Ordem de inserção
B: Ordem natural (nome)
C: IDE
D: Ano de criação e nome
E: Nome, ano de criação e IDE
Ao final, exiba as linguagens no console, uma abaixo da outra
 */
/*
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
           add(new LinguagemFavorita("HTML", 1993, "Visual Studio Code"));
           add(new LinguagemFavorita("CSS", 1996, "Notepad++"));
           add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
        }};
        //A:
        System.out.println("Ordem de inserção");
        for (LinguagemFavorita linguagem: linguagens) System.out.println(linguagem.toString());
        //B:
        System.out.println("Ordem natural (nome)");
        Set<LinguagemFavorita> linguagens1 = new TreeSet<>(linguagens);
        for (LinguagemFavorita linguagem: linguagens1) System.out.println(linguagem.toString());
        //C:
        System.out.println("Por ordem de IDE");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(new ComparatorIde());
        linguagens2.addAll(linguagens1);
        for (LinguagemFavorita linguagem: linguagens2) System.out.println(linguagem.toString());
        //D:
        System.out.println("Por ordem de ano de criação + nome");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorAnoNome());
        linguagens3.addAll(linguagens1);
        for (LinguagemFavorita linguagem: linguagens3) System.out.println(linguagem.toString());
        //E:
        System.out.println("Por ordem de nome, ano de criação e IDE");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagens4.addAll(linguagens1);
        for (LinguagemFavorita linguagem: linguagens4) System.out.println(linguagem.toString());
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ano = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if (ano != 0) return ano;

        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome !=0) return nome;

        int ano = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if (ano !=0) return ano;

        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
}

 */