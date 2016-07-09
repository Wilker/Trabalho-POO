package supermercado;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private final Date data;
    private final int codigo;
    ArrayList<ItemCarrinho> itens;
    Cliente cliente;
    Caixa caixa;

    Pedido(Carrinho carrinho, Cliente clientePedido, Caixa caixa) {
        data = new Date();
        codigo = (int) ((Math.random()) + (Math.random()) * 100);
        cliente = clientePedido;
        itens = carrinho.getCarrinho();
        this.caixa = caixa;
    }

    float precoTotal() {
        float soma = 0;
        for (ItemCarrinho iten : itens) {
            soma = iten.subtotal() + soma;
        }
        return soma;
    }

    public void imprimeVenda() {
        int i = 0;
        System.out.println(data);
        System.out.println("Funcionário: " + caixa.funcionario.getNome() + "; Caixa: " + caixa.getNumeroCaixa());
        System.out.println("Pedido: " + codigo);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Item    Produto   Qtde  Subtotal");
        for (ItemCarrinho item : itens) {
            i++;
            System.out.println(" " + i + "      " + item.getProduto().getNome() + "    " + item.getQtd() + "   R$" + item.subtotal());
        }
        System.out.println("Preço total: R$" + precoTotal());
    }
}
