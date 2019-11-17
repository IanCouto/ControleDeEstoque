/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import com.mycompany.aplicacao.Produto;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author icout
 */
public class Botoes extends TelaPrincipal{

    public Botoes() {
    }
    
    public void recuperarDaLixeira(JTable tabela){
        int limpar;
        limpar = JOptionPane.showConfirmDialog(null, "Deseja recuperar todo o conteúdo da lixeira e substituir pelo estoque?", "Limpar", JOptionPane.OK_CANCEL_OPTION);
        if (limpar == JOptionPane.OK_OPTION) {
            limpaTabela(estoque, tabela);
            estoque.recuperaLixo();
            imprimeTabela(estoque, tabela);
            atualizaJson(estoque);
        }
    }
    
    public void limparEstoque (JTable tabela){
        int limpar;
        limpar = JOptionPane.showConfirmDialog(null, "Deseja limpar todo o estoque?", "Limpar", JOptionPane.OK_CANCEL_OPTION);
        //Ok = 0, Cancel = 2
        if (limpar == JOptionPane.OK_OPTION) {
            estoque.limpaLixo();
            limpaTabela(estoque, tabela);
            estoque.limpaEstoque();
            atualizaJson(estoque);
        }
    }
    
    public void limpaLixeira (){
        int limpar;
        limpar = JOptionPane.showConfirmDialog(null, "Deseja limpar todo o lixo?", "Limpar", JOptionPane.OK_CANCEL_OPTION);
        if (limpar == JOptionPane.OK_OPTION) {
            estoque.limpaLixo();
            atualizaJson(estoque);
        }
    }
    
    public void adicionarProduto(JTable tabela, String produtoTxt, String fornecedorTxt, String precoTxt, int quantidadeTxt) throws Exception {
        for (int i = 0; i < (estoque.listaProdutos().size()); i++) {
            if (produtoTxt.equals(estoque.getProduto(i).getNome())) {
                JOptionPane.showMessageDialog(null, "Produto já cadastrado em sistema, apenas altere a quantidade.");
                throw new Exception();
            }
        }
        if (produtoTxt.equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Produto está vazio, preencha-o para prosseguir.");
            throw new Exception();
        } else if (fornecedorTxt.equals("")) {
            JOptionPane.showMessageDialog(null, "O campo fornecedor está vazio, preencha-o para prosseguir.");
            throw new Exception();
        } else if (precoTxt.equals("")) {
            JOptionPane.showMessageDialog(null, "O campo preço está vazio, preencha-o para prosseguir.");
            throw new Exception();
        } else {
            for (int i = 0; i < precoTxt.length(); i++) {
                if ((precoTxt.charAt(i) < "0".charAt(0) || precoTxt.charAt(i) > "9".charAt(0)) && precoTxt.charAt(i) != ".".charAt(0)) {
                    JOptionPane.showMessageDialog(null, "O preço inserido possui formato inválido.\nExemplo de formato correto: 25.30");
                    throw new Exception();
                }
            }
            produto = new Produto(produtoTxt, quantidadeTxt, Float.parseFloat(precoTxt), fornecedorTxt, estoque.listaProdutos().size() + 1);
            estoque.adicionaProduto(produto);
            String nome = estoque.getProduto(estoque.listaProdutos().size() - 1).getNome();
            String fornecedor = estoque.getProduto(estoque.listaProdutos().size() - 1).getFornecedor();
            Integer quantidade = estoque.getProduto(estoque.listaProdutos().size() - 1).getQuantidade();
            Float preco = estoque.getProduto(estoque.listaProdutos().size() - 1).getValor();
            Object[] row = {estoque.getProduto(estoque.listaProdutos().size() - 1).getId(), nome, fornecedor, quantidade, preco};
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.addRow(row);
            atualizaJson(estoque);
        }
    }
}
