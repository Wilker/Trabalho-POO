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
    protected int verificaQtdDisponivel(Produto produto) {
        return estoque.getOrDefault(produto, -1);
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
}
