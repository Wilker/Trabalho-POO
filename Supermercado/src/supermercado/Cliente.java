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
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
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
    }

    //FIXME refatorar aqui, método remover deve apenas remover o item do carrinho. Não efetuar leitura e escrita na tela.
    public void removerDoCarrinho(Produto produto) {
        if (carrinho == null || carrinho.getCarrinho().isEmpty()) {
            System.out.println("Carrinho vazio.");
        }
        carrinho.removerDoCarrinho(produto);

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

    public Produto buscaProduto() {
        Estoque.imprimeEstoque();
        Produto produto = Estoque.pegaProduto(nome);
        return produto;
    }

    private void inicializaCarrinho() {
        this.carrinho = new Carrinho();
    }

    public void listaItensCarrinho() {
        this.carrinho.listaProdutosNoCarrinho();
    }

    public Produto pegaItemDoCarrinho(String nome) {
        return carrinho.getProdutoCarrinho(nome);
    }
}
