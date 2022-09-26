package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class Teste {
    
    public static void main(String[] args) {
        

        Object cc = new ContaCorrente(22, 33);
        Object cp = new ContaPoupanca(31, 25);

        System.out.println(cc);
        System.out.println(cp);
    }
}
