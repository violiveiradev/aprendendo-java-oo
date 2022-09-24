package br.com.bytebank.banco.model;


public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;

    
    /** 
     * @return String
     */
    public String getNome() {
        return nome;
    }
    
    /** 
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /** 
     * @return String
     */
    public String getCpf() {
        return cpf;
    }
    
    /** 
     * @param cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    /** 
     * @return String
     */
    public String getProfissao() {
        return profissao;
    }
    
    /** 
     * @param profissao
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}