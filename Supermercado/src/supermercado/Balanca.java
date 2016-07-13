package supermercado;


public class Balanca {
    
        static float calculaValor(ItemCarrinho item){
            return item.getQtd()*item.getProduto().getPreco();
        }
    
}   