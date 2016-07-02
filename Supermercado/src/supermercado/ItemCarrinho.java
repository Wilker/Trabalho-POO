package supermercado;

public class ItemCarrinho {

    private ProdutoEstoque produto;
    private int qtd;
    private boolean tipo;

    public ItemCarrinho(ProdutoEstoque produto, int qtde) {
        this.produto = produto;
        this.qtd = qtde;
    }

    float subtotal() {
        return this.qtd * produto.getProdutoEstoque().getPreco();
    }

    public Produto getProduto() {
        return produto.getProdutoEstoque();
    }

    public int getQtd() {
        return qtd;
    }
}