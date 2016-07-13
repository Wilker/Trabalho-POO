/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.controller;

import java.util.Scanner;
import supermercado.Cliente;
import supermercado.Estoque;
import supermercado.Leitor;
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
    Leitor leitor = new Leitor();
    Cliente cliente;

    //TODO Mover para Classe de Visão
    public void cadastrar() {
        String[] dadosCliente; //índices => 0 - nome, 1 - email, 2 - login, 3 - senha, 4 - CPF
        do {
            dadosCliente = visãoCliente.diálogoCadastro();
            if (!Valida.validaNome(dadosCliente[2]) || !Valida.validaSenha(dadosCliente[3])) {
                System.out.println("Login ou senha vazios não são permitidos");//Se for trocar pra interface gráfica depois é só chamar um JOptionPane aqui
            }
        } while (!Valida.validaNome(dadosCliente[2]) || !Valida.validaSenha(dadosCliente[3]));
//                                              0 - nome, 1 - email, 2 - login, 3 - senha, 4 - CPF
        cliente = new Cliente(dadosCliente[0], dadosCliente[1], dadosCliente[2], dadosCliente[3], dadosCliente[4]);
        Login.banco.add(cliente);
        System.out.println("Cadastrado com sucesso!");//Se for trocar pra interface gráfica depois é só chamar um JOptionPane aqui
        System.out.println("");
    }

    //TODO corrigir case 3 e 4 FIXED
    public void menuCliente(Cliente cliente) {
        int opcao;
        do {
            opcao = visãoCliente.diálogoMenuPrincipal(cliente);
            Produto produto;
            String nomeProd;
            switch (opcao) {
                case 0:
                    System.out.println("Logout feito com sucesso.");
                     break;
                case 1:
                    Estoque.imprimeEstoque();
                    nomeProd = visãoCliente.diálogoDeBuscaDeProduto();
                    produto = cliente.buscaProduto(nomeProd);
                    float qtd;
                    qtd = visãoCliente.diálogoDeQuantidade();
                    cliente.adicionarAoCarrinho(produto, qtd);
                    break;
                case 2:
                    cliente.listaItensCarrinho();
                    nomeProd = visãoCliente.diálogoDeBuscaDeProduto();
                    produto = cliente.pegaItemDoCarrinho(nomeProd);
                    cliente.removerDoCarrinho(produto);
                    break;
                case 3:
                    nomeProd = visãoCliente.diálogoDeBuscaDeProduto();
                    produto = Estoque.pegaProduto(nomeProd);
                    visãoCliente.imprimeValorProduto(leitor.checarPreco(produto));
                    break;
                case 4:
                    int caixa = visãoCliente.diálogoDeIdaAoCaixa();
                    cliente.irAoCaixa(caixa);
                    cliente.inicializaCarrinho();
                    break;
                default:
                    System.out.println("Opção inválida.");//Se for trocar pra interface gráfica depois é só chamar um JOptionPane aqui
                    System.out.println("");//Se for trocar pra interface gráfica depois é só chamar um JOptionPane aqui
            }
        } while (opcao != 0);
    }

    public Produto pegaProdutoNoEstoque() {
        String nome = visãoCliente.diálogoDeBuscaDeProduto();
        return Estoque.pegaProduto(nome);
    }
}
