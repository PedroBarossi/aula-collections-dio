/*Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as numa lista.
Após isto, calcule a média semestral das temperaturas e mostre
todas as que estiverem acima dessa média e em que mês elas
ocorreram (nome do mês por extenso)
 */

/*import java.text.DateFormatSymbols;
import java.util.*;

public class exercicio {
    public static void main(String[] args) {
        List<Float> temperaturas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        for (int c=1; c<=6; c++) {
            System.out.println("Digite a temperatura do mês " + c + ":");
            temperaturas.add(teclado.nextFloat());
        }
        System.out.println(temperaturas);
        //calculando a média
        Iterator<Float> iterator = temperaturas.iterator();
        float soma = 0f;
        float media, next;

        while (iterator.hasNext()){
            next = iterator.next();
            soma += next;
        }

        media = soma/ temperaturas.size();

        System.out.println("A média das temperaturas é " + media);

        //exibindo as temperaturas acima da média
        int i = 1;
        Iterator<Float> iterator2 = temperaturas.iterator();
        String[] meses = new DateFormatSymbols(new Locale("pt", "BR")).getMonths();

        while (iterator2.hasNext()) {
            next = iterator2.next();

            if (next>media) System.out.println("O mês de " + meses[i] + " apresentou a temperatura acima da média " + next);

            i++;
        }

    }
}*/
