package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas2 {

    public static void main(String[] args) {
        
        String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
        String curso2 = "Apache Camel";
        String curso3 = "Certificacao Java SE 8 Programmer I";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);        

        System.out.println(cursos);

        cursos.remove(1);
        System.out.println();
        System.out.println(cursos);

        System.out.println();
        System.out.println("O primeiro curso é : " + cursos.get(0));

        System.out.println();
        cursos.add(curso2);
        Collections.sort(cursos);
        System.out.println(cursos);
    }
    
}
