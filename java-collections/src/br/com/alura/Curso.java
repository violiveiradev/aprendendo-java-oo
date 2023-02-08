package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

    private String nome;
    private String instrutor;
    private int tempoTotal; // Inserindo variavel para soma de tempo (1 maneira)
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
    
    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
        this.tempoTotal += aula.getTempo(); // (1 maneira)
    }

    public int getTempoTotal() {
        //return this.aulas.stream().mapToInt(Aula::getTempo).sum(); // (3 maneira) 
        return this.tempoTotal; //(1 maneira)
    }

    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    // (2 maneira)

    // public int getTempoTotal() {
    //     int tempoTotal = 0;
    //     for (Aula aula : aulas) {
    //         tempoTotal += aula.getTempo();
    //     }
    //     return tempoTotal;
    // }

    @Override
    public String toString() {
        return "[Curso: " + this.getNome() + " | " + "Instrutor: " + this.getInstrutor() + " | " + "Tempo de Curso: " + this.getTempoTotal() + " minutos" + "]";
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int numero) {
        return this.matriculaParaAluno.get(numero);
    }
    
}
