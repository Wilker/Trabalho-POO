package supermercado;

public class Item {
    Produto p;
    private int qtde;

    Item(Produto P, int Quantidade){
        p= P;
        qtde= Quantidade;
    }
    
    float subtotal(){
        return this.qtde * p.precoUnitario();
    }

    int getQtde() {
        return this.qtde;
    }    
}