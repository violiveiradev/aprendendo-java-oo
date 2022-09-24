package br.com.bytebank.banco.model;

public class ContaCorrente extends Conta implements Tributavel{
    
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    
    /** 
     * @param valor
     * @throws SaldoInsuficienteException
     */
    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }

    
    /** 
     * @param valor
     */
    @Override
    public void deposita(double valor){
        super.saldo += valor;
    }

    
    /** 
     * @return double
     */
    @Override
    public double getValorImposto(){
        return super.saldo * 0.01;
    }
}
