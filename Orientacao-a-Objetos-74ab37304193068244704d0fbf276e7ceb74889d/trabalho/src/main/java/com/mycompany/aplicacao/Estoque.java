/*
Álvaro Domingues de Freitas     Matrícula: 201876007
Arthur Rodrigues Fernandes      Matrícula: 201835005
Augusto Castilho Medeiros       Matrícula: 201876044
Ian Couto de Paula		Matrícula: 201876002
Matheus Henrique Rubio		Matrícula: 201876036
*/
package com.mycompany.aplicacao;
import java.util.ArrayList;
/**
 * Classe responsável por criar um estoque de produtos.
 */
public class Estoque {
    private ArrayList<Produto> produtos;
    private ArrayList<Produto> lixo;

    public Estoque() {
        this.produtos = new ArrayList();
        this.lixo = new ArrayList();
    }

    /** Método que adiciona um produto ao estoque.
     * @param produto Produto a ser adicionado ao estoque.
     */
    public void adicionaProduto(Produto produto){
        produtos.add(produto);
    }
   /** Método que retorna o produto do índice correspondente
     * @param indice Posição do produto na lista.
     * @return Produto localizado no indice recebido como parâmetro.
    */
    public Produto getProduto (int indice){
        return produtos.get(indice);
    }
    
    /** Método que remove o produto no estoque com o nome correspondente.
     * @param nome Nome do produto a ser removido.
     */
    public void removeProdutoNome(String nome){
        for(int i = 0; i < produtos.size(); i++ ){
            if(produtos.get(i).getNome().equals(nome)){
                lixo.add(produtos.get(i));
                produtos.remove(i);
            }
        }
    }

    /** Método que remove os produtos no estoque com a quantidade correspondente.
     * @param quantidade Parâmetro que verifica a quantidade de um produto no estoque.
     */
    public void removeProdutoQuantidade(Integer quantidade){
        for(int i = 0; i < produtos.size(); i++ ){
            if(produtos.get(i).getQuantidade() == quantidade){
                lixo.add(produtos.get(i));
                produtos.remove(i);
            }
        }
    }
  
    public void limpaLixo(){
        lixo.clear();
    }

    public void limpaEstoque(){
        for (int i = 0; i < produtos.size(); i++) {
            lixo.add(getProduto(i));
        }
        produtos.clear();
    }
    
    public void recuperaLixo(){
        produtos.clear();
        for (int i = 0; i < lixo.size(); i++) {
            produtos.add(lixo.get(i));
        }
    }
   
    public ArrayList<Produto> listaProdutos(){
        return produtos;
    }
    
}
