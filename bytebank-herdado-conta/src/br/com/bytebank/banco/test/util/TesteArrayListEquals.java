package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class TesteArrayListEquals {
    
    public static void main(String[] args) {
        
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(22, 11);

        Conta cc2 = new ContaCorrente(22, 11);

        lista.add(cc1);

        boolean existe = lista.contains(cc2);

        System.out.println("Já existe? " + existe);

        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
