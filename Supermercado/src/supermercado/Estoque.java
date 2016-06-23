package supermercado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estoque {

    private Map<Produto, Integer> estoque;

    public Estoque() {
        estoque = new HashMap<>();
    }

    /**
     * Recebe um Produto e verifica a quantidade dele em estoque.
     *
     * @param produto
     * @return retorna a quantidade em estoque e -1 caso o produto não exista no
     * estoque
     */
    protected Integer verificaQtdDisponivel(Produto produto) {
        return estoque.get(produto);
    }

    /**
     * Recebe um Produto e verifica se existe no estoque
     *
     * @param produto
     * @return true se o produto já está no estoque e falso caso contrário
     */
    protected boolean buscaNoEstoque(Produto produto) {
        return estoque.containsKey(produto);
    }
    
    protected void insereNoEstoque(Produto produto, int quantidade){
        estoque.put(produto, quantidade);
    }
    
    public void darBaixa(ArrayList<ItemCarrinho> carrinho){
        int quantidade;
        for (int i = 0; i < carrinho.size(); i++){
            quantidade = carrinho.get(i).getQtd();
            int novaQuantidade = estoque.get(carrinho.get(i).getQtd()) - quantidade;
            estoque.remove(carrinho.get(i).getProduto());
            estoque.put(carrinho.get(i).getProduto(), novaQuantidade);
        }
    }
}
