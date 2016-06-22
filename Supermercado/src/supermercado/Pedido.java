package supermercado;

import java.util.ArrayList;

public class Pedido {

    private int codigo;
    ArrayList<ItemCarrinho> itens;
    Cliente cliente;

    Pedido(ArrayList<ItemCarrinho> array, Cliente clientePedido) {
        codigo = (int) ((Math.random()) + (Math.random()) * 100);
        cliente = clientePedido;
        itens = array;
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
