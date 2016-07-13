package supermercado;

import java.util.Scanner;

public class Cliente {

    Scanner teclado = new Scanner(System.in);
    private String nome;
    private String email;
    private String cpf;
    Carrinho carrinho;
    private String login;
    private String senha;

    Cliente() {
        //inicializaCarrinho();
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

    public void adicionarAoCarrinho(Produto produto, float qtd) {
        if (carrinho.getCarrinho().isEmpty()) {
            inicializaCarrinho();
        }
        if (Estoque.verificaQtdDisponivel(produto.getNome()) >= qtd) {
            carrinho.adicionarAoCarrinho(produto, qtd);
        } else {
            System.out.println("Desculpe, não temos essa quantidade em estoque.");
        }
    }

    public void removerDoCarrinho(Produto produto) {
        if (carrinho == null || carrinho.getCarrinho().isEmpty()) {
            System.out.println("Carrinho vazio.");
        }
        carrinho.removerDoCarrinho(produto);

    }

    //FIXME Mover para classe de controle de cliente
    public void irAoCaixa(int opcao) {
        if (carrinho.getCarrinho().isEmpty()){
            System.out.println("Carrinho vazio.");
        }
        else{
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
    }

    public Produto buscaProduto(String nome) {
        Produto produto = Estoque.pegaProduto(nome);
        return produto;
    }

    public void inicializaCarrinho() {
        this.carrinho = new Carrinho();
    }

    public void listaItensCarrinho() {
        if (carrinho != null) {
            this.carrinho.listaProdutosNoCarrinho();
        }
    }

    public Produto pegaItemDoCarrinho(String nome) {
        return carrinho.getProdutoCarrinho(nome);
    }

    public Cliente(String nome, String email, String login, String senha, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        inicializaCarrinho();
    }

}
