import java.util.ArrayList;
//import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

public class TestaCurso {

    public static void main(String[] args) {
    
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        
        //cursos.sort(Comparator.comparing(c -> c.getNome()));

        cursos.sort(comparing(Curso::getNome));

        System.out.println();
        cursos.stream()
            .filter(c -> c.getAlunos() >= 100)
            .mapToInt(Curso::getAlunos)
            .average()
            .getAsDouble();

       

        // cursos.stream()
        //     .filter(c -> c.getAlunos() >= 50)
        //     .map(c -> c.getAlunos())
        //     .forEach(c -> System.out.println(c));

        // cursos.stream()
        //     .filter(c -> c.getAlunos() >= 50)
        //     .map(Curso::getAlunos)
        //     .forEach(System.out::println);

        cursos.stream()
            .filter(c -> c.getAlunos() > 100)
            .findFirst()
            .ifPresent(c -> System.out.println(c.getNome()));
        
        List<Curso> cursosFiltrados = cursos.stream()
            .filter(c -> c.getAlunos() > 50)
            .collect(Collectors.toList());

        System.out.println(cursosFiltrados);
        
    }
}

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}