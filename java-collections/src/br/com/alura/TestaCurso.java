package br.com.alura;

public class TestaCurso {

    public static void main(String[] args) {
        
        Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Revisando as ArrayLists", 21));
        javaColecoes.adiciona(new Aula("Listas de objetos", 20));
        javaColecoes.adiciona(new Aula("Relacionamento de listas e objetos", 15));


        System.out.println(javaColecoes.getAulas());

    }
}

