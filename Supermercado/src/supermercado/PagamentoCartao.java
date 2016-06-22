package supermercado;

public class PagamentoCartao extends Pagamento{

    PagamentoCartao(boolean cartao){
        super.cartao = cartao;
    }
    
    @Override
    public boolean Paga() {
        if (cartao == true)
            return true;
        else
            return false;
    }
    
}
