package supermercado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estoque {

    static ArrayList<ProdutoEstoque> estoque = new ArrayList<>();

    public Estoque() {
        
    }

    /**
     * Recebe um nome de um Produto e verifica a quantidade dele em estoque.
     *
     * @param nome
     * @return retorna a quantidade em estoque e -1 caso o produto não exista no
     * estoque
     */
    protected Integer verificaQtdDisponivel(String nome) {
        for (ProdutoEstoque estoque : estoque) {
                if (nome.equalsIgnoreCase(estoque.produto.nome)) {
                    return estoque.getQuantidadeEstoque();
                }
        }
        return -1;
    }

    /**
     * Recebe um Produto e verifica se existe no estoque
     *
     * @param produto
     * @return true se o produto já está no estoque e falso caso contrário
     */
    static boolean buscaProduto(String nome){
        for (int i=0; i < estoque.size(); i++){
            if (nome.equalsIgnoreCase(estoque.get(i).getProdutoEstoque().getNome()))
                return true;
        }
        return false;
    }
    
    static ProdutoEstoque pegaProduto(String nome){
        for (int i=0; i < estoque.size(); i++){
            if (nome.equalsIgnoreCase(estoque.get(i).getProdutoEstoque().getNome()))
                return estoque.get(i);
        }
        System.out.println("Produto não encontrado");
        return null;
    }
    
    protected void cadastraNoEstoque(Produto produto, int quantidade){
        ProdutoEstoque pe = new ProdutoEstoque(produto, quantidade);
        estoque.add(pe);
    }
    
    static void darBaixa(ArrayList<ItemCarrinho> carrinho){
        int quantidade;
        for (int i = 0; i < carrinho.size(); i++){
            if (buscaProduto(carrinho.get(i).getProduto().getNome()) == true){
                quantidade = carrinho.get(i).getQtd();
                int novaQuantidade = estoque.get(i).getQuantidadeEstoque() - quantidade;
                pegaProduto(carrinho.get(i).getProduto().getNome()).setQuantidadeEstoque(novaQuantidade);
            }
        }
    }
    
    public void relatorioEstoque(){
        System.out.println("RELATÓRIO DE ESTOQUE:");
        System.out.println("");
        for (ProdutoEstoque estoque1 : estoque) {
            System.out.println("Produto: " + estoque1.produto.getNome());
            System.out.println("Quantidade inicial: " + estoque1.getQuantidadeInicial());
            System.out.println("Quantidade atual: " + estoque1.getQuantidadeEstoque());
            System.out.println("Vendas: " + (estoque1.getQuantidadeInicial() - estoque1.getQuantidadeEstoque()));
            System.out.println("");
        }
    }

    static void imprimeEstoque(){
        System.out.println("Produtos à venda");
        System.out.println("");
        for (int i = 0; i < estoque.size(); i++){    
            System.out.println("Produto: " + estoque.get(i).getProdutoEstoque().getNome());
            System.out.println("Preço: R$" + estoque.get(i).getProdutoEstoque().getPreco());
            System.out.println("");
        }
        System.out.println("");
    }
    
}