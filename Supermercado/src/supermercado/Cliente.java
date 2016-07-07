package supermercado;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

    Scanner teclado = new Scanner(System.in);
    private String nome;
    private String email;
    private int cpf;
    Carrinho carrinho;
    private String login;
    private String senha;

    Cliente() {
        inicializaCarrinho();
        cadastrar();
    }

    String getNome() {
        return nome;
    }

    String getLogin() {
        return login;
    }

    String getSenha() {
        return senha;
    }

    //TODO adicionar ao carrinho deve adicionar um produto.
    public void adicionarAoCarrinho(Produto produto, int qtd) {
        if (carrinho == null) {
            inicializaCarrinho();
        }
        carrinho.adicionarAoCarrinho(produto, qtd);
        
//        if (carrinho == null) {
//
//            //FIXME se carrinho for nulo faz quase tudo que faz se não for nulo. FIXED
//            ArrayList<ItemCarrinho> compras = new ArrayList<>();
//            carrinho = compras;
//        }
//        Estoque.imprimeEstoque();
//        System.out.println("Informe o nome do produto: ");
//        ProdutoEstoque p = Estoque.pegaProduto(teclado.next());
//        System.out.println("Quantidade: ");
//        int quantidade = teclado.nextInt();
//        carrinho.add(new ItemCarrinho(p, quantidade));
//
//        //FIXME remover leitura de teclado de método adicionarAoCarrinho Ele deve apenas colocar um item no carrinho.
//        System.out.println("Continuar comprando?");
//        System.out.println("1. Sim");
//        System.out.println("2. Não");
//        int opcao = teclado.nextInt();
//
//        if (opcao == 1) {
//            adicionarAoCarrinho();
//        } else if (opcao == 2) {
//            return;
//        } else {
//            System.out.println("Opção inválida. Deseja continuar comprando?");
//            opcao = teclado.nextInt(); //FIXME neste ponto ele lê porém não é utilizado o valor lido
//        }
    }

    //FIXME refatorar aqui, método remover deve apenas remover o item do carrinho. Não efetuar leitura e escrita na tela.
    public void removerDoCarrinho(Produto produto) {
        if (carrinho == null || carrinho.getCarrinho().isEmpty()) {
            System.out.println("Carrinho vazio.");
        }
        carrinho.removerDoCarrinho(produto);

//        if (carrinho == null) {
//            System.out.println("Carrinho vazio.");
//        } else {
//            System.out.println("Informe o nome do produto: ");
//            ProdutoEstoque p = Estoque.pegaProduto(teclado.next());
//            carrinho.remove(carrinho.indexOf(p));
//            System.out.println("Removido com sucesso!");
//        }
    }

    //FIXME Mover para classe de controle de cliente
    public void irAoCaixa(int opcao) {
        switch (opcao) {
            case 1:
                ListaCaixa.caixas.get(opcao - 1).receberClienteNoCaixa(this);
                break;
            case 2:
                ListaCaixa.caixas.get(opcao - 1).receberClienteNoCaixa(this);
                break;
            case 3:
                ListaCaixa.caixas.get(opcao - 1).receberClienteNoCaixa(this);
                break;
            default:
                System.out.println("Caixa inválido. Insira um válido: ");
                irAoCaixa(teclado.nextInt());
                break;
        }
    }

    //FIXME Mover para classe de controle de cliente
//    public void cadastrar() {
//        System.out.println("Informe seu nome");
//        nome = teclado.nextLine();
//
//        System.out.println("Informe seu email");
//        email = teclado.next();
//
//        System.out.println("Digite seu novo login: ");
//        login = teclado.next();
//        System.out.println("Login registrado!");
//
//        System.out.println("Digite sua nova senha: ");
//        senha = teclado.next();
//        System.out.println("Senha registrado!");
//
//        while (login.equalsIgnoreCase("") || senha.equalsIgnoreCase("")) {
//            if (login.equalsIgnoreCase("")) {
//                System.out.println("Login não deve ser vazio. Insira um válido");
//                login = teclado.nextLine();
//            }
//            if (senha.equalsIgnoreCase("")) {
//                System.out.println("Senha não deve ser vazia. Insira uma válida");
//                senha = teclado.nextLine();
//            }
//        }
//
//        System.out.println("Digite seu CPF(sem traços): ");
//        cpf = teclado.nextLong();
//
//        Login.banco.add(this);
//
//        System.out.println("Cadastrado com sucesso!");
//        System.out.println("");
//    }

    //FIXME mover menu para uma classe de menu (classes de visão)
//    public void menuPrincipal() {
//        int opcao;
//        do {
//            System.out.println("");
//            System.out.println("Bem vindo, " + nome);
//            System.out.println("O que deseja fazer?");
//            System.out.println("1. Adicionar ao carrinho");
//            System.out.println("2. Remover do carrinho");
//            System.out.println("3. Checar preço");
//            System.out.println("4. Finalizar compra");
//            System.out.println("0. Logout");
//            System.out.println("Opcao:");
//            opcao = teclado.nextInt();
//            System.out.println("");
//
//            switch (opcao) {
//                case 1:
//                    adicionarAoCarrinho();
//                    break;
//
//                case 2:
////                    removerDoCarrinho();
//                    break;
//
//                case 3:
//                    System.out.println("Informe o nome do produto: ");
//                    Produto p = Estoque.pegaProduto(teclado.next()).getProdutoEstoque();
////                    System.out.println("R$" + Leitor.checarPreco(p)); //FIXME
//                    break;
//
//                case 4:
//                    System.out.println("Informe o caixa que deseja ir: ");
//                    System.out.println("(1)  (2)  (3)");
//                    irAoCaixa(teclado.nextInt());
//                    break;
//
//                default:
//                    if (opcao == 0) {
//                        System.out.println("Logout feito com sucesso.");
//                    } else {
//                        System.out.println("Opção inválida.");
//                        System.out.println("");
//                    }
//            }
//        } while (opcao != 0);
//    }
    private void inicializaCarrinho() {
        this.carrinho = new Carrinho();
    }
}
