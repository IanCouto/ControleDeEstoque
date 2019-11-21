/*
 Álvaro Domingues de Freitas    Matrícula: 201876007
 Augusto Castilho Medeiros      Matrícula: 201876044
 Ian Couto de Paula		Matrícula: 201876002
 Matheus Henrique Rubio		Matrícula: 201876036
 */
package Classes;

public class ProdutoVendido extends Produto{
    private float descontoPorcentagem;
    private float descontoReais;
    private float valorFinalVenda;
    
    public ProdutoVendido() {
        descontoPorcentagem = 0;
        descontoReais = 0;
        valorFinalVenda = 0;
    }
    
    /**
     * Construtor da classe ProdutoVendido
     * @param nome Armazena o nome do produto.
     * @param quantidade Armazena a quatidade deste produto no estoque. (Mínimo == 0)
     * @param valor Armazena o valor do produto. (Mínimo == 0)
     * @param fornecedor Armazena o fornecedor do produto.
     * @param id Armazena o id do produto. (Primeiro id == 0)
     * @param descontoReais Armazena o valor do desconto em Reais.
     * @param descontoPrcentagem Armazena o valor do desconto em Porcentagem.
     * @param valorFinalVenda Armazena o valor final da venda.
     */
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

    /**
     * Método para obter valor do desconto em porcentagem.
     * @return Valor de desconto em porcentagem.
     */
    public Float getDescontoPorcentagem() {
        return descontoPorcentagem;
    }
    
    /**
     * Método para obter valor do desconto em reais.
     * @return Valor de desconto em reais.
     */
    public Float getDescontoReais() {
        return descontoReais;
    }
    
    /**
     * Método para obter valor final da venda.
     * @return Valor final da venda.
     */
    public Float getValorFinalVenda() {
        return valorFinalVenda;
    }

    /**
     * Método para definir o valor do desconto em porcentagem.
     * @param descontoPorcentagem Armazena o valor do desconto em porcentagem.
     */
    public void setDescontoPorcentagem(Float descontoPorcentagem) {
        this.descontoPorcentagem = descontoPorcentagem;
    }
    
    /**
     * Método para definir o valor do desconto em reais.
     * @param descontoReais Armazena o valor do desconto em reais.
     */
    public void setDescontoReais(Float descontoReais) {
        this.descontoReais = descontoReais;
    }
    
    /**
     * Método para definir o valor final da venda.
     * @param valorFinalVenda Armazena o valor final da venda.
     */
    public void setValorFinalVenda(Float valorFinalVenda) {
        this.valorFinalVenda = valorFinalVenda;
    }
    
    
}
