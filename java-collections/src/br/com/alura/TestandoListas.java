package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    
    public static void main(String[] args) {
        
        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";
    
        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        // removendo elementos
        aulas.remove(0);
        System.out.println(aulas);

        // percorrendo uma lista

        // for (tipo_iteravel elemento_iteravel : iteravel)
        
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        // Acessando elementos

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é : " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula : " + aulas.get(i));
        }

        // Neste caso uma exception será lançada (IndexOutBoundsExcepiton) por estar percorrendo um index a mais "<=".

        // for (int i = 0; i <= aulas.size(); i++) {
        //     System.out.println("aula : " + aulas.get(i));
        // }

        // Mais uma forma de percorrer elementos, agora com Java 8

        aulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            System.out.println("Aula " + aula);
        });

        // Ordenando a lista

        aulas.add("Aumentando nosso conhecimento");
        Collections.sort(aulas);
        System.out.println();
        System.out.println("Depois de ordenado:");
        System.out.println(aulas);
    }
}
