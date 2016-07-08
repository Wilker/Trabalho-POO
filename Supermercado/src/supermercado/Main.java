package supermercado;

import java.util.Scanner;
import supermercado.controller.ControleCliente;

public class Main {

    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario("João");
        Funcionario f2 = new Funcionario("Maria");
        Funcionario f3 = new Funcionario("José");
        Funcionario f4 = new Funcionario("Pedro");
        Funcionario f5 = new Funcionario("Ludimila");

        Caixa caixa1 = new Caixa(1, f2);
        Caixa caixa2 = new Caixa(2, f4);
        Caixa caixa3 = new Caixa(3, f3);
        Scanner teclado = new Scanner(System.in);
        Estoque e = new Estoque();
        Gerente gerente = new Gerente("Fábio");
        gerente.acessoAoEstoque(e);
        //gerente.controle.cadastraProduto("Morango", (float) 0.5);
        gerente.controle.cadastraProduto("Morango", (float) 0.5);
        gerente.controle.adicionaAoEstoque("Morango", 20);
        gerente.controle.cadastraProduto("Pêra", (float) 0.75);
        gerente.controle.adicionaAoEstoque("Pêra", 17);
        gerente.controle.cadastraProduto("Banana", (float) 1.5);
        gerente.controle.adicionaAoEstoque("Banana", 19);
        gerente.controle.cadastraProduto("Uva", (float) 2.0);
        gerente.controle.adicionaAoEstoque("Uva", 14);

        int opcao;
        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1. Login como Cliente");
            System.out.println("2. Cadastrar-se");
            System.out.println("3. Login como Gerente");
            System.out.println("0. Sair");
            System.out.println("Opcao:");
            opcao = teclado.nextInt();
            System.out.println("");

            switch (opcao) {
                case 1:
                    ControleCliente controleCliente = new ControleCliente();
                    controleCliente.menuCliente(Login.loginCliente());
                    break;

                case 2:
                    ControleCliente ctrlCliente = new ControleCliente();
                    ctrlCliente.cadastrar();
                    Cliente user1 = new Cliente();
                    break;

                case 3:
                    Login.loginGerente(gerente, e).menuPrincipal();
                    break;
                default:
                    if (opcao == 0) {
                        System.out.println("Obrigado por usar nosso sistema");
                    } else {
                        System.out.println("Opção inválida.");
                        System.out.println("");
                    }
            }
        } while (opcao != 0);
    }
}
