package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

    public static void main(String[] args) {
        
        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");
        alunos.add("Vinicius");
        alunos.add("Bruno");
        alunos.add("Felipe");
        alunos.add("Rafaela");
        alunos.add("Paula");

        System.out.println(alunos.size());
        
        alunos.add("Vinicius");

        boolean adicionou = alunos.add("Vinicius");

        System.out.println("Vinicius foi adicionado ao Set? " + adicionou);

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
    
}
