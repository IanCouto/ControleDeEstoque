/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aplicacao;

/**
 *
 * @author icout
 */
public class ProdutoVendido extends Produto{
    private float descontoPorcentagem;
    private float descontoReais;
    private float valorFinalVenda;
    
    public ProdutoVendido() {
        descontoPorcentagem = 0;
        descontoReais = 0;
        valorFinalVenda = 0;
    }
    
    public ProdutoVendido(String nome, int quantidade, float valor, String fornecedor, Integer id, float descontoReais, float descontoPrcentagem, float valorFinalVenda) {
        setNome(nome);
        setId(id);
        setQuantidade(quantidade);
        setValor(valor);
        setFornecedor(fornecedor);
        this.descontoPorcentagem = descontoPrcentagem;
        this.descontoReais = descontoReais;
        this.valorFinalVenda = valorFinalVenda;
    }

    public Float getDescontoPorcentagem() {
        return descontoPorcentagem;
    }

    public Float getDescontoReais() {
        return descontoReais;
    }

    public Float getValorFinalVenda() {
        return valorFinalVenda;
    }

    public void setDescontoPorcentagem(Float descontoPorcentagem) {
        this.descontoPorcentagem = descontoPorcentagem;
    }

    public void setDescontoReais(Float descontoReais) {
        this.descontoReais = descontoReais;
    }

    public void setValorFinalVenda(Float valorFinalVenda) {
        this.valorFinalVenda = valorFinalVenda;
    }
    
    
}
