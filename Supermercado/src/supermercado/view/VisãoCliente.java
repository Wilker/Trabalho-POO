/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.view;

import java.util.Scanner;
import supermercado.Cliente;

/**
 *
 * @author wilker
 */
public class VisãoCliente {

    Scanner in = new Scanner(System.in);

    public static void menuAdicionarAoCarrinho() {
    }

    public static void menuPrincipal(Cliente cliente) {

        System.out.println("");
        System.out.println("Bem vindo " + cliente.getNome());
        System.out.println("O que deseja fazer?");
        System.out.println("1. Adicionar produto ao carrinho");
        System.out.println("2. Remover item do carrinho");
        System.out.println("3. Checar preço");
        System.out.println("4. Finalizar compra");
        System.out.println("0. Logout");
        System.out.println("Opcao:");
        System.out.println("");

    }

    public String diálogoDeBuscaDeProduto() {
        System.out.println("Insira o nome do produto: ");
        return in.next();
    }

    public int diálogoDeQuantidade() {
        System.out.println("Insira a quantidade: ");
        return in.nextInt();
    }
}
