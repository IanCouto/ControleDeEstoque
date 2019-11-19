/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aplicacao;
import java.util.ArrayList;

/**
 *
 * @author icout
 */
public class RegistroDeVendas {
    private final ArrayList<ProdutoVendido> vendas;

    public RegistroDeVendas() {
        vendas = new ArrayList();
    }

    public ProdutoVendido getVenda(int i) {
        return vendas.get(i);
    }

    public void adicionaVenda(ProdutoVendido produtoVendido) {
        vendas.add(produtoVendido);
    }
    
    public ArrayList<ProdutoVendido> getListaVendas(){
        return vendas;
    }
}
