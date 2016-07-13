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
     * Estoque é̶ era estático assumindo que há apenas um estoque.
     */
    private Estoque controle;

    ControleEstoque(Estoque estoque) {
        controle = estoque;
    }

    /**
     * Recebe um produto e um valor e o cadastra no estoque.
     *
     * @param nome
     * @param preco
     * @param tipo
     * @throws java.lang.Exception
     */
    public void cadastraProduto(String nome, float preco, int tipo) throws Exception {
        if (Valida.validaNome(nome) && Valida.validaPreco(preco)) {
            if (tipo > 2) {
                throw new Exception("Tipo inválido");
            }
            Produto novo;
            if (tipo == 1) {
                novo = new ProdutoQuilo(nome, preco);
                controle.cadastraNoEstoque(novo, 0);
            }
            if (tipo == 2) {
                novo = new ProdutoUnidade(nome, preco);
                controle.cadastraNoEstoque(novo, 0);
            }
        } else {
            throw new Exception("nome ou preço inválidos");
        }
    }

    public void adicionaAoEstoque(String nome, int quantidade) throws Exception {
        if (Valida.quantidade(quantidade) && Valida.validaNome(nome)) {
            controle.adicionaAoEstoque(nome, quantidade);
        } else {
            throw new Exception("Protudo ou quantidade inválidos");
        }
    }

    public void emitirRelatorioEstoque() {
        controle.relatorioEstoque();
    }
}
