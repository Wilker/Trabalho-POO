/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.view;

/**
 * Classe responsável pela apresentação dos Menus na saída padrão
 *
 * @author wilker
 */
public class MenuInicial {

    public static void incial() {
        System.out.println("***Insira a opção desejada***");
        System.out.println("1 - Iniciar nova compra");//inicializa o carrinho
        System.out.println("2 - Listar todos os produtos");
        System.out.println("3 - Buscar produto");
        System.out.println("4 - Adicionar produto ao carrinho");
        System.out.println("5 - Remover produto do carrinho");
        System.out.println("6 - Finalizar venda");
    }
}
