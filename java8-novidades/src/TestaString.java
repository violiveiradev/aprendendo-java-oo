import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TestaString {
    
    public static void main(String[] args) {
        
        List<String> palavras = new ArrayList<>();
        palavras.add("alura aonline");
        palavras.add("casa do codigo");
        palavras.add("caelum");
        

        System.out.println(palavras);

        // for (String palavra : palavras) {
        //     System.out.println(palavra);
        // }

        ComparadorPorTamanho comparador = new ComparadorPorTamanho();
        palavras.sort(comparador);

        System.out.println(palavras);

        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);


        // palavras.forEach(palavra -> System.out.println(palavra));
    }
}


class ImprimeNaLinha implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}