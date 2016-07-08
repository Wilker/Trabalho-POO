package supermercado;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<ItemCarrinho> listaCompra;

    ArrayList<ItemCarrinho> getCarrinho() {
        return listaCompra;
    }

    public Carrinho() {
        this.listaCompra = new ArrayList<ItemCarrinho>();
    }

    void adicionarAoCarrinho(Produto produto, int qtd) {
        listaCompra.add(new ItemCarrinho(produto, qtd));
    }

    void removerDoCarrinho(Produto produto) {
        ArrayList arrayList = new ArrayList();
        for (ItemCarrinho itemCarrinho : listaCompra) {
            if (itemCarrinho.getProduto().equals(produto)) {
                arrayList.add(itemCarrinho);
            }
        }
        listaCompra.removeAll(arrayList);
    }

    void listaProdutosNoCarrinho() {
        for (ItemCarrinho itemCarrinho : listaCompra) {
            System.out.println(itemCarrinho.getProduto().toString() + " - " + itemCarrinho.getQtd() + "UN.");
        }
    }

    Produto getProdutoCarrinho(String nome) {
        for (ItemCarrinho itemCarrinho : listaCompra) {
            if (itemCarrinho.getProduto().getNome().contains(nome)) {
                return itemCarrinho.getProduto();
            }
        }
        return null;
    }

}
