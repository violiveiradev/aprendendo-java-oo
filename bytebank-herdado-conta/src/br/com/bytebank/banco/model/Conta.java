package br.com.bytebank.banco.model;


public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    
    /** 
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }

        this.saldo -= valor;
    }

    
    /** 
     * @param valor
     * @param destino
     * @throws SaldoInsuficienteException
     */
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    
    /** 
     * @return double
     */
    public double getSaldo(){
        return this.saldo;
    }

    
    /** 
     * @return int
     */
    public int getNumero(){
        return this.numero;
    }

    
    /** 
     * @param numero
     */
    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    
    /** 
     * @return int
     */
    public int getAgencia(){
        return this.agencia;
    }

    
    /** 
     * @param agencia
     */
    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    
    /** 
     * @param titular
     */
    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    
    /** 
     * @return Cliente
     */
    public Cliente getTitular(){
        return this.titular;
    }

    
    /** 
     * @return int
     */
    public static int getTotal(){
        return Conta.total;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia;
    }

}