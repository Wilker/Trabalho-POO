package supermercado;

public class ItemCarrinho {

    private Produto produto;
    private float qtd;
//    private boolean tipo;

    public ItemCarrinho(Produto produto, int qtde) {
        this.produto = produto;
        this.qtd = qtde;
    }

    public float subtotal() {
        if(produto instanceof ProdutoQuilo){
         return Balanca.calculaValor(this);
        } 
        return this.qtd * produto.getPreco();
    }

    public Produto getProduto() {
        return produto;
    }

    public float getQtd() {
        return qtd;
    }
}