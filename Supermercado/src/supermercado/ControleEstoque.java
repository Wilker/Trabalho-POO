/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 * Classe responsável por fazer a interface entre as classes que podem controlar
 * o estoque e a classe de estoque.
 *
 * @author wilker
 */
public class ControleEstoque {

    /**
     * Estoque é estático assumindo que há apenas um estoque.
     */
    private static Estoque estoque;

    /**
     * Recebe um produto e um valor e o cadastra no estoque.
     *
     * @param nome
     * @param preco
     */
    public static void cadastraProduto(String nome, float preco) throws Exception {
        if (Valida.validaNome(nome) && Valida.validaPreco(preco)) {
            //TODO definir se serão as classes ProdutoQuilo e ProtudoUnidade que serão usadas
            Produto novo = new Produto(nome, preco);
            estoque.insereNoEstoque(novo, 0);
        } else {
            throw new Exception("nome ou preço inválidos");
        }
    }

    public static void adicionaAoEstoque(Produto produto, int quantidade) throws Exception {
        if (Valida.quantidade(quantidade) && produto != null) {
            estoque.insereNoEstoque(produto, quantidade);
        }else{
            throw new Exception("Protudo ou quantidade inválidos");
        }
    }

    //TODO implementar função de dar baixa no estoque ao fim da venda.
}
