import java.util.ArrayList;
import java.util.List;

public class TestaStingComLambda {
    
    public static void main(String[] args) {
        
        List<String> palavras = new ArrayList<>();
        palavras.add("alura aonline");
        palavras.add("casa do codigo");
        palavras.add("caelum");
        

        System.out.println(palavras);

        //Forma de comparar com o método compare
        //palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        //Forma de comparar sem o método compare
        palavras.sort((s1, s2) -> s1.length() - s2.length());

        System.out.println(palavras);

        palavras.forEach(palavra -> System.out.println(palavra));
    }
}
