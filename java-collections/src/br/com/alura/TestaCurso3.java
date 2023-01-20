package br.com.alura;

public class TestaCurso3 {

    public static void main(String[] args) {
        
        Curso javaColecoes = new Curso("Testando classe Curso e Aula.", "Vinicius Oliveira");

        javaColecoes.adiciona(new Aula ("Criando TestaCurso3.java", 10));

        System.out.println(javaColecoes.getAulas());

        System.out.println(javaColecoes);
    }
    
}
