package supermercado;


import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private String endereco;
    ArrayList<ItemCarrinho> carrinho = new Carrinho().getCarrinho();
    
    Cliente(String nomeCliente, String addrCliente){
        nome = nomeCliente;
        endereco = addrCliente;
    }

    String getNome() {
        return nome;
    }
    
    Scanner teclado = new Scanner(System.in);
    
    public void adicionarAoCarrinho(Produto p, int quantidade){
        if (carrinho == null){
            ArrayList<ItemCarrinho> compras = new ArrayList<>();
            compras.add(new ItemCarrinho(p, quantidade));
            carrinho = compras;
        }
        else{
            carrinho.add(new ItemCarrinho(p, quantidade));
            carrinho = this.carrinho;
        }
    }
    
    public void irAoCaixa(Caixa caixa){
        Caixa caixaCliente = caixa;
        caixaCliente.receberClienteNoCaixa(this);
    }
}
