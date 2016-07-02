/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.Scanner;

/**
 *
 * @author Custom
 */
public class Gerente extends Funcionario{
    ControleEstoque controle;

    public Gerente(String nome) {
        super(nome);
    }
    
   
    
    void acessoAoEstoque(Estoque estoque){
        ControleEstoque controle = new ControleEstoque(estoque);
        this.controle = controle;
    }
    
    void menuPrincipal() throws Exception {
        int opcao;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("");
            System.out.println("MODO GERENTE");
            System.out.println("O que deseja fazer?");
            System.out.println("1. Cadastrar novo produto");
            System.out.println("2. Repor estoque");
            System.out.println("3. Emitir relatório de venda");
            System.out.println("4. Emitir relatório de estoque");
            System.out.println("0. Logout");
            System.out.println("Opcao:");
            opcao = teclado.nextInt();
            System.out.println("");
            
            switch(opcao){
            case 1:
                System.out.println("");
                System.out.println("Novo cadastro de produto.");
                System.out.print("Produto: ");
                String produto = teclado.next();
                System.out.println("Preço: ");
                float preco = teclado.nextFloat();
                controle.cadastraProduto(produto, preco);
                break;
                
            case 2:
                System.out.println("");
                System.out.println("Reposição de produto.");
                System.out.print("Produto: ");
                String produto1 = teclado.next();
                System.out.println("Quantidade: ");
                int quantidade = teclado.nextInt();
                controle.adicionaAoEstoque(produto1, quantidade);
                break;
            
            case 3:
                HistoricoVenda.imprimeVendas();
                break;
                
            case 4:
                controle.emitirRelatorioEstoque();
                break;
            
            default:
                if(opcao == 0){
                    System.out.println("Logout feito com sucesso.");
                }else{
                System.out.println("Opção inválida.");
                System.out.println("");
                }
            }
        } while(opcao != 0);
     }
    
}