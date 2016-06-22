package supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private String endereco;
    ArrayList<Item> carrinho = new Carrinho().getCarrinho();
    
    Cliente(String nomeCliente, String addrCliente){
        nome = nomeCliente;
        endereco = addrCliente;
    }

    String getNome() {
        return nome;
    }
    
    Scanner teclado = new Scanner(System.in);
    
    public void adicionarAoCarrinho(Produto p, int quantidade){
        if ( carrinho == null){
            ArrayList<Item> compras = new ArrayList<>();
            compras.add(new Item(p, quantidade));
            carrinho = compras;
        }
        else{
            carrinho.add(new Item(p, quantidade));
            carrinho = this.carrinho;
        }
    }
    
    public void irAoCaixa(Caixa caixa){
        Caixa caixaCliente = caixa;
        System.out.println("Total a pagar: " + caixa.getPrecoTotal());
        System.out.println("Informe o quanto deseja pagar: ");
        caixaCliente.receberClienteNoCaixa(this, teclado.nextInt());
        
    }
}
