package supermercado;

import java.util.ArrayList;

public class Supermercado {

    public static void main(String[] args) {
        Estoque e = new Estoque();
        e.adicionarAoEstoque("Morango", (float) 0.5, 20);
        e.adicionarAoEstoque("Pêra", (float) 0.75, 13);
        e.adicionarAoEstoque("Banana", (float) 1.5, 5);
        e.adicionarAoEstoque("Uva", (float) 2.0, 10);
        
        Caixa caixa1 = new Caixa(1);
        Caixa caixa2 = new Caixa(2);
        Caixa caixa3 = new Caixa(3);
        
        Funcionario funcionario1 = new Funcionario();
        
        Cliente cliente = new Cliente ("Fabricio", "Niteroi");
        Cliente cliente1 = new Cliente ("Caio", "Niteroi");
        
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
    }
}
