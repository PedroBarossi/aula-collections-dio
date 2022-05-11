import java.util.HashMap;
import java.util.Map;

public class RefatoracaoApi {

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {{
           put(1, new Contato("Adrian", 355351));
           put(2 , new Contato("Jeff", 486648));
           put(3, new Contato("Kai", 776557));
           put(4, new Contato("Frank", 759573));
           put(5 ,new Contato("Kurdt", 101202));
        }};
        //System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }

}
