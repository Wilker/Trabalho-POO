package supermercado;

import java.util.ArrayList;
import java.util.Scanner;

public class Caixa {
    private int numeroCaixa;
    Funcionario funcionario;
    private float dinheiroEmCaixa;
    Scanner teclado = new Scanner(System.in);
    
    
    Caixa(int numero, Funcionario funcionario){
        this.numeroCaixa = numero;
        dinheiroEmCaixa = 150;
        this.funcionario = funcionario;
        ListaCaixa.caixas.add(this);
    }
    
    //Método Troco recebe o dinheiro a ser pago de algum pedido e retorna o troco.
    public float troco(PagamentoDinheiro pagamento, Pedido pedido){
        if (pagamento.getValor() < pedido.precoTotal()){ //Se o dinheiro não for suficiente para pagar a compra
            System.out.println("Dinheiro insuficiente.");
        }
        else { //Caso seja suficiente...
            float troco = pagamento.getValor() - pedido.precoTotal();
            if (troco <= dinheiroEmCaixa){ //Verifica se é possível dar o troco
                dinheiroEmCaixa = dinheiroEmCaixa - troco;
                dinheiroEmCaixa = dinheiroEmCaixa + pagamento.getValor();
                return troco;
            }
            else{ //Senão devolve o dinheiro.
                System.out.println("Desculpe, troco insuficiente.");
                return pagamento.getValor();
            }
        }
        return -1; //Valor utilizado para definir o tipo de erro impresso na tela pelo método "receberClienteNoCaixa".
    }
    
    
    
    void receberClienteNoCaixa(Cliente cliente){
        Pedido pedido; 
        pedido = new Pedido(cliente.carrinho, cliente, this);
        
        
        pedido.imprimeVenda(); //Imprime o relatório completo da venda.
        
        System.out.println("Qual a forma de pagamento?");
        System.out.println("1. Dinheiro");
        System.out.println("2. Cartão");
        
        int opcao = teclado.nextInt();
        
        if (opcao == 1){
            System.out.println("Informe o valor a ser pago");
            Pagamento pagamento1 = new PagamentoDinheiro(teclado.nextFloat());
            float troco1 = 0;
            troco1 = troco((PagamentoDinheiro) pagamento1, pedido); //Estabelece o troco, se houver.
            if (troco1 == pagamento1.getValor()){
                return;
            }
            if (troco1 == -1){
                return;
            }
            if (troco1 < pagamento1.getValor()){
                Estoque.darBaixa(cliente.carrinho); 
                System.out.println("Troco: R$" + troco1);
                System.out.println("Compra efetuada com sucesso!");
                System.out.println("");
            }
        }
        
        if (opcao == 2){
            Pagamento pagamento2 = new PagamentoCartao(true);
            float troco2 = 0;
            Estoque.darBaixa(cliente.carrinho); 
            System.out.println("Troco: R$" + troco2);
            System.out.println("Compra efetuada com sucesso!");
            System.out.println("");
        }
        
        if (opcao != 1 && opcao != 2){
            System.out.println("Opção inválida.");
        }
        
        HistoricoVenda.vendas.add(pedido);
    }

    float getPrecoTotal() {
        //TODO alguma forma de retornar o preço total pela classe Caixa
        return 0;
    }
     int getNumeroCaixa(){
         return numeroCaixa;
     }
    
}