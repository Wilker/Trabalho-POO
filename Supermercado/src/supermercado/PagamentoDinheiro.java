package supermercado;

public class PagamentoDinheiro extends Pagamento{

    PagamentoDinheiro(float valor){
        super.valor = valor;
    }
    
    @Override
    public boolean Paga() {
        if (valor > 0)
            return true;
        else
            return false;
    }
    
}