import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExerciciosStreamApi {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("1-Imprima todos os elementos dessa lista:");
        numerosAleatorios.stream()
                .forEach(System.out::println);

        System.out.println("2-Pegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("3-Transforme esta lista de String numa lista de números inteiros:");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("4-Pegue os números pares e maiores que 2 e coloque numa lista:");
        List<Integer> listPares = collectList.stream()
                .filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());
        System.out.println(listPares);

        System.out.println("5-Mostre a média dos números:");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("6-Remova os valores ímpares:");
        collectList.removeIf(i -> (i %2 != 0));
        System.out.println(collectList);

        System.out.println("7-Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios.stream()
                        .skip(3)
                        .forEach(System.out::println);

        System.out.println("8- Retirando os números repetidos da lista, quantos ficam?");
        Set<String> collectSet = numerosAleatorios.stream()
                .collect(Collectors.toSet());
        System.out.println(collectSet.size());

    }
}
