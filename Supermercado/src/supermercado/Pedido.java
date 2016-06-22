package supermercado;

import java.util.ArrayList;

public class Pedido {
    private int codigo;
    ArrayList<Item> itens;
    Cliente cliente;
    
    Pedido(ArrayList<Item> array, Cliente clientePedido){
        codigo = (int) ((Math.random())+(Math.random())*100);
        cliente = clientePedido;
        itens = array;
    }
    
    float precoTotal(){
        float soma = 0;
        for (Item iten : itens) {
            soma = iten.subtotal() + soma;
        }
        return soma;
    }
    
    public void imprimeVenda(){
        int i = 0;
        System.out.println("Pedido: " + codigo);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Item    Produto   Qtde  Subtotal");
        for (Item iten : itens) {
            i++; 
            System.out.println(" " + i + "      " + iten.p.getNome() + "    " + iten.getQtde() + "   R$" + iten.subtotal());
        }
        System.out.println("Preço total: R$" + precoTotal());
    }
}