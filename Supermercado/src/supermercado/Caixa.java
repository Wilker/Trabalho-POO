package supermercado;

public class Caixa {
    private int numeroCaixa;
    Funcionario funcionario;
    private float dinheiroEmCaixa;
    
    Caixa(int numero){
        this.numeroCaixa = numero;
        dinheiroEmCaixa = 150;
    }
    
    //Método Troco recebe o dinheiro a ser pago de algum pedido e retorna o troco.
    public float Troco(float dinheiroRecebido, Pedido pedido){
        if (dinheiroRecebido < pedido.precoTotal()){ //Se o dinheiro não for suficiente para pagar a compra
            System.out.println("Dinheiro insuficiente.");
        }
        else { //Caso seja suficiente...
            float troco = dinheiroRecebido - pedido.precoTotal();
            if (troco <= dinheiroEmCaixa){ //Verifica se é possível dar o troco
                dinheiroEmCaixa = dinheiroEmCaixa - troco;
                dinheiroEmCaixa = dinheiroEmCaixa + dinheiroRecebido;
                return troco;
            }
            else{ //Senão devolve o dinheiro.
                System.out.println("Troco insuficiente.");
                return dinheiroRecebido;
            }
        }
        return -1; //Valor utilizado para definir o tipo de erro impresso na tela pelo método "receberClienteNoCaixa".
    }
    
    
    
    void receberClienteNoCaixa(Cliente cliente, float pagamento){
        Pedido pedido = new Pedido(cliente.carrinho, cliente);
        System.out.println("Total a pagar: " + pedido.precoTotal());
        float troco = Troco(pagamento, pedido); //Estabelece o troco, se houver.
        if (troco == pagamento){
            return;
        }
        if (troco == -1){
            return;
        }
        if (troco < pagamento){
        pedido.imprimeVenda(); //Imprime o relatório completo da venda.
        funcionario.darBaixa(cliente.carrinho); 
        System.out.println("Troco: R$" + troco);
        System.out.println("Compra efetuada com sucesso!");
        }
    }

    float getPrecoTotal() {
        //TODO alguma forma de retornar o preço total pela classe Caixa
        return 0;
    }   
}