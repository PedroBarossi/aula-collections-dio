import java.util.*;

/*
Dada a população estimada de alguns estados do NE
brasileiro, faça:
PE 9616621
AL 3351543
CE 9187103
RN 3534265
 */
public class Exercicio1 {
    public static void main(String[] args) {
//Crie um dicionário e relacione os estados e suas populações
        Map<String, Integer> estadosNordeste = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosNordeste);
//Substitua a população do estado do RN por 3534165
        estadosNordeste.put("RN", 3534165);
        System.out.println(estadosNordeste);
//Confira se o estado PB está no dicionário,
//caso contrário, adicione PB - 4039277
        if (!estadosNordeste.containsKey("PB")) estadosNordeste.put("PB", 4039277);
        System.out.println(estadosNordeste);
//Exiba a população de PE
        System.out.println(estadosNordeste.get("PE"));
//Exiba todos os estados e suas populações na ordem em que foram informados:
        Map<String, Integer> estadosNordeste1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(estadosNordeste1);
//Exiba todos os estados e suas populações em ordem alfabética:
        Map<String, Integer> estadosNordeste2 = new TreeMap<>(estadosNordeste1);
        System.out.println(estadosNordeste2);
//Exiba o estado com a menor população e sua quantidade:
        int menorPop = Collections.min(estadosNordeste1.values());
        String estadoMenorPop = "";
        Set<Map.Entry<String, Integer>> entries = estadosNordeste1.entrySet();
        for (Map.Entry<String, Integer> entry: entries){
            if (entry.getValue().equals(menorPop)){
                estadoMenorPop = entry.getKey();
                System.out.println("Estado menos populoso: " + estadoMenorPop + ", população: " + menorPop);
            }
        }
//Exiba o estado com a maior população e sua quantidade:
        int maiorPop = Collections.max(estadosNordeste1.values());
        String estadoMaiorPop = "";
        for (Map.Entry<String, Integer> entry: entries){
            if (entry.getValue().equals(maiorPop)){
                estadoMaiorPop = entry.getKey();
                System.out.println("Estado mais populoso: " + estadoMaiorPop + ", população: " + maiorPop);
            }
        }
//Exiba a soma da população desses estados:
        int soma = 0;
        Iterator<Integer> iterator = estadosNordeste1.values().iterator();
        while (iterator.hasNext()) soma += iterator.next();
        System.out.println(soma);
//Exiba a média da população deste dicionário de estados:
        System.out.println(soma / estadosNordeste1.size());
//Remova os estados com a população menor que 4 milhões:
        Iterator<Integer> iterator1 = estadosNordeste1.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() < 4000000) iterator1.remove();
        }
        System.out.println(estadosNordeste1);
//Apague todas as entradas do dicionário:
        estadosNordeste.clear();
//Confira se o dicionário está vazio:
        System.out.println(estadosNordeste.isEmpty());

    }

}
