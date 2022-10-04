package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {
        
        Conta[] contas = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);

        ContaPoupanca cc2 = new ContaPoupanca(32, 49);

        contas[0] = cc1;
        contas[1] = cc2;

        System.out.println(contas[1].getNumero());

        Conta ref = (ContaCorrente) contas[0];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
    }
    
}
