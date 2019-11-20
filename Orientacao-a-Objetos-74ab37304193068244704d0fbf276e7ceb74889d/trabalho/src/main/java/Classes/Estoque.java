/*
Álvaro Domingues de Freitas     Matrícula: 201876007
Arthur Rodrigues Fernandes      Matrícula: 201835005
Augusto Castilho Medeiros       Matrícula: 201876044
Ian Couto de Paula		Matrícula: 201876002
Matheus Henrique Rubio		Matrícula: 201876036
*/
package Classes;
import java.util.ArrayList;
/**
 * Classe responsável por criar um estoque de produtos.
 */
public class Estoque {
    private final ArrayList<Produto> produtos;
    private final ArrayList<Produto> lixo;

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
    /**
     * Método que limpa a lixeira.
     */
    public void limpaLixo(){
        lixo.clear();
    }

    /**
     * Método que realiza a limpeza do estoque.
     */
    public void limpaEstoque(){
        for (int i = 0; i < produtos.size(); i++) {
            lixo.add(getProduto(i));
        }
        produtos.clear();
    }
    
    /**
     * Método que recupera pro estoque todo conteúdo que se encontra na lixeira.
     */
    public void recuperaLixo(){
        produtos.clear();
        for (int i = 0; i < lixo.size(); i++) {
            produtos.add(lixo.get(i));
        }
    }
   
    /** Método que retorna a lista de produtos.
     * @return Lista de produtos
     */
    public ArrayList<Produto> listaProdutos(){
        return produtos;
    }
}