package supermercado;

public class ItemCarrinho {

    private Produto produto;
    private int qtd;

    public ItemCarrinho(Produto produto, int qtde) {
        this.produto = produto;
        this.qtd = qtde;
    }

    float subtotal() {
        return this.qtd * produto.getPreco();
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQtd() {
        return qtd;
    }
}
