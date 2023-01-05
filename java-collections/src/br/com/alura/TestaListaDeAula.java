package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {
        
        Aula a1 = new Aula("Revisando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);


        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        // imprime o toString da classe
        // antes de ordenar:
        System.out.println(aulas);
        System.out.println();

        // ordenação como criterio ordem alfabetica
        Collections.sort(aulas);
        System.out.println();

        // depois de ordenar:
        System.out.println(aulas);
        System.out.println();

        // ordenando com criterio de tempo
        // Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        // melhor forma de ordenação
        aulas.sort(Comparator.comparing(Aula::getTempo));


        System.out.println();
        System.out.println(aulas);
    }

}

