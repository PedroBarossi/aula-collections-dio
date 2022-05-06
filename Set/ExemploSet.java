/*Dada uma lista com 7 notas dum aluno
[7, 8.5, 9.3, 5, 7, 0, 3.6], faça:*/
/*
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
//1-Crie um conjunto e adicione as notas
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

//2-Exiba a posição da nota 5:
        //Não é possível no Set

//3-Adicione na lista a nota 8 na posição 4:
        //Não é possível no Set

//4-Substitua a nota 5 pela nota 6:
        //Não é possível no Set

//5-Confira se a nota 5 está no conjunto:
        System.out.println(notas.contains(5d));

//6-Exiba a terceira nota adicionada:
        //Não é possível no Set

//7-Exiba a menor nota:
        System.out.println(Collections.min(notas));

//8-Exiba a maior nota:
        System.out.println(Collections.max(notas));

//9-Exiba a soma dos valores:
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        Double next = 0d;
        while(iterator.hasNext()){
            next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

//10-Exiba a média das notas:
        System.out.println(soma/notas.size());

//11-Remova a nota 0:
        notas.remove(0d);
        System.out.println(notas);

//12-Remova a nota da posição 0:
        //Não é possível no Set

//13-Remova as notas menores que 7 e exiba a lista:
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            next = iterator2.next();
            if (next<7) iterator2.remove();
        }
        System.out.println(notas);

//14-Exiba todas as notas na ordem em que foram inseridas:
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        //notas2.add(7d); impossível inserir elementos iguais num Set
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

//15-Exiba todas as notas na ordem crescente:
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

//14-Apague todo o conjunto:
        notas.clear();

//15-Confira se o conjunto está vazio:
        System.out.println(notas.isEmpty());

//16-Confira se o conjunto 2 está vazio:
        System.out.println(notas2.isEmpty());

    }
}*/
