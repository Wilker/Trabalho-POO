/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 * Classe responsável pelas validações dos cadastros.
 *
 * @author wilker
 */
public class Valida {

    /**
     * Método responsável para fazer as validações de nome de produto
     *
     * @param nome
     * @return true caso o nome seja aceitável ou false caso contrário
     */
    public static boolean validaNome(String nome) {
        if (nome == null || nome.equals("")) {
            return false;
        }
        return true;
    }

    static boolean validaPreco(float preco) {
        if (preco < 0) {
            return false;
        }
        return true;
    }

    static boolean quantidade(int quantidade) {
        if (quantidade < 0) {
            return false;
        }
        return true;
    }

    //ValidaSenha chama validaNome pois os métodos de validação sãoo mesmos
    public static boolean validaSenha(String senha) {
        return validaNome(senha);
    }
}
