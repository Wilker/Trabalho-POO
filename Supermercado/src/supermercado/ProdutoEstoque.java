/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.Objects;

/**
 *
 * @author Custom
 */
public class ProdutoEstoque {
    Produto produto;
    private int quantidadeAtual;
    private int quantidadeInicial;
    
    ProdutoEstoque(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidadeInicial = quantidade;
        this.quantidadeAtual = quantidade;
    }
    
    public int getQuantidadeEstoque(){
        return quantidadeAtual;
    }
    
    public void setQuantidadeEstoque(int quantidade){
        this.quantidadeAtual = quantidade;
    }
    
    public void setQuantidadeInicial(int quantidade){
        this.quantidadeInicial = quantidade;
    }
    
    public Produto getProdutoEstoque(){
        return produto;
    }
    
    public int getQuantidadeInicial(){
        return quantidadeInicial;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProdutoEstoque other = (ProdutoEstoque) obj;
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }
    
}