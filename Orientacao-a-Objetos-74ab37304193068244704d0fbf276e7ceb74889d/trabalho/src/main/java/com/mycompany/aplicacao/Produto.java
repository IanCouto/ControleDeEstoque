/*
 Álvaro Domingues de Freitas     Matrícula: 201876007
 Arthur Rodrigues Fernandes      Matrícula: 201835005
 Augusto Castilho Medeiros       Matrícula: 201876044
 Ian Couto de Paula		 Matrícula: 201876002
 Matheus Henrique Rubio		 Matrícula: 201876036
 */
package com.mycompany.aplicacao;

/**
 * Usada para criar um produto.
 */
public class Produto{

    private String nome;
    private Integer id = 0;
    private Integer quantidade;
    private Float preco;
    private String fornecedor;
    /**
     * Construtor da classe Produto. inicia o objeto com todas as informações preenchidas.
     * @param nome Armazena o nome do produto.
     * @param quantidade Armazena a quatidade deste produto no estoque. (Mínimo == 0)
     * @param valor Armazena o valor do produto. (Mínimo == 0)
     * @param fornecedor Armazena o fornecedor do produto.
     * @param id Armazena o id do produto. (Primeiro id == 0)
     */
    public Produto(String nome, int quantidade, float valor, String fornecedor, Integer id) {
        this.nome = nome;
        this.id = id;
        this.quantidade = quantidade;
        this.preco = valor;
        this.fornecedor = fornecedor;
    }
    /**
     * Construtor da classe Produto. Inicia o objeto com todas as informações nulas ou iguais a 0.
     */
    public Produto() {
        this.nome = new String();
        this.id = 0;
        this.quantidade = null;
        this.preco = null;
        this.fornecedor = new String();
    }
    /**
     * @return id do produto.
     */
    public Integer getId() {
        return id;
    }
    
    /**
     * @param newId novo id do produto.
     */
    public void setId(int newId) {
        this.id = newId;
    }

    /**
     * @return nome do produto. 
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * @param newNome novo nome do produtor.
     */
    public void setNome(String newNome) {
        this.nome = newNome;
    }
    /**
     * @return quantidade do produto em estoque.
     */
    public Integer getQuantidade() {
        return quantidade;
    }
    
    /**
     * @param qtd nova quantidade do produto (maior ou igual a 0). 
     */
    public void setQuantidade(int qtd) {
        if(qtd >= 0) {
            this.quantidade = qtd;
        }
    }
    /**
     * @return preço do produto.
     */
    public Float getValor() {
        return preco;
    }

    /**
     * @param val novo valor do produto (maior que 0).
     */
    public void setValor(float val) {
        if(val > 0) {
            this.preco = val;
        }
    }
    
    /**
     * @return nome do fornecedor do produto.
     */
    public String getFornecedor(){
        return fornecedor;
    }
    
    /**
     * @param fornecedor nome do novo fornecedor do produto.
     */
    public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }

}
