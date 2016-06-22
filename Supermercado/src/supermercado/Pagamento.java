
package supermercado;

public abstract class Pagamento {
    
    protected float valor;
    protected boolean cartao;
    
    
    float getValor(){
        return this.valor;
    }
    
    public abstract boolean Paga();
}
