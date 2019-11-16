/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;
import javax.swing.JTable;

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
    
}
