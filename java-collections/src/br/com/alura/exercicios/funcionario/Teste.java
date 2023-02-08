package br.com.alura.exercicios.funcionario;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Teste {
    
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario("Barney", 21);
        Funcionario f2 = new Funcionario("Jonatan", 40);
        Funcionario f3 = new Funcionario("Guaraciara", 19);

        Set<Funcionario> funcionario = new TreeSet<>(new OrdenadorPorIdade());
        funcionario.add(f1);
        funcionario.add(f2);
        funcionario.add(f3);

        Iterator<Funcionario> iterador = funcionario.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next().getNome());
        }
    }
}
