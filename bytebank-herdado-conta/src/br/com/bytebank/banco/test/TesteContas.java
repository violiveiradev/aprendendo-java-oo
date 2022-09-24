package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;
import br.com.bytebank.banco.model.SaldoInsuficienteException;

public class TesteContas {

	
	/** 
	 * @param args
	 * @throws SaldoInsuficienteException
	 */
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);


		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(100.0);

		cc.transfere(10.0, cp);
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
	
}
