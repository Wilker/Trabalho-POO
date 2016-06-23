/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author Custom
 */
public class Gerente extends Funcionario{
    Estoque estoque;
    ControleEstoque controle;
    
    
    void acessoAoEstoque(Estoque estoque){
        this.estoque = estoque;
        ControleEstoque controle = new ControleEstoque(estoque);
        this.controle = controle;
    }
}
