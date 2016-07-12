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

    public String[] diálogoCadastro() {
        String[] dados = new String[5];
        System.out.println("Informe seu nome");
        dados[0] = in.nextLine();
        System.out.println("Informe seu email");
        dados[1] = in.next();
        System.out.println("Digite seu novo login: ");
        dados[2] = in.next();
        System.out.println("Login registrado!");
        System.out.println("Digite sua nova senha: ");
        dados[3] = in.next();
        System.out.println("Senha registrado!");
        System.out.println("Digite seu CPF(sem traços): ");
        long cpf = in.nextLong();
        dados[4] = String.valueOf(cpf);
        return dados;
    }

    public void menuAdicionarAoCarrinho() {
    }

    public int diálogoMenuPrincipal(Cliente cliente) {

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
        return in.nextInt();
    }

    public String diálogoDeBuscaDeProduto() {
        System.out.println("Insira o nome do produto: ");
        return in.next();
    }

    public int diálogoDeQuantidade() {
        System.out.println("Insira a quantidade: ");
        int qtd = in.nextInt();
        if ( qtd > 0){
            return qtd;
        }
        else{
            System.out.println("Quantidade deve ser maior que zero.");
            return diálogoDeQuantidade();
        }
    }

    public void imprimeValorProduto(float valor) {
        System.out.println("R$" + valor);
    }

    public int diálogoDeIdaAoCaixa() {
        System.out.println("Informe o caixa que deseja ir: ");
        System.out.println("(1)  (2)  (3)");
        return in.nextInt();
    }
}
