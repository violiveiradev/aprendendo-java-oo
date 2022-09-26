package br.com.bytebank.banco.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    
    /** 
     * @param valor
     */
    @Override
    public void deposita(double valor){
        super.saldo += valor;
    }
    
    @Override
    public String toString() {
        return "ContaPoupanca, " + super.toString();
    }
}
