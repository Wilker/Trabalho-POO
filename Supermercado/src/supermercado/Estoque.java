package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    List<Produto> estoque;
    private int qtdeEstoque;
    
    void setQtdeEstoque(int i) {
       qtdeEstoque = i;       
    }
    
    int getQtdeEstoque() {
       return qtdeEstoque;
    }
    
    Estoque(){
        this.estoque = new ArrayList<>();
    }
    
    public void adicionarAoEstoque(String nome, float preco, int qtde){
        Produto p = new Produto(nome);
        estoque.add(p);
        setQtdeEstoque(qtde);
    }
    
    }
    /*
        public void imprimeEstoque(){
        for (int i = 0; i < estoque.size(); i++){
            System.out.println(i + "  Produto: " + estoque.get(i).getNome() + "  |  " + qtdeEstoque + " unidades.");
        

    /*  public boolean temEstoque(Produto p, int qtde) {
            Item item = procurarProduto(p);
            return qtde <= item.getQuantidade();
    }   
       
        public void retiradaProduto(Produto p, int qtde){
            Item item = procuraProduto(p);
            item.incQuantidade(qtde);
    }
    
        public void entradaProduto(Produto p, int qtde){
            Item item = procuraProduto(p);
            item.decQuantidade(qtde);
    }
    
        private Item procuraProduto(Produto p);
            >>BUSCA BINÁRIA<<
    */
    
