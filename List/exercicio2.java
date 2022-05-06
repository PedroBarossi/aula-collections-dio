/*Utilizando listas, faça um programa que faça 5
perguntas para uma pessoa sobre um crime. As perguntas são:
1- Telefonou para a vítima?
2- Esteve no local do crime?
3- Mora perto da vítima?
4- Devia para a vítima?
5- Já trabalhou com a vítima?
Se a pessoa responder positivamente a 2 questões, ela deve
ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
e 5 como "Assassina". Caso contrário, ela será classificada
como "Inocente"
 */
/*import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String investigado = "";

        System.out.println("Digite seu primeiro nome: ");
        investigado = teclado.nextLine();
        System.out.println("Você telefonou para a vítima?[S/N]");
        respostas.add(teclado.nextLine());
        System.out.println("Você esteve no local do crime?[S/N]");
        respostas.add(teclado.nextLine());
        System.out.println("Você mora perto da vítima?[S/N]");
        respostas.add(teclado.nextLine());
        System.out.println("Você devia para a vítima?[S/N]");
        respostas.add(teclado.nextLine());
        System.out.println("Você já trabalhou com a vítima?[S/N]");
        respostas.add(teclado.nextLine());

        Iterator<String> iterator = respostas.iterator();
        int contador = 0;

        while(iterator.hasNext()){
            if (iterator.next().equalsIgnoreCase("s")) contador++;
        }

        if (contador<=1) System.out.println("Baseado nas respostas, a IA classifica " + investigado + " como 'Inocente'");
        else if(contador==2) System.out.println("Baseado nas respostas, a IA classifica " + investigado + " como 'Suspeito'");
        else if (contador<=4) System.out.println("Baseado nas respostas, a IA classifica " + investigado + " como 'Cúmplice'");
        else System.out.println("Baseado nas respostas, a IA classifica " + investigado + " como 'Assassino'");
    }
}
*/