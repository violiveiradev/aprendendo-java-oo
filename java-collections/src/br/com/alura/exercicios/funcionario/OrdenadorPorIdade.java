package br.com.alura.exercicios.funcionario;

import java.util.Comparator;

public class OrdenadorPorIdade implements Comparator<Funcionario>{

    @Override
    public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
        return funcionario.getIdade() - outroFuncionario.getIdade();
    }


}
