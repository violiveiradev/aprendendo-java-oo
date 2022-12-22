package br.com.alura.java.io.test;

import java.io.Serializable;

public class Cliente implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

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