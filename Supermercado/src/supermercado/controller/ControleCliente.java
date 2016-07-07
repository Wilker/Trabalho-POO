/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.controller;

import java.util.Scanner;
import supermercado.Cliente;
import supermercado.Estoque;
import supermercado.Login;
import supermercado.Produto;
import supermercado.Valida;
import supermercado.view.VisãoCliente;

/**
 *
 * @author wilker
 */
public class ControleCliente {

    VisãoCliente visãoCliente = new VisãoCliente();
    Scanner teclado = new Scanner(System.in);
    Cliente cliente;

    public void cadastrar() {
        String nome;
        String email;
        int cpf;
        String login;
        String senha;

        do {
            System.out.println("Informe seu nome");
            nome = teclado.nextLine();
            System.out.println("Informe seu email");
            email = teclado.next();

            System.out.println("Digite seu novo login: ");
            login = teclado.next();
            System.out.println("Login registrado!");

            System.out.println("Digite sua nova senha: ");
            senha = teclado.next();
            System.out.println("Senha registrado!");
            if (Valida.validaNome(login) || Valida.validaSenha(senha)) {
                System.out.println("Login ou senha vazios não são permitidos");
            }
        } while (Valida.validaNome(login) && Valida.validaSenha(senha));

        System.out.println("Digite seu CPF(sem traços): ");
        cpf = teclado.nextInt();

        // Login.banco.add(this);
        System.out.println("Cadastrado com sucesso!");
        System.out.println("");
    }

    //TODO corrigir case 3 e 4
    public void menuCliente(Cliente cliente) {
        VisãoCliente.menuPrincipal(this.cliente);
        Produto produto;
        int opcao = teclado.nextInt();
        switch (opcao) {
            case 1:
                produto = cliente.buscaProduto();
                int qtd = visãoCliente.diálogoDeQuantidade(); //gambi aqui depois arrumo!
                cliente.adicionarAoCarrinho(produto, qtd);
                break;
            case 2:
                cliente.listaItensCarrinho();
                String nome = visãoCliente.diálogoDeBuscaDeProduto();
                produto = cliente.pegaItemDoCarrinho(nome);
                cliente.removerDoCarrinho(produto);
                break;
            case 3:
                System.out.println("Informe o nome do produto: ");
                Produto p = Estoque.pegaProduto(teclado.next()).getProdutoEstoque();
                System.out.println("R$" + Leitor.checarPreco(p)); //FIXME
                break;

            case 4:
                System.out.println("Informe o caixa que deseja ir: ");
                System.out.println("(1)  (2)  (3)");
                irAoCaixa(teclado.nextInt());
                break;

            default:
                if (opcao == 0) {
                    System.out.println("Logout feito com sucesso.");
                } else {
                    System.out.println("Opção inválida.");
                    System.out.println("");
                }
        }
        while (opcao != 0);
    }

    public Produto pegaProdutoNoEstoque() {
        String nome = visãoCliente.diálogoDeBuscaDeProduto();
        Estoque.pegaProduto(nome);
    }
}
