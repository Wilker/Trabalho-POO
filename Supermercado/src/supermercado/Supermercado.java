package supermercado;

import java.util.ArrayList;

public class Supermercado {

    public static void main(String[] args) {
        Estoque e = new Estoque();
        Caixa caixa1 = new Caixa(1);
        Caixa caixa2 = new Caixa(2);
        Caixa caixa3 = new Caixa(3);
        Funcionario funcionario1 = new Funcionario();
        Cliente cliente = new Cliente ("Fabricio", "Niteroi");
        Cliente cliente1 = new Cliente ("Caio", "Niteroi");
        e.adicionarAoEstoque("Morango", (float) 0.5, 20);
        e.adicionarAoEstoque("Pêra", (float) 0.75, 13);
        e.adicionarAoEstoque("Banana", (float) 1.5, 5);
        e.adicionarAoEstoque("Uva", (float) 2.0, 10);
        /*Produto p0 = new Produto("Morango", (float) 0.5);
        Produto p1 = new Produto("Pêra", (float) 0.75);
        Produto p2 = new Produto("Banana", (float) 1.5);
        Produto p3 = new Produto("Uva", (float) 2.0);
        Item i0 = new Item(e.estoque.get(0), 5);
        Item i1 = new Item(e.estoque.get(1), 3);
        Item i2 = new Item(e.estoque.get(2), 2);
        Item i3 = new Item(e.estoque.get(3), 4);
        Item[] itens = new Item[4];
        itens[0] = i0;
        itens[1] = i1;
        itens[2] = i2;
        itens[3] = i3;*/
        cliente.adicionarAoCarrinho(e.estoque.get(0),5);
        cliente.adicionarAoCarrinho(e.estoque.get(1),3);
        cliente.adicionarAoCarrinho(e.estoque.get(2),2);
        cliente.adicionarAoCarrinho(e.estoque.get(3),4);
        cliente.irAoCaixa(caixa2);
        
        cliente1.adicionarAoCarrinho(e.estoque.get(0),3);
        cliente1.adicionarAoCarrinho(e.estoque.get(1),2);
        cliente1.adicionarAoCarrinho(e.estoque.get(2),8);
        cliente1.adicionarAoCarrinho(e.estoque.get(3),5);
        cliente1.irAoCaixa(caixa1);        
        /*System.out.println(i0.subtotal());
        System.out.println(i1.subtotal());
        System.out.println(i2.subtotal());
        System.out.println(i3.subtotal());
        System.out.println(venda0.precoTotal());*/
        //venda0.imprimeVenda();
        //venda1.imprimeVenda();
        //e.imprimeEstoque();
    }
}