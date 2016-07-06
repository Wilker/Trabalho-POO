package supermercado;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<ItemCarrinho> listaCompra;

    ArrayList<ItemCarrinho> getCarrinho() {
        return listaCompra;
    }

    void adicionarAoCarrinho(Produto produto, int qtd) {
        listaCompra.add(new ItemCarrinho(produto, qtd));
    }

    void removerDoCarrinho(Produto produto) {
        for (ItemCarrinho itemCarrinho : listaCompra) {
            if (itemCarrinho.getProduto().equals(this)) {
                listaCompra.remove(itemCarrinho);
            }
        }
    }

    
    void listaProdutosNoCarrinho() {
        for (ItemCarrinho itemCarrinho : listaCompra) {
            System.out.println(itemCarrinho.getProduto().toString());
        }
    }
}
