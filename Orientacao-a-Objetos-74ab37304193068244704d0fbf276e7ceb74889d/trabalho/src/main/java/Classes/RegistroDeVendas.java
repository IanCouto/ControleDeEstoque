/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.ArrayList;

/**
 *
 * @author Ian Couto
 */
public class RegistroDeVendas {
    private final ArrayList<ProdutoVendido> vendas;

    /**
     * Construtor da classe RegistroDeVendas.
     */
    public RegistroDeVendas() {
        vendas = new ArrayList();
    }

    /**
     * Método para buscar uma venda.
     * @param i Armazena o índice a ser buscado na lista de vendas.
     * @return Um produto vendido.
     */
    public ProdutoVendido getVenda(int i) {
        return vendas.get(i);
    }

    /**
     * Método para adicionar uma venda ao registro.
     * @param produtoVendido Armazena o produto que foi vendido.
     */
    public void adicionaVenda(ProdutoVendido produtoVendido) {
        vendas.add(produtoVendido);
    }
    
    /**
     * Método para obter a lista de vendas.
     * @return Um registro de vendas.
     */
    public ArrayList<ProdutoVendido> getListaVendas(){
        return vendas;
    }
}
